import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 * @author Yudhishthir Singh. Bangalore. 2020
 */

//This class is of generic type T
//The resultant heap will be of type max heap in this class
public class Heap<T extends Comparable<T>> {
    //This arraylist holds all the items that are entered by the user
    private ArrayList<T> items;
    public Heap() {
        //initialising the arraylist in the constructor
        items = new ArrayList<T>();
    }

    private void siftup() {
        //find the last index in the arraylist:
        int k = items.size() - 1;

        while(k > 0) {
            //index of the parent
            int p = (k - 1) / 2;

            //element at index k:
            T item = items.get(k);
            //parent of that item
            T parent = items.get(p);

            //check if the parent is smaller than the child:
            if(item.compareTo(parent) > 0) {
                //then we swap
                items.set(k, parent);
                items.set(p, item);
                k = p;
            }else{
                break;
            }
        }
    }

    //A simple public function to insert an element into the heap
    public void insert(T item) {
        items.add(item);
        siftup();
    }

    //-----------------------------Deletion/siftDown below----------------------

    private void siftDown() {
        //starts from zero and goes upto the end
        int k = 0;
        int l = 2*k + 1; //this should be the left child of element at index k
        while(l < items.size()) { //until the the left child is in bounds of the arraylist
            int max = l; //currently assuming that the left child is the max among both the children
            int r = max + 1; //this should be the right child

            if(r < items.size()) { //checking if the right child exists
                if(items.get(r).compareTo(items.get(max)) > 0) {
                    //if the right item exists and is greater than the current max:
                    max++;
                }
            }
            //variable max should hold the value of the greater child by now
            if(items.get(max).compareTo(items.get(k)) > 0) {
                //the item at the index max is greater than the parent
                //swap
                T temp = items.get(max);
                items.set(max, items.get(k));
                items.set(k, temp);
                k = max;
                l = 2*k + 1;
            }else {
                break;
            }
        }
    }

    public T delete() throws NoSuchElementException {
        if(items.size() == 0) {
            throw new NoSuchElementException();
        }
        if(items.size() == 1) {
            return items.remove(0);
        }
        T hold = items.get(0);
        items.set(0, items.remove(items.size() - 1));
        siftDown();
        return hold;
    }


}

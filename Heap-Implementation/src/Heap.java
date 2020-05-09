/**
 * @author Yudhishthir Singh. Bangalore. 2020
 */

//This class is of generic type T
//The resultant heap will be of type max heap in this class
public class Heap<T extends Comparable<T>> {
    //This arraylist holds all the items that are entered by the user
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

            //check if the parent is smalled that the child:
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






}

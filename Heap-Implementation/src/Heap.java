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

    //-----------------------------Deletion/siftDown below----------------------

    priavate void siftdown() {
        int k = 0;
        //index of first/left child of element at k should be 2k + 1
        int l = 2*k + 1;
        while(l < items.size()) {
            //we need the max item out of both the children of the parent, for now let's assign the max to the left child.
            int max = l;
            int r = max + 1;

            //check if there is a right child to that parent:
            if(r < items.size()) { // if it is in bounds means that a child exists
                if (items.get(r).compareTo(items.get(l)) > 0) { //comparing both the children for finding which is greater.
                    max++;
                }
            }

            if(items.get(k).compareTo(items.get(max)) < 0) {
                //swap the items:
                T temp = items.get(k);
                items.set(k, items.get(max));
                items.set(max, temp);
                k = max;
                l = 2*k + 1;
            }else{
                break;
            }

        }
    }






}

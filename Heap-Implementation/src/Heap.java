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
        int k = items.size() - 1; // k goes upto the last index of the arraylist
        while(k > 0) {
            //p is the index of parent of item at index k
            int p = (k - 1) / 2;
            int parent = items.get(p);
            int item = items.get(k);

            if(parent < item) {
                //swap the item with its parent
                items.set(p, parent);
                items.set(k, item);
                k = p;
            }else{
                break;
            }
        }
    }




}

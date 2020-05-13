/**
 * @author Yudhishthir Singh. Bangalore. 2020
 */

//This file contains the full implementation of the Binary Tree, a Node must be created using the constructor and operations can be performed on the created node.
public class Node {
    Node left;
    Node right;
    int data;

    //Constructor for created the first item of the binary tree, and this node represents the value of field 'data'
    Node(int data) {
        this.data = data;
    }

    //Function to insert items in the tree:
    //The function takes a value which the new node will represent
    public void insert(int value) {
        if(value <= data) { //if the new value is lesser than the root, it goes to the left of it...
            if(left == null) {
                left = new Node(value);
            }else{ //if there are items on the left of the root, make recursive calls until you find null
                left.insert(value);
            }
        } else { //the value is greater than the variable data
            if(right == null) {
                right = new Node(value);
            }else{
                right.insert(value);
            }
        }
    }

    public boolean contains(int value) {
        //if we have found the value, return true
        if(data == value) return true;
        //if value is less than the root then check the left side for the value, if we hit null, then return false else make recursive calls until null or the value is found
        else if(value < data) {
            if(left == null) return false;
            else left.contains(value);
        }else{
            if(right == null) return false;
            else right.contains(value);
        }
        return true;
    }

    /*
    * TALKING ABOUT TRAVERSAL
    * There can be three types of traversals in Binary trees,
    *  --> Pre Order Traversal
    *  --> In Order Traversal
    *  --> Post Order Traversal
    *
    * The order of going to the node changes in all three, there is an example of in order traversing and printing the node items below:
    */

    public void printItems() {
        //first left node, then root node then right node...
        if(left != null) left.printItems();
        System.out.println(data);
        if(right != null) right.printItems();
    }

}


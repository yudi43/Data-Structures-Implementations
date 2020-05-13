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

    //function to insert items in the tree:
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

}


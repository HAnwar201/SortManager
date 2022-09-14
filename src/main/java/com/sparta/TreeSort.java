package com.sparta;

public class TreeSort implements SorterI {

Node node;
    @Override
    public int[] sortArray(int[] arrayToSort) {
        btree start = new btree();
        for(int i = 0; i < arrayToSort.length; i++)
        {
           start.add(new Node(),arrayToSort[i]);
           start.inorderRec(n);
        }
        return;
    }


class btree{
       void add(Node start, int data){
            if (start.data > data){
                if (start.left == null){
                    start.left = new Node(data);
                }
                else {
                    add(start.left, data);
                }
            }
            else if(start.data < data){
                if (start.right == null){
                    start.right = new Node(data);
                }
                else {
                    add(start.right,data);
                }
            }
        }

    void inorderRec(Node root)
    {
        if (root != null)
        {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }
    }





}
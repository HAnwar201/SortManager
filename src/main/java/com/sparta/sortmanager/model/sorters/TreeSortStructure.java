package com.sparta.sortmanager.model.sorters;

import java.util.ArrayList;

public class TreeSortStructure{
    Node root;
    void add(int data) {
        Node start = new Node(data);
        if (root == null) {
            root = start;
        } else {
            Node focusNode = root;
            Node parent;
            while (true) {
                parent = focusNode;
                if (data < focusNode.data) {
                    focusNode = focusNode.left;
                    if (focusNode == null) {
                        parent.left = start;
                        return;
                    }

                } else {
                    focusNode = focusNode.right;
                    if (focusNode == null) {
                        parent.right = start;
                        return;
                    }
                }
            }

        }
    }

    public int[] inorderRec(Node root, ArrayList<Integer> num)
    {


        if (root != null)
        {
            inorderRec(root.left,num);
            //for (int i=0;i<9;i++) {
            num.add(root.data);

            // }
            // System.out.print(root.data);
            inorderRec(root.right,num);
        }

        int[] sorted = num.stream().mapToInt(i -> i).toArray();

        return sorted;
    }


}

package com.sparta.sortmanager.model;

import com.sparta.sortmanager.main.SorterI;
import com.sparta.sortmanager.model.sorters.BubbleSort;
import com.sparta.sortmanager.model.sorters.MergeSort;
import com.sparta.sortmanager.model.sorters.TreeSort;
import com.sparta.sortmanager.model.sorters.TreeSortStructure;

public class Factory {

    public SorterI getInstance(int choice){

        if (choice == 1){
            System.out.println("You chose Bubble Sort!");
          return new BubbleSort();
        }
        if (choice == 2){
            System.out.println("You chose Merge Sort!");
         return new MergeSort();
        }
        if (choice == 3){
            System.out.println("You chose Binary Tree Sort!");
         return new TreeSort();
        }


else return null;
    }
}

package com.sparta;

import java.util.Arrays;

public class SortManager {

    public int[] displayRandomArray(int arraySize){
       GenerateArray array = new GenerateArray();
       int[] random = array.generate(arraySize);
        System.out.println("Your random array is- "+ Arrays.toString(random));
 return random;
    }

    public int[] choiceManager(int choice, int[] arraySort){
        long startTime;
        long endTime;
        long totalTime;
        if (choice == 1){
            System.out.println("You chose Bubble Sort!");
            BubbleSort bubble = new BubbleSort();
             startTime = System.nanoTime();
            bubble.sortArray(arraySort);
             endTime = System.nanoTime();
            totalTime = endTime - startTime;
            System.out.println("The sort time is: " + totalTime + " Nanoseconds");


        }
        if (choice == 2){
            System.out.println("You chose Merge Sort!");
            BubbleSort merge = new BubbleSort();
            startTime = System.nanoTime();
            merge.sortArray(arraySort);
            endTime = System.nanoTime();
             totalTime = endTime - startTime;
            System.out.println("The sort time is: " + totalTime + " Nanoseconds");
        }
        if (choice == 3){
            System.out.println("You chose Binary Tree Sort!");
            TreeSort tree = new TreeSort();
            startTime = System.nanoTime();
            tree.sortArray(arraySort);
            endTime = System.nanoTime();
            totalTime = endTime - startTime;
            System.out.println("The sort time is: " + totalTime + " Nanoseconds");
        }

        return arraySort;
    }



}

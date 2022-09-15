package com.sparta;

import java.util.Arrays;
import java.util.Scanner;

public class DisplayManager {
    SortManager manage = new SortManager();
    Scanner scanner = new Scanner(System.in);
    public void displayStart() {


        System.out.println("welcome to the program, please enter the size of an array to sort: ");
        try {
            int arraySize = scanner.nextInt();
            int[] arrayToSort = manage.displayRandomArray(arraySize);
            choice(arrayToSort);
        } catch (Exception e) {
            System.out.println("Please enter a valid number");
        }
    }

        public void choice(int[] a) {
            System.out.println("Please select which sorting method you would like to use.");
            System.out.println("Type 1 for Bubble sort:");
            System.out.println("Type 2 for Merge sort:");
            System.out.println("Type 3 for Binary Tree sort:");
            System.out.println("What method would you like to use?:");
            try {

                int choice = scanner.nextInt();
                while (choice <1 || choice >3){
                    System.out.println("Please enter a valid number");
                     choice = scanner.nextInt();
                     if(choice >1 && choice <3){
                         break;
                     }
                }

                displayResult(manage.choiceManager(choice,a));

            } catch (Exception e) {
                System.out.println("Please enter a valid option");
            }
        }
public void displayResult(int[] sorted){
    System.out.println("Your Sorted array- ");
    System.out.println(Arrays.toString(sorted));

}
    }




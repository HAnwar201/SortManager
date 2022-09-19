package com.sparta.sortmanager.view;

import com.sparta.sortmanager.controller.SortManager;
import com.sparta.sortmanager.main.Starter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.Scanner;

public class DisplayManager {
    public static Logger logger= LogManager.getLogger(Starter.class);
    SortManager manage = new SortManager();
    Scanner scanner = new Scanner(System.in);
    public void displayStart() {
        logger.trace("Program has started");

        System.out.println("welcome to the program, please enter the size of an array to sort: ");
        try {
            int arraySize = scanner.nextInt();
            logger.warn("Array size is "+ arraySize);
            if (arraySize < 0) {
                throw new IllegalArgumentException();
            }
            int[] arrayToSort = manage.displayRandomArray(arraySize);
            choice(arrayToSort);
        }
        catch (IllegalArgumentException e) {
            logger.error(e.getMessage(),e);
            System.out.println("Only Positive Numbers");
        }
        catch (Exception e){
            logger.error(e.getMessage(),e);
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

                if (choice < 0) {
                    throw new IllegalArgumentException();
                }
                while (choice <1 || choice >4){
                    System.out.println("Please enter a valid number");
                     choice = scanner.nextInt();
                     if(choice >1 && choice <4){
                         break;
                     }
                }
                long startTime;
                long endTime;
                long totalTime;
                startTime = System.nanoTime();
                displayResult(manage.choiceManager(choice,a));
                endTime = System.nanoTime();
                totalTime = endTime - startTime;
                System.out.println("The sort time is: " + totalTime + " Nanoseconds");

            }catch (IllegalArgumentException e){
                System.out.println("Please enter a valid number");
                logger.error(e.getMessage(),e);
            }

            catch (Exception e) {
                System.out.println("Please enter a valid number");
                logger.error(e.getMessage(),e);
            }
        }
public void displayResult(int[] sorted){
    System.out.println("Your Sorted array- ");
    System.out.println(Arrays.toString(sorted));
    logger.trace("Program has ended");
}
    }




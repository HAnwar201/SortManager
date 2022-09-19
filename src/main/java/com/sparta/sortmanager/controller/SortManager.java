package com.sparta.sortmanager.controller;

import com.sparta.sortmanager.model.Factory;
import com.sparta.sortmanager.model.sorters.BubbleSort;
import com.sparta.sortmanager.model.sorters.MergeSort;
import com.sparta.sortmanager.model.sorters.TreeSort;
import com.sparta.sortmanager.utils.GenerateArray;
import com.sparta.sortmanager.main.SorterI;

import java.util.Arrays;

public class SortManager {

    public int[] displayRandomArray(int arraySize){
       GenerateArray array = new GenerateArray();
       int[] random = array.generate(arraySize);
        System.out.println("Your random array is- "+ Arrays.toString(random));
 return random;
    }

    public int[] choiceManager(int choice, int[] arraySort){


        Factory factory = new Factory();
        SorterI sort = factory.getInstance(choice);



        return sort.sortArray(arraySort);
    }

}

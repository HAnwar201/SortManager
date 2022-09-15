package com.sparta;

import java.util.Random;

public class GenerateArray
{

    public int[] generate(int arraySize){
        Random rand = new Random();
        int[] arraySort = new int[arraySize];
        for (int i= 0; i<arraySize;i++){
            arraySort[i]=rand.nextInt(1000);
        }
        return arraySort;

    }

}

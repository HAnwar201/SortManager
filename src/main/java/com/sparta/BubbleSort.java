package com.sparta;

import java.util.Arrays;

public class BubbleSort implements SorterI{

    @Override
    public int[] sortArray(int[] arrayToSort) {

        int n = arrayToSort.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arrayToSort[j] > arrayToSort[j + 1]) {
                    int temp = arrayToSort[j];
                    arrayToSort[j] = arrayToSort[j + 1];
                    arrayToSort[j + 1] = temp;
                }
        return arrayToSort;

    }
}

package com.sparta;

import java.util.Arrays;

public class MergeSort implements SorterI {
    @Override
    public int[] sortArray(int[] arrayToSort) {
        int inputLength = arrayToSort.length;
        if (inputLength < 2) {
            return arrayToSort;
        }
        int midIndex = inputLength / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[inputLength - midIndex];

        for (int i = 0; i < midIndex; i++) {
            leftHalf[i] = arrayToSort[i];
        }
        for (int i = midIndex; i < inputLength; i++) {
            rightHalf[i - midIndex] = arrayToSort[i];
        }


        sortArray(leftHalf);
        sortArray(rightHalf);

        merge(arrayToSort, leftHalf, rightHalf);


        return arrayToSort;
    }

    private void merge(int[] arrayToSort, int[] leftHalf, int[] righHalf) {
        int leftSize = leftHalf.length;
        int rightSize = righHalf.length;

        int i = 0, j = 0, k = 0;
        while (i < leftSize && j < rightSize) {
            if (leftHalf[i] <= righHalf[j]) {
                arrayToSort[k] = leftHalf[i];
                i++;
            } else {
                arrayToSort[k] = righHalf[j];
                j++;
            }
            k++;
        }
        while (i < leftSize) {
            arrayToSort[k] = leftHalf[i];
            i++;
            k++;
        }
        while (j < rightSize) {
            arrayToSort[k] = righHalf[j];
            j++;
            k++;

        }

    }
}

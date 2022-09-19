package com.sparta.sortmanager.model.sorters;

import com.sparta.sortmanager.main.SorterI;
import com.sparta.sortmanager.main.Starter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BubbleSort implements SorterI {
    public static Logger logger= LogManager.getLogger(Starter.class);
    @Override
    public int[] sortArray(int[] arrayToSort) {
    logger.warn("you are in the bubble sort class");
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

package com.sparta.sortmanager.model.sorters;

import com.sparta.sortmanager.main.SorterI;
import com.sparta.sortmanager.main.Starter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

public class TreeSort implements SorterI {

    public static Logger logger= LogManager.getLogger(Starter.class);

    @Override
    public int[] sortArray(int[] arrayToSort) {

        logger.warn("you are in the tree sort class");

        ArrayList<Integer> nums = new ArrayList<Integer>();

        TreeSortStructure start = new TreeSortStructure();
        for(int i = 0; i < arrayToSort.length; i++)
        {
           start.add(arrayToSort[i]);

        }

        return start.inorderRec(start.root,nums);


    }
}
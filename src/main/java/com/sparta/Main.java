package com.sparta;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] og = {25,3,5,9,4,7,-9,230,35,12};
        BubbleSort sort = new BubbleSort();
        sort.sortArray(og);
        MergeSort merge = new MergeSort();
        System.out.println(Arrays.toString(merge.sortArray(og)));
        TreeSort tree = new TreeSort();
        tree.sortArray(og);

    }
}
package com.sparta.sortmanager;

import com.sparta.sortmanager.model.sorters.BubbleSort;
import com.sparta.sortmanager.model.sorters.MergeSort;
import com.sparta.sortmanager.model.sorters.TreeSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    @DisplayName("Testing Bubble Sort")
    void testBubbleSort() {
        int[] test1 = {3,5,4,6};
        int[] test2 = {6,5};
        int[] test3 = {5,9,4,7,-9,230,12};
        int[] test4 = {7};
        int[] test5 = {8,8,8,8,8};
        BubbleSort sort = new BubbleSort();
        Assertions.assertArrayEquals(new int[]{3,4,5,6},sort.sortArray(test1));
        Assertions.assertArrayEquals(new int[]{5,6},sort.sortArray(test2));
        Assertions.assertArrayEquals(new int[]{-9,4,5,7,9,12,230},sort.sortArray(test3));
        Assertions.assertArrayEquals(new int[]{7},sort.sortArray(test4));
        Assertions.assertArrayEquals(new int[]{8,8,8,8,8},sort.sortArray(test5));
    }

    @Test
    @DisplayName("Testing Merge Sort")
    void testMergeSort() {
        int[] test1 = {3,5,4,6};
        int[] test2 = {6,5};
        int[] test3 = {5,9,4,7,-9,230,12};
        int[] test4 = {7};
        int[] test5 = {8,8,8,8,8};
        MergeSort sort = new MergeSort();
        Assertions.assertArrayEquals(new int[]{3,4,5,6},sort.sortArray(test1));
        Assertions.assertArrayEquals(new int[]{5,6},sort.sortArray(test2));
        Assertions.assertArrayEquals(new int[]{-9,4,5,7,9,12,230},sort.sortArray(test3));
        Assertions.assertArrayEquals(new int[]{7},sort.sortArray(test4));
        Assertions.assertArrayEquals(new int[]{8,8,8,8,8},sort.sortArray(test5));

    }

    @Test
    @DisplayName("Testing Binary Sort")
    void testTreeSort() {
        int[] test1 = {3,5,4,6};
        int[] test2 = {6,5};
        int[] test3 = {5,9,4,7,-9,230,12};
        int[] test4 = {7};
        int[] test5 = {8,8,8,8,8};
        TreeSort tree = new TreeSort();
        Assertions.assertArrayEquals(new int[]{3,4,5,6},tree.sortArray(test1));
        Assertions.assertArrayEquals(new int[]{5,6},tree.sortArray(test2));
        Assertions.assertArrayEquals(new int[]{-9,4,5,7,9,12,230},tree.sortArray(test3));
        Assertions.assertArrayEquals(new int[]{7},tree.sortArray(test4));
        Assertions.assertArrayEquals(new int[]{8,8,8,8,8},tree.sortArray(test5));
    }



}
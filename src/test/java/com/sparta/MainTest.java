package com.sparta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    @DisplayName("Testing Bubble Sort")
    void testBubbleSort() {
        int[] test1 = {3,5,4,6};
        int[] test2 = {6,5};
        int[] test3 = {5,9,4,7,-9,230,12};
        BubbleSort sort = new BubbleSort();
        Assertions.assertArrayEquals(new int[]{3,4,5,6},sort.sortArray(test1));
        Assertions.assertArrayEquals(new int[]{5,6},sort.sortArray(test2));
        Assertions.assertArrayEquals(new int[]{-9,4,5,7,9,12,230},sort.sortArray(test3));

    }

    @Test
    @DisplayName("Testing Merge Sort")
    void testMergeSort() {
        int[] test1 = {3,5,4,6};
        int[] test2 = {6,5};
        int[] test3 = {5,9,4,7,-9,230,12};
        MergeSort sort = new MergeSort();
        Assertions.assertArrayEquals(new int[]{3,4,5,6},sort.sortArray(test1));
        Assertions.assertArrayEquals(new int[]{5,6},sort.sortArray(test2));
        Assertions.assertArrayEquals(new int[]{-9,4,5,7,9,12,230},sort.sortArray(test3));

    }





}
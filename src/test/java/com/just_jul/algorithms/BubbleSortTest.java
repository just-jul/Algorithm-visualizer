package com.just_jul.algorithms;

import org.junit.jupiter.api.Test;

import com.just_jul.algorithms.algorithms.BubbleSort;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;

public class BubbleSortTest {
    
    private BubbleSort sort;

    @BeforeEach
    void BubbleSortTest(){
        this.sort = new BubbleSort();
    }

    @Test
    void testStandardSort(){
        int[] input = {5, 1, 4, 2, 8};
        int[] expected = {1, 2, 4, 5, 8};

        int[] result = sort.bubbleSort(input);

        assertArrayEquals(expected, result, "The array should be sorted in ascending order.");
    }



}

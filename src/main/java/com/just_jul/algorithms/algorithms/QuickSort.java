package com.just_jul.algorithms.algorithms;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class QuickSort implements SortingAlgorithm{
    
    @Override
    public String getName(){
        return "quick";
    }

    @Override
    public List<int[]> getSteps(int[] array){
        // quicksort algorithm 

        List<int[]> steps = new ArrayList<>();

        int[] arr = array.clone();

        // initial state 
        steps.add(arr.clone());

        int low = 0;
        int high = array.length - 1;

        int pivot = array[high];

        int i = low - 1;

        for(int j = low; j < high; j++){
            if(array[j] <= pivot){
                i++;
            }

            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        
        


        return null;
    }


    // might not need !
    public int getHighestIndex(int[] array){

        int maxIndex = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] > array[maxIndex]){
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public int getSmallestIndex(int[] array){

        int minIndex = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] < array[minIndex]){
                minIndex = i;
            }
        }

        return minIndex;
    }
}

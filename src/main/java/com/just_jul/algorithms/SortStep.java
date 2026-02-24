package com.just_jul.algorithms;

public class SortStep {
    private int[] currArray;
    private int indexA;
    private int indexB;
    private boolean isSwapped;

    public SortStep(int[] currArray, int indexA, int indexB){
        this.currArray = currArray;
        this.indexA = indexA;
        this.indexB = indexB;
        this.isSwapped = false;
    }

    public int[] getCurrentArray(){
        return currArray;
    }
    public int getIndexA(){
        return indexA;
    }
    public int getIndexB(){
        return indexB;
    }
    
}

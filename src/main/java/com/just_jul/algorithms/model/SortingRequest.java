package com.just_jul.algorithms.model;

public class SortingRequest {
    // input data shape

    private int[] array;
    private String algorithm;

    public int[] getArray(){
        return this.array;
    }
    public void setArray(int[] array){
        this.array = array;
    }
    public String getAlgorithm(){
        return this.algorithm;
    }
    public void setAlgorithm(String algorithm){
        this.algorithm = algorithm;
    }
}

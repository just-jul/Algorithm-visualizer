package com.just_jul.algorithms.model;

import java.util.List;

public class SortingResponse {
   // output data shape 

   private List<int[]> steps;

   public SortingResponse(List<int[]> steps){
    this.steps = steps;
   }
   public List<int[]> getSteps(){
    return this.steps;
   }
}

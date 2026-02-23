package com.just_jul.algorithms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VisualizerController {

    @GetMapping("/")
    public String homePage(){
        return "home";
    }
    
    @GetMapping("/bubble-sort")
    public String getBubbleSortPage(){
        return "bubblesort";
    }

    @GetMapping("/binary-search")
    public String binarySearchPage(){
        return "binarysearch";
    }


    // TO DO (logic + front-end)

    @GetMapping("/dijkstra")
    public String dijkstraPage(){
        return "dijkstra";
    }

    @GetMapping("/quick-sort")
    public String quickSortPage(){
        return "quicksort";
    }
}

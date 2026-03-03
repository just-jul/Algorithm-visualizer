package com.just_jul.algorithms.controller;
import com.just_jul.algorithms.*;
import com.just_jul.algorithms.model.SortingRequest;
import com.just_jul.algorithms.model.SortingResponse;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.just_jul.algorithms.service.SortingService;

// receives POST request from js 

@RestController
@RequestMapping("/api")
public class SortingController {
    private final SortingService sortingService;

    public SortingController(SortingService sortingService){
        this.sortingService = sortingService;
    }

    @PostMapping("/bubble-sort")
    public ResponseEntity<SortingResponse> getBubbleSort(@RequestBody SortingRequest request){
        return ResponseEntity.ok(sortingService.sort(request));
    }
}

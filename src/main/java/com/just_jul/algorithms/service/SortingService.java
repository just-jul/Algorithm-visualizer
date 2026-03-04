package com.just_jul.algorithms.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.just_jul.algorithms.algorithms.BubbleSort;
import com.just_jul.algorithms.algorithms.SortingAlgorithm;
import com.just_jul.algorithms.model.SortingRequest;
import com.just_jul.algorithms.model.SortingResponse;

@Service
public class SortingService {

    private final Map<String, SortingAlgorithm> sortingAlgorithms;

    public SortingService(List<SortingAlgorithm> sortingAlgorithmList){
        this.sortingAlgorithms = new HashMap<>();

        for(SortingAlgorithm algo : sortingAlgorithmList){
            sortingAlgorithms.put(algo.getName(), algo);
        }
    }
    

    public SortingResponse sort(SortingRequest request){
        // receives request, calls right algorithm, returns response

        // if Bubble Sort then algo -> BubbleSort
        SortingAlgorithm algo = sortingAlgorithms.get(request.getAlgorithm());

        // creating the list of steps from algorithm which SortingResponse gets
        SortingResponse s = new SortingResponse(algo.getSteps(request.getArray()));

        return s;
    }
}

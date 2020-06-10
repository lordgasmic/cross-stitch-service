package com.lordgasmic.crossstitch.service;

import com.lordgasmic.crossstitch.model.FlossResponse;
import com.lordgasmic.crossstitch.repository.FlossInventoryRepository;
import com.lordgasmic.crossstitch.repository.PatternRepository;
import com.lordgasmic.crossstitch.repository.FlossRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CrossStitchService {

    @Autowired
    private FlossRepository flossRepository;

    @Autowired
    private PatternRepository flossPatternRepository;

    @Autowired
    private FlossInventoryRepository flossInventoryRepository;

    public FlossResponse getFloss(int colorCode){
        FlossResponse response = new FlossResponse();
        response.setFlosses(flossRepository.findByColorCode(colorCode));

        return response;
    }

    public FlossResponse getPatterns(){
        FlossResponse response = new FlossResponse();
        //response.setPatterns(flossPatternRepository.findAllDistinctName());

        flossPatternRepository.findAll().forEach(System.out::println);
        return response;
    }
}

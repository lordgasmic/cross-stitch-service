package com.lordgasmic.crossstitch.service;

import com.lordgasmic.crossstitch.model.FlossResponse;
import com.lordgasmic.crossstitch.repository.FlossRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CrossStitchService {

    @Autowired
    private FlossRepository repository;

    public FlossResponse getFloss(int colorCode){
        FlossResponse response = new FlossResponse();
        response.setFlosses(repository.findByColorCode(colorCode));

        return response;
    }

    public FlossResponse getPatterns(){
        FlossResponse response = new FlossResponse();
        response.setFlosses(repository.findDistinctByName());

        return response;
    }
}

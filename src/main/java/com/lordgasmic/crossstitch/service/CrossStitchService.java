package com.lordgasmic.crossstitch.service;

import com.lordgasmic.crossstitch.entity.*;
import com.lordgasmic.crossstitch.model.FlossResponse;
import com.lordgasmic.crossstitch.model.PatternFloss;
import com.lordgasmic.crossstitch.model.PatternResponse;
import com.lordgasmic.crossstitch.repository.*;
import org.aspectj.weaver.patterns.HasThisTypePatternTriedToSneakInSomeGenericOrParameterizedTypePatternMatchingStuffAnywhereVisitor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.security.krb5.internal.PAForUserEnc;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

@Service
public class CrossStitchService {

    @Autowired
    private FlossRepository flossRepository;

    @Autowired
    private PatternRepository patternRepository;

//    @Autowired
//    private PatternFlossRepository patternFlossRepository;

    @Autowired
    private FlossInventoryRepository flossInventoryRepository;

    @Autowired
    private CustomRepository customRepository;

    public FlossResponse getFloss(int colorCode){
        FlossResponse response = new FlossResponse();
//        response.setFlosses(flossRepository.findByColorCode(colorCode));

        return response;
    }

    public FlossResponse getPatterns(){
        FlossResponse response = new FlossResponse();
        response.setPatterns(patternRepository.findAll());

        return response;
    }

    public PatternResponse getPattern(int patternId) {
        PatternResponse response = new PatternResponse();
        List<CustomEntity> entities = customRepository.getPatternAndFloss();

        entities.forEach(System.out::println);
        return response;
    }
}

package com.lordgasmic.crossstitch.controller;

import com.lordgasmic.crossstitch.model.FlossResponse;
import com.lordgasmic.crossstitch.model.PatternResponse;
import com.lordgasmic.crossstitch.service.CrossStitchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class CrossStitchController {

    @Autowired
    private CrossStitchService service;

    @GetMapping("/floss")
    public FlossResponse floss(@Valid @RequestParam int colorCode) {
        return service.getFloss(colorCode);
    }

    @GetMapping("/patterns")
    public FlossResponse patterns() {
        return service.getPatterns();
    }

    @GetMapping("/pattern")
    public PatternResponse getPattern(@Valid @RequestParam int patternId) {
        return service.getPattern(patternId);
    }
}

package com.lordgasmic.crossstitch.controller;

import com.lordgasmic.crossstitch.model.FlossResponse;
import com.lordgasmic.crossstitch.service.CrossStitchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class CrossStitchController {

    @Autowired
    private CrossStitchService service;

    @GetMapping("/floss")
    public FlossResponse login(@Valid @RequestParam int colorCode) {

        return service.getFloss(colorCode);
    }
}

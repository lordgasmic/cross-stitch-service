package com.lordgasmic.crossstitch.model;

import lombok.Data;

import java.util.List;

@Data
public class PatternResponse {

    private int id;
    private String name;
    private String brand;
    private List<PatternFloss> flosses;
}

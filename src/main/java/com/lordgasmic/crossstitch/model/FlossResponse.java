package com.lordgasmic.crossstitch.model;

import com.lordgasmic.crossstitch.entity.FlossEntity;
import com.lordgasmic.crossstitch.entity.PatternEntity;
import lombok.Data;

import java.util.List;

@Data
public class FlossResponse {

    private List<FlossEntity> flosses;
    private List<PatternEntity> patterns;
}

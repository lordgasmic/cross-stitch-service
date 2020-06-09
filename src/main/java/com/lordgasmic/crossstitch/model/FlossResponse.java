package com.lordgasmic.crossstitch.model;

import com.lordgasmic.crossstitch.entity.FlossEntity;
import lombok.Data;

import java.util.List;

@Data
public class FlossResponse {

    private List<FlossEntity> flosses;
}

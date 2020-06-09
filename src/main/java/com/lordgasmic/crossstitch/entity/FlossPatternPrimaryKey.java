package com.lordgasmic.crossstitch.entity;

import lombok.Data;

import javax.persistence.Embeddable;

@Embeddable
@Data
public class FlossPatternPrimaryKey {

    private String name;
    private int size;
}

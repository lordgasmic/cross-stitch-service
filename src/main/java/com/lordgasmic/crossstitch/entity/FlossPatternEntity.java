package com.lordgasmic.crossstitch.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity(name = "floss_pattern_vw")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlossPatternEntity {

    private int id;
    private String name;
    private int size;
    private String height;
    private String width;

}

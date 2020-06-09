package com.lordgasmic.crossstitch.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "floss_pattern_vw")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlossPatternEntity {

    @Id
    private int id;
    private String name;
    private int size;
    private String height;
    private String width;

}

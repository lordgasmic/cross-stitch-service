package com.lordgasmic.crossstitch.entity;

import lombok.Data;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity(name = "floss_pattern")
@Data
public class FlossPatternEntity {

    @EmbeddedId
    private FlossPatternPrimaryKey pk;
    private String height;
    private String width;

}

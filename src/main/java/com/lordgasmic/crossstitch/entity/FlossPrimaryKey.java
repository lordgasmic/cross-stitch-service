package com.lordgasmic.crossstitch.entity;

import lombok.Data;

import javax.persistence.Embeddable;

@Embeddable
@Data
public class FlossPrimaryKey {
    private String brand;
    private int colorCode;
}

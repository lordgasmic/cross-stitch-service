package com.lordgasmic.crossstitch.entity;

import lombok.Data;

import javax.persistence.Embeddable;

@Embeddable
@Data
public class FlossInventoryPrimaryKey {

    private String brand;
    private int colorCode;
}

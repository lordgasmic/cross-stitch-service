package com.lordgasmic.crossstitch.entity;

import lombok.Data;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity(name = "floss_inventory")
@Data
public class FlossInventoryEntity {

    @EmbeddedId
    private FlossInventoryPrimaryKey pk;
    private String length;
}

package com.lordgasmic.crossstitch.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "floss_inventory_vw")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlossInventoryEntity {

    @Id
    private int id;
    private String brand;
    private int colorCode;
    private String length;
}

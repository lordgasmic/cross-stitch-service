package com.lordgasmic.crossstitch.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;


@Data
@Entity
public class CustomEntity {

    @Id
    private int id;
    private String name;
    private String brand;
    private int pid;
    private int fid;
    private int stitches;
    private String skein;
    private int colorCode;
}

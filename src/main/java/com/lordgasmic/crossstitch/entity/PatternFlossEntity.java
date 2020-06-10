package com.lordgasmic.crossstitch.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "pattern_floss_vw")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PatternFlossEntity {

    @Id
    private int pid;

    @Id
    private int fid;

    private int stitches;
    private String skein;
}

package com.lordgasmic.crossstitch.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "floss_vw")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PatternFlossEntity {

    @Id
    private PatternFlossPK pk;
    private int stitches;
    private String skein;
}

package com.lordgasmic.crossstitch.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "pattern_size_vw")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PatternSizeEntity {

    @Id
    private int pid;
    private String height;
    private String width;
    private int size;

}

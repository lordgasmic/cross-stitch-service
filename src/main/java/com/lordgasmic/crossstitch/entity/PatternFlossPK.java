package com.lordgasmic.crossstitch.entity;

import lombok.Data;

import javax.persistence.Embeddable;

@Embeddable
@Data
public class PatternFlossPK {

    private int pid;
    private int fid;
}

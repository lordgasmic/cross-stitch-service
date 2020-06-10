package com.lordgasmic.crossstitch.entity;

import lombok.Data;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
public class PatternFlossPK implements Serializable {

    private int pid;
    private int fid;
}

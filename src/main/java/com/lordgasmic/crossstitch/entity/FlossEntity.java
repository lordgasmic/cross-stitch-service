package com.lordgasmic.crossstitch.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity(name = "floss_vw")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlossEntity {

    @EmbeddedId
    private FlossPrimaryKey pk;
    private String length;
    private int thread_count;

}

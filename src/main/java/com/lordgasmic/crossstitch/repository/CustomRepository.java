package com.lordgasmic.crossstitch.repository;

import com.lordgasmic.crossstitch.entity.CustomEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface CustomRepository extends Repository<CustomEntity, Long> {

    @Query("select p.*, pf.*, f.color_code from pattern_vw p, pattern_floss_vw pf, floss_vw f where p.id = pf.pid and f.id = pf.fid;")
    List<CustomEntity> getPatternAndFloss();
}

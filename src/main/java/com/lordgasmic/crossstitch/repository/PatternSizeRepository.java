package com.lordgasmic.crossstitch.repository;

import com.lordgasmic.crossstitch.entity.PatternEntity;
import com.lordgasmic.crossstitch.entity.PatternSizeEntity;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface PatternSizeRepository extends Repository<PatternSizeEntity, String> {

    List<PatternSizeEntity> findAll();
    List<PatternSizeEntity> findById(int id);
}

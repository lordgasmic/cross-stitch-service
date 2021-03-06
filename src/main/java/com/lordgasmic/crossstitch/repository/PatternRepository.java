package com.lordgasmic.crossstitch.repository;

import com.lordgasmic.crossstitch.entity.PatternEntity;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface PatternRepository extends Repository<PatternEntity, String> {

    List<PatternEntity> findAll();
    PatternEntity findById(int id);
}

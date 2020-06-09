package com.lordgasmic.crossstitch.repository;

import com.lordgasmic.crossstitch.entity.FlossPatternEntity;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface FlossPatternRepository extends Repository<FlossPatternEntity, String> {

    List<FlossPatternEntity> findDistinctName();
}

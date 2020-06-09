package com.lordgasmic.crossstitch.repository;

import com.lordgasmic.crossstitch.entity.FlossEntity;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface FlossRepository extends Repository<FlossEntity, String> {

    List<FlossEntity> findByColorCode(int colorCode);
}

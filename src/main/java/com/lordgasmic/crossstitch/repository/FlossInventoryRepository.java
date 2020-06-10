package com.lordgasmic.crossstitch.repository;

import com.lordgasmic.crossstitch.entity.FlossEntity;
import com.lordgasmic.crossstitch.entity.FlossInventoryEntity;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface FlossInventoryRepository extends Repository<FlossInventoryEntity, String> {

    List<FlossInventoryEntity> findAll();
}

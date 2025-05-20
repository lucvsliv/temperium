package com.lucvs.temperium.repository;

import com.lucvs.temperium.entity.GrowthLog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.Optional;

public interface GrowthLogRepository extends JpaRepository<GrowthLog, Long> {
    Optional<GrowthLog> findByDate(LocalDate date);
}

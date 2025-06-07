package com.lucvs.temperium.service;

import com.lucvs.temperium.dto.GrowthLog;
import com.lucvs.temperium.repository.GrowthLogRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class GrowthLogServiceImpl implements GrowthLogService {

    private final GrowthLogRepository growthLogRepository;

    public GrowthLogServiceImpl(GrowthLogRepository growthLogRepository) {
        this.growthLogRepository = growthLogRepository;
    }

    @Override
    public GrowthLog getGrowthLogById(Long growthLogId) {
        return growthLogRepository.findById(growthLogId)
                .orElseThrow(() -> new IllegalArgumentException("Growth Log not found"));
    }

    @Override
    public GrowthLog getGrowthLogByDate(LocalDate date) {
        return growthLogRepository.findByDate(date)
                .orElseThrow(() -> new IllegalArgumentException("Growth Log not found"));
    }
}

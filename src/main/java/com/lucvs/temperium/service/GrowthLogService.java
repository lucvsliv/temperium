package com.lucvs.temperium.service;

import com.lucvs.temperium.dto.GrowthLog;

import java.time.LocalDate;

public interface GrowthLogService {

    GrowthLog getGrowthLogById(Long growthLogId);
    GrowthLog getGrowthLogByDate(LocalDate date);
}

package com.lucvs.temperium.service;

import com.lucvs.temperium.dto.Tempino;

import java.util.List;

public interface TempinoService {

    Tempino getTempinoById(Long tempinoId);
    Tempino getTempinoByName(String name);
    List<Tempino> getAllTempino();
}

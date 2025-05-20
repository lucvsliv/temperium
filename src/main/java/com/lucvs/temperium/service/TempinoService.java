package com.lucvs.temperium.service;

import com.lucvs.temperium.entity.Tempino;

public interface TempinoService {

    Tempino getTempinoById(Long tempinoId);
    Tempino getTempinoByName(Long name);
}

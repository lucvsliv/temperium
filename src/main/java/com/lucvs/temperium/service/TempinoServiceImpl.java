package com.lucvs.temperium.service;

import com.lucvs.temperium.entity.Tempino;
import com.lucvs.temperium.repository.TempinoRepository;
import org.springframework.stereotype.Service;

@Service
public class TempinoServiceImpl implements TempinoService {

    private final TempinoRepository tempinoRepository;

    public TempinoServiceImpl(TempinoRepository tempinoRepository) {
        this.tempinoRepository = tempinoRepository;
    }

    @Override
    public Tempino getTempinoById(Long tempinoId) {
        return tempinoRepository.findById(tempinoId)
                .orElseThrow(() -> new IllegalArgumentException("Tempino not found"));
    }

    @Override
    public Tempino getTempinoByName(Long name) {
        return tempinoRepository.findByName(name)
                .orElseThrow(() -> new IllegalArgumentException("Tempino not found"));
    }
}

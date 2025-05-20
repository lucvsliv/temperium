package com.lucvs.temperium.service;

import com.lucvs.temperium.entity.TempinoInstance;
import com.lucvs.temperium.repository.TempinoInstanceRepository;
import org.springframework.stereotype.Service;

@Service
public class TempinoInstanceServiceImpl implements TempinoInstanceService {

    private final TempinoInstanceRepository tempinoInstanceRepository;

    public TempinoInstanceServiceImpl(TempinoInstanceRepository tempinoInstanceRepository) {
        this.tempinoInstanceRepository = tempinoInstanceRepository;
    }

    @Override
    public TempinoInstance getTempinoInstanceById(Long tempinoInstanceId) {
        return tempinoInstanceRepository.findById(tempinoInstanceId)
                .orElseThrow(() -> new IllegalArgumentException("Tempino Instance not found"));
    }

    @Override
    public TempinoInstance getTempinoInstanceByUserId(Long userId) {
        return tempinoInstanceRepository.findByUserId(userId)
                .orElseThrow(() -> new IllegalArgumentException("Tempino Instance not found"));
    }

    @Override
    public TempinoInstance getTempinoInstanceByNickname(String nickname) {
        return tempinoInstanceRepository.findByNickname(nickname)
                .orElseThrow(() -> new IllegalArgumentException("Tempino Instance not found"));
    }
}

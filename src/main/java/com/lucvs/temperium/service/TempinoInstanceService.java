package com.lucvs.temperium.service;

import com.lucvs.temperium.dto.TempinoInstance;

public interface TempinoInstanceService {

    TempinoInstance getTempinoInstanceById(Long tempinoInstanceId);
    TempinoInstance getTempinoInstanceByUserId(Long userId);
    TempinoInstance getTempinoInstanceByNickname(String nickname);
}

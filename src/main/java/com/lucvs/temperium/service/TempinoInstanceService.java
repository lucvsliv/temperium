package com.lucvs.temperium.service;

import com.lucvs.temperium.entity.TempinoInstance;

public interface TempinoInstanceService {

    TempinoInstance getTempinoInstanceById(Long tempinoInstanceId);
    TempinoInstance getTempinoInstanceByUserId(Long userId);
    TempinoInstance getTempinoInstanceByNickname(String nickname);
}

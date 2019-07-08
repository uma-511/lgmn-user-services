package com.lgmn.userservices.basic.service;

import com.lgmn.common.result.Result;
import com.lgmn.userservices.basic.dto.LgmnUserDto;
import com.lgmn.userservices.basic.dto.ResetUserPwdDto;
import com.lgmn.userservices.basic.entity.LgmnUserEntity;
import com.lgmn.common.service.LgmnService;

public interface LgmnUserService extends LgmnService<LgmnUserEntity, LgmnUserDto, String> {
    Result register(LgmnUserEntity lgmnUserEntity);

    Result resetPassword(ResetUserPwdDto resetUserPwdDto);
}
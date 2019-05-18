package com.lgmn.userservices.api.service;

import com.lgmn.common.service.LgmnService;
import com.lgmn.userservices.api.dto.LgmnRoleDto;
import com.lgmn.userservices.api.entity.LgmnRoleEntity;

import java.util.List;

public interface LgmnRoleEntityService extends LgmnService<LgmnRoleEntity, LgmnRoleDto, String> {
    List<LgmnRoleEntity> querySelctedRole(String userId);


    List<LgmnRoleEntity> queryCanSelctRole(String userId);
}
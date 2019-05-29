package com.lgmn.userservices.basic.service;

import com.lgmn.common.service.LgmnService;
import com.lgmn.userservices.basic.dto.LgmnRoleDto;
import com.lgmn.userservices.basic.entity.LgmnRoleEntity;

import java.util.List;

public interface LgmnRoleEntityService extends LgmnService<LgmnRoleEntity, LgmnRoleDto, String> {
    List<LgmnRoleEntity> querySelctedRole(String userId);


    List<LgmnRoleEntity> queryCanSelctRole(String userId);
}
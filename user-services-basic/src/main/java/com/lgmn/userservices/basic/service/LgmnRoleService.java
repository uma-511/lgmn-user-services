package com.lgmn.userservices.basic.service;

import java.util.Date;
import java.util.List;

import com.lgmn.userservices.basic.dto.LgmnRoleDto;
import com.lgmn.userservices.basic.entity.LgmnRoleEntity;
import com.lgmn.common.service.LgmnService;

public interface LgmnRoleService extends LgmnService<LgmnRoleEntity, LgmnRoleDto, String> {
    List<LgmnRoleEntity> querySelctedRole(String userId);
    List<LgmnRoleEntity> queryCanSelctRole(String userId);
}
package com.lgmn.userservices.basic.service;

import com.lgmn.common.service.LgmnService;
import com.lgmn.userservices.basic.dto.LgmnPermissionDto;
import com.lgmn.userservices.basic.entity.LgmnPermissionEntity;

import java.util.List;

public interface LgmnPermissionEntityService extends LgmnService<LgmnPermissionEntity, LgmnPermissionDto, String> {
    List<LgmnPermissionEntity> querySelctedPermission(String roleId);
    List<LgmnPermissionEntity> queryCanSelctPermission(String roleId);
    List<LgmnPermissionEntity> queryUserPermission(String userId);
}
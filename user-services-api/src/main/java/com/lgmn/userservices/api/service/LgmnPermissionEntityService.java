package com.lgmn.userservices.api.service;

import com.lgmn.common.service.LgmnService;
import com.lgmn.userservices.api.dto.LgmnPermissionDto;
import com.lgmn.userservices.api.entity.LgmnPermissionEntity;

import java.util.List;

public interface LgmnPermissionEntityService extends LgmnService<LgmnPermissionEntity, LgmnPermissionDto, String> {
    List<LgmnPermissionEntity> querySelctedPermission(String roleId);
    List<LgmnPermissionEntity> queryCanSelctPermission(String roleId);
    List<LgmnPermissionEntity> queryUserPermission(String userId);
}
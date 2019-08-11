package com.lgmn.userservices.basic.service;

import java.util.Date;
import java.util.List;

import com.lgmn.userservices.basic.dto.LgmnPermissionDto;
import com.lgmn.userservices.basic.entity.LgmnPermissionEntity;
import com.lgmn.common.service.LgmnService;

public interface LgmnPermissionService extends LgmnService<LgmnPermissionEntity, LgmnPermissionDto, String> {
    List<LgmnPermissionEntity> querySelctedPermission(String roleId);
    List<LgmnPermissionEntity> queryCanSelctPermission(String roleId);
    List<LgmnPermissionEntity> queryUserPermission(String userId);
}
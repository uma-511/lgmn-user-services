package com.lgmn.userservices.basic.repository;

import com.lgmn.userservices.basic.dto.LgmnRolePermissionDto;
import com.lgmn.userservices.basic.entity.LgmnRolePermissionEntity;
import com.lgmn.common.repository.LgmnRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LgmnRolePermissionRepository extends LgmnRepository<LgmnRolePermissionEntity, LgmnRolePermissionDto, Integer> {
}
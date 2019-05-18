package com.lgmn.userservices.api.repository;

import com.lgmn.common.repository.LgmnRepository;
import com.lgmn.userservices.api.dto.LgmnRolePermissionDto;
import com.lgmn.userservices.api.entity.LgmnRolePermissionEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface LgmnRolePermissionEntityRepository extends LgmnRepository<LgmnRolePermissionEntity, LgmnRolePermissionDto, Integer> {
}
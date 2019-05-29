package com.lgmn.userservices.basic.repository;

import com.lgmn.common.repository.LgmnRepository;
import com.lgmn.userservices.basic.dto.LgmnRolePermissionDto;
import com.lgmn.userservices.basic.entity.LgmnRolePermissionEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface LgmnRolePermissionEntityRepository extends LgmnRepository<LgmnRolePermissionEntity, LgmnRolePermissionDto, Integer> {
}
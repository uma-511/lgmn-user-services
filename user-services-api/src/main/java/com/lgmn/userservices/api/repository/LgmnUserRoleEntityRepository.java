package com.lgmn.userservices.api.repository;

import com.lgmn.common.repository.LgmnRepository;
import com.lgmn.userservices.api.dto.LgmnUserRoleDto;
import com.lgmn.userservices.api.entity.LgmnUserRoleEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface LgmnUserRoleEntityRepository extends LgmnRepository<LgmnUserRoleEntity, LgmnUserRoleDto, Integer> {
}
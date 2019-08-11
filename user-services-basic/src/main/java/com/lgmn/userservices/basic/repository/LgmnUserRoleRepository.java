package com.lgmn.userservices.basic.repository;

import com.lgmn.userservices.basic.dto.LgmnUserRoleDto;
import com.lgmn.userservices.basic.entity.LgmnUserRoleEntity;
import com.lgmn.common.repository.LgmnRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LgmnUserRoleRepository extends LgmnRepository<LgmnUserRoleEntity, LgmnUserRoleDto, Integer> {
}
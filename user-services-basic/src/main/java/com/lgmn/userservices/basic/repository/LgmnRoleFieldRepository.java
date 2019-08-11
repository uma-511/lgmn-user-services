package com.lgmn.userservices.basic.repository;

import com.lgmn.userservices.basic.dto.LgmnRoleFieldDto;
import com.lgmn.userservices.basic.entity.LgmnRoleFieldEntity;
import com.lgmn.common.repository.LgmnRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LgmnRoleFieldRepository extends LgmnRepository<LgmnRoleFieldEntity, LgmnRoleFieldDto, Integer> {
}
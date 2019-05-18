package com.lgmn.userservices.api.repository;

import com.lgmn.common.repository.LgmnRepository;
import com.lgmn.userservices.api.dto.LgmnUserDto;
import com.lgmn.userservices.api.entity.LgmnUserEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface LgmnUserEntityRepository extends LgmnRepository<LgmnUserEntity, LgmnUserDto, String> {
}
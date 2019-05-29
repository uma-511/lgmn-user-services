package com.lgmn.userservices.basic.repository;

import com.lgmn.common.repository.LgmnRepository;
import com.lgmn.userservices.basic.dto.LgmnUserDto;
import com.lgmn.userservices.basic.entity.LgmnUserEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface LgmnUserEntityRepository extends LgmnRepository<LgmnUserEntity, LgmnUserDto, String> {
}
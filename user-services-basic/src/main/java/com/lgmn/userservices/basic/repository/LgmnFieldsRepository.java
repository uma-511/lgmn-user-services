package com.lgmn.userservices.basic.repository;

import com.lgmn.userservices.basic.dto.LgmnFieldsDto;
import com.lgmn.userservices.basic.entity.LgmnFieldsEntity;
import com.lgmn.common.repository.LgmnRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LgmnFieldsRepository extends LgmnRepository<LgmnFieldsEntity, LgmnFieldsDto, Integer> {
}
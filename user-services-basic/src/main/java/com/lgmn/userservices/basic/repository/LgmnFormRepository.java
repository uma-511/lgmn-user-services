package com.lgmn.userservices.basic.repository;

import com.lgmn.userservices.basic.dto.LgmnFormDto;
import com.lgmn.userservices.basic.entity.LgmnFormEntity;
import com.lgmn.common.repository.LgmnRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LgmnFormRepository extends LgmnRepository<LgmnFormEntity, LgmnFormDto, Integer> {
}
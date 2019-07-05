package com.lgmn.userservices.basic.repository;

import com.lgmn.userservices.basic.dto.LgmnFormControlDto;
import com.lgmn.userservices.basic.entity.LgmnFormControlEntity;
import com.lgmn.common.repository.LgmnRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LgmnFormControlRepository extends LgmnRepository<LgmnFormControlEntity, LgmnFormControlDto, Integer> {
}
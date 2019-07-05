package com.lgmn.userservices.basic.repository;

import com.lgmn.userservices.basic.dto.LgmnFormControlTempDto;
import com.lgmn.userservices.basic.entity.LgmnFormControlTempEntity;
import com.lgmn.common.repository.LgmnRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LgmnFormControlTempRepository extends LgmnRepository<LgmnFormControlTempEntity, LgmnFormControlTempDto, Integer> {
}
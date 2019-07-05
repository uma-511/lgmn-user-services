package com.lgmn.userservices.basic.repository;

import com.lgmn.userservices.basic.dto.LgmnFormControlPropsTempDto;
import com.lgmn.userservices.basic.entity.LgmnFormControlPropsTempEntity;
import com.lgmn.common.repository.LgmnRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LgmnFormControlPropsTempRepository extends LgmnRepository<LgmnFormControlPropsTempEntity, LgmnFormControlPropsTempDto, Integer> {
}
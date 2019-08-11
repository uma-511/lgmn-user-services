package com.lgmn.userservices.basic.repository;

import com.lgmn.userservices.basic.dto.LgmnFormControlPropsDto;
import com.lgmn.userservices.basic.entity.LgmnFormControlPropsEntity;
import com.lgmn.common.repository.LgmnRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LgmnFormControlPropsRepository extends LgmnRepository<LgmnFormControlPropsEntity, LgmnFormControlPropsDto, Integer> {
}
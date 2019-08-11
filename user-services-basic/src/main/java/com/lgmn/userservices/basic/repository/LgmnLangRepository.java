package com.lgmn.userservices.basic.repository;

import com.lgmn.userservices.basic.dto.LgmnLangDto;
import com.lgmn.userservices.basic.entity.LgmnLangEntity;
import com.lgmn.common.repository.LgmnRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LgmnLangRepository extends LgmnRepository<LgmnLangEntity, LgmnLangDto, Integer> {
}
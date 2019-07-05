package com.lgmn.userservices.basic.repository;

import java.util.Date;
import com.lgmn.userservices.basic.dto.LgmnUserDto;
import com.lgmn.userservices.basic.entity.LgmnUserEntity;
import com.lgmn.common.repository.LgmnRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LgmnUserRepository extends LgmnRepository<LgmnUserEntity, LgmnUserDto, String> {
}
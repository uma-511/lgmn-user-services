package com.lgmn.userservices.provider.service;

import java.util.Date;
import com.alibaba.dubbo.config.annotation.Service;
import com.lgmn.userservices.basic.dto.LgmnUserDto;
import com.lgmn.userservices.basic.entity.LgmnUserEntity;
import com.lgmn.userservices.basic.repository.LgmnUserRepository;
import com.lgmn.userservices.basic.service.LgmnUserService;
import com.lgmn.common.service.LgmnAbstractService;
import org.springframework.beans.factory.annotation.Autowired;

@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class LgmnUserServiceImpl extends LgmnAbstractService<LgmnUserEntity, LgmnUserDto, String, LgmnUserRepository> implements LgmnUserService {

    @Autowired
    private LgmnUserRepository lgmnUserRepository;

    public LgmnUserServiceImpl(LgmnUserRepository repository) {
        super(repository);
    }
}
package com.lgmn.userservices.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.lgmn.common.service.LgmnAbstractService;
import com.lgmn.userservices.basic.dto.LgmnUserDto;
import com.lgmn.userservices.basic.entity.LgmnUserEntity;
import com.lgmn.userservices.basic.repository.LgmnUserEntityRepository;
import com.lgmn.userservices.basic.service.LgmnUserEntityService;
import org.springframework.beans.factory.annotation.Autowired;

@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class LgmnUserEntityServiceImpl extends LgmnAbstractService<LgmnUserEntity,LgmnUserDto,String,LgmnUserEntityRepository> implements LgmnUserEntityService {

    @Autowired
    private LgmnUserEntityRepository lgmnuserentityRepository;

    public LgmnUserEntityServiceImpl(LgmnUserEntityRepository repository) {
        super(repository);
    }
}
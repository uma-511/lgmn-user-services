package com.lgmn.userservices.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.lgmn.common.service.LgmnAbstractService;
import com.lgmn.userservices.api.dto.LgmnUserDto;
import com.lgmn.userservices.api.entity.LgmnUserEntity;
import com.lgmn.userservices.api.repository.LgmnUserEntityRepository;
import com.lgmn.userservices.api.service.LgmnUserEntityService;
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
package com.lgmn.userservices.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.lgmn.userservices.basic.dto.LgmnRoleFieldDto;
import com.lgmn.userservices.basic.entity.LgmnRoleFieldEntity;
import com.lgmn.userservices.basic.repository.LgmnRoleFieldRepository;
import com.lgmn.userservices.basic.service.LgmnRoleFieldService;
import com.lgmn.common.service.LgmnAbstractService;
import org.springframework.beans.factory.annotation.Autowired;

@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class LgmnRoleFieldServiceImpl extends LgmnAbstractService<LgmnRoleFieldEntity, LgmnRoleFieldDto, Integer, LgmnRoleFieldRepository> implements LgmnRoleFieldService {

    @Autowired
    private LgmnRoleFieldRepository lgmnRoleFieldRepository;

    public LgmnRoleFieldServiceImpl(LgmnRoleFieldRepository repository) {
        super(repository);
    }
}
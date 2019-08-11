package com.lgmn.userservices.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.lgmn.common.service.LgmnAbstractService;
import com.lgmn.userservices.basic.dto.LgmnFieldsDto;
import com.lgmn.userservices.basic.entity.LgmnFieldsEntity;
import com.lgmn.userservices.basic.repository.LgmnFieldsRepository;
import com.lgmn.userservices.basic.service.LgmnFieldsService;
import org.springframework.beans.factory.annotation.Autowired;

@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class LgmnFieldsServiceImpl extends LgmnAbstractService<LgmnFieldsEntity, LgmnFieldsDto, Integer, LgmnFieldsRepository> implements LgmnFieldsService {

    @Autowired
    private LgmnFieldsRepository lgmnFieldsRepository;

    public LgmnFieldsServiceImpl(LgmnFieldsRepository repository) {
        super(repository);
    }
}
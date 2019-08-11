package com.lgmn.userservices.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.lgmn.common.service.LgmnAbstractService;
import com.lgmn.userservices.basic.dto.LgmnFormControlDto;
import com.lgmn.userservices.basic.entity.LgmnFormControlEntity;
import com.lgmn.userservices.basic.repository.LgmnFormControlRepository;
import com.lgmn.userservices.basic.service.LgmnFormControlService;
import org.springframework.beans.factory.annotation.Autowired;

@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class LgmnFormControlServiceImpl extends LgmnAbstractService<LgmnFormControlEntity, LgmnFormControlDto, Integer, LgmnFormControlRepository> implements LgmnFormControlService {

    @Autowired
    private LgmnFormControlRepository lgmnFormControlRepository;

    public LgmnFormControlServiceImpl(LgmnFormControlRepository repository) {
        super(repository);
    }
}
package com.lgmn.userservices.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.lgmn.userservices.basic.dto.LgmnFormDto;
import com.lgmn.userservices.basic.entity.LgmnFormEntity;
import com.lgmn.userservices.basic.repository.LgmnFormRepository;
import com.lgmn.userservices.basic.service.LgmnFormService;
import com.lgmn.common.service.LgmnAbstractService;
import org.springframework.beans.factory.annotation.Autowired;

@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class LgmnFormServiceImpl extends LgmnAbstractService<LgmnFormEntity, LgmnFormDto, Integer, LgmnFormRepository> implements LgmnFormService {

    @Autowired
    private LgmnFormRepository lgmnFormRepository;

    public LgmnFormServiceImpl(LgmnFormRepository repository) {
        super(repository);
    }
}
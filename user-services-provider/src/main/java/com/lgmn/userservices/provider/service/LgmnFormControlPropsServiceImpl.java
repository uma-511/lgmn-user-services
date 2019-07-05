package com.lgmn.userservices.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.lgmn.common.service.LgmnAbstractService;
import com.lgmn.userservices.basic.dto.LgmnFormControlPropsDto;
import com.lgmn.userservices.basic.entity.LgmnFormControlPropsEntity;
import com.lgmn.userservices.basic.repository.LgmnFormControlPropsRepository;
import com.lgmn.userservices.basic.service.LgmnFormControlPropsService;
import org.springframework.beans.factory.annotation.Autowired;

@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class LgmnFormControlPropsServiceImpl extends LgmnAbstractService<LgmnFormControlPropsEntity, LgmnFormControlPropsDto, Integer, LgmnFormControlPropsRepository> implements LgmnFormControlPropsService {

    @Autowired
    private LgmnFormControlPropsRepository lgmnFormControlPropsRepository;

    public LgmnFormControlPropsServiceImpl(LgmnFormControlPropsRepository repository) {
        super(repository);
    }
}
package com.lgmn.userservices.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.lgmn.userservices.basic.dto.LgmnFormControlTempDto;
import com.lgmn.userservices.basic.entity.LgmnFormControlTempEntity;
import com.lgmn.userservices.basic.repository.LgmnFormControlTempRepository;
import com.lgmn.userservices.basic.service.LgmnFormControlTempService;
import com.lgmn.common.service.LgmnAbstractService;
import org.springframework.beans.factory.annotation.Autowired;

@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class LgmnFormControlTempServiceImpl extends LgmnAbstractService<LgmnFormControlTempEntity, LgmnFormControlTempDto, Integer, LgmnFormControlTempRepository> implements LgmnFormControlTempService {

    @Autowired
    private LgmnFormControlTempRepository lgmnFormControlTempRepository;

    public LgmnFormControlTempServiceImpl(LgmnFormControlTempRepository repository) {
        super(repository);
    }
}
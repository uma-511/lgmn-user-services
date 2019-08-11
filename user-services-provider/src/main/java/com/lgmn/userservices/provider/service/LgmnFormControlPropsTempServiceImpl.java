package com.lgmn.userservices.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.lgmn.common.service.LgmnAbstractService;
import com.lgmn.userservices.basic.dto.LgmnFormControlPropsTempDto;
import com.lgmn.userservices.basic.entity.LgmnFormControlPropsTempEntity;
import com.lgmn.userservices.basic.repository.LgmnFormControlPropsTempRepository;
import com.lgmn.userservices.basic.service.LgmnFormControlPropsTempService;
import org.springframework.beans.factory.annotation.Autowired;

@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class LgmnFormControlPropsTempServiceImpl extends LgmnAbstractService<LgmnFormControlPropsTempEntity, LgmnFormControlPropsTempDto, Integer, LgmnFormControlPropsTempRepository> implements LgmnFormControlPropsTempService {

    @Autowired
    private LgmnFormControlPropsTempRepository lgmnFormControlPropsTempRepository;

    public LgmnFormControlPropsTempServiceImpl(LgmnFormControlPropsTempRepository repository) {
        super(repository);
    }
}
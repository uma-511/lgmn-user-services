package com.lgmn.userservices.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.lgmn.userservices.basic.dto.LgmnLangDto;
import com.lgmn.userservices.basic.entity.LgmnLangEntity;
import com.lgmn.userservices.basic.repository.LgmnLangRepository;
import com.lgmn.userservices.basic.service.LgmnLangService;
import com.lgmn.common.service.LgmnAbstractService;
import org.springframework.beans.factory.annotation.Autowired;

@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class LgmnLangServiceImpl extends LgmnAbstractService<LgmnLangEntity, LgmnLangDto, Integer, LgmnLangRepository> implements LgmnLangService {

    @Autowired
    private LgmnLangRepository lgmnLangRepository;

    public LgmnLangServiceImpl(LgmnLangRepository repository) {
        super(repository);
    }
}
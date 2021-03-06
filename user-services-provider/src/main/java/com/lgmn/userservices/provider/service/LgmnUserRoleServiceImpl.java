package com.lgmn.userservices.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.lgmn.userservices.basic.dto.LgmnUserRoleDto;
import com.lgmn.userservices.basic.entity.LgmnUserRoleEntity;
import com.lgmn.userservices.basic.repository.LgmnUserRoleRepository;
import com.lgmn.userservices.basic.service.LgmnUserRoleService;
import com.lgmn.common.service.LgmnAbstractService;
import org.springframework.beans.factory.annotation.Autowired;

@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class LgmnUserRoleServiceImpl extends LgmnAbstractService<LgmnUserRoleEntity, LgmnUserRoleDto, Integer, LgmnUserRoleRepository> implements LgmnUserRoleService {

    @Autowired
    private LgmnUserRoleRepository lgmnUserRoleRepository;

    public LgmnUserRoleServiceImpl(LgmnUserRoleRepository repository) {
        super(repository);
    }
}
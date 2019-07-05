package com.lgmn.userservices.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.lgmn.userservices.basic.dto.LgmnRolePermissionDto;
import com.lgmn.userservices.basic.entity.LgmnRolePermissionEntity;
import com.lgmn.userservices.basic.repository.LgmnRolePermissionRepository;
import com.lgmn.userservices.basic.service.LgmnRolePermissionService;
import com.lgmn.common.service.LgmnAbstractService;
import org.springframework.beans.factory.annotation.Autowired;

@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class LgmnRolePermissionServiceImpl extends LgmnAbstractService<LgmnRolePermissionEntity, LgmnRolePermissionDto, Integer, LgmnRolePermissionRepository> implements LgmnRolePermissionService {

    @Autowired
    private LgmnRolePermissionRepository lgmnRolePermissionRepository;

    public LgmnRolePermissionServiceImpl(LgmnRolePermissionRepository repository) {
        super(repository);
    }
}
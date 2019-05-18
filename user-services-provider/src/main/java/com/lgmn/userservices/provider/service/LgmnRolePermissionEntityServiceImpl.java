package com.lgmn.userservices.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.lgmn.common.service.LgmnAbstractService;
import com.lgmn.userservices.api.dto.LgmnRolePermissionDto;
import com.lgmn.userservices.api.entity.LgmnRolePermissionEntity;
import com.lgmn.userservices.api.repository.LgmnRolePermissionEntityRepository;
import com.lgmn.userservices.api.service.LgmnRolePermissionEntityService;
import org.springframework.beans.factory.annotation.Autowired;

@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class LgmnRolePermissionEntityServiceImpl extends LgmnAbstractService<LgmnRolePermissionEntity,LgmnRolePermissionDto,Integer,LgmnRolePermissionEntityRepository> implements LgmnRolePermissionEntityService {

    @Autowired
    private LgmnRolePermissionEntityRepository lgmnrolepermissionentityRepository;

    public LgmnRolePermissionEntityServiceImpl(LgmnRolePermissionEntityRepository repository) {
        super(repository);
    }
}
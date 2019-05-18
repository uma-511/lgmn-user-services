package com.lgmn.userservices.provider.service;


import com.alibaba.dubbo.config.annotation.Service;
import com.lgmn.common.service.LgmnAbstractService;
import com.lgmn.userservices.api.dto.LgmnUserRoleDto;
import com.lgmn.userservices.api.entity.LgmnUserRoleEntity;
import com.lgmn.userservices.api.repository.LgmnUserRoleEntityRepository;
import com.lgmn.userservices.api.service.LgmnUserRoleEntityService;
import org.springframework.beans.factory.annotation.Autowired;

@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class LgmnUserRoleEntityServiceImpl extends LgmnAbstractService<LgmnUserRoleEntity, LgmnUserRoleDto, Integer, LgmnUserRoleEntityRepository> implements LgmnUserRoleEntityService {

    @Autowired
    private LgmnUserRoleEntityRepository lgmnuserroleentityRepository;

    public LgmnUserRoleEntityServiceImpl(LgmnUserRoleEntityRepository repository) {
        super(repository);
    }
}
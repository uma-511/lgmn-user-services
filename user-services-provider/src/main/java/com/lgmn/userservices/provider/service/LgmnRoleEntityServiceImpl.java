package com.lgmn.userservices.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.lgmn.common.service.LgmnAbstractService;
import com.lgmn.userservices.basic.dto.LgmnRoleDto;
import com.lgmn.userservices.basic.entity.LgmnRoleEntity;
import com.lgmn.userservices.basic.repository.LgmnRoleEntityRepository;
import com.lgmn.userservices.basic.service.LgmnRoleEntityService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class LgmnRoleEntityServiceImpl extends LgmnAbstractService<LgmnRoleEntity,LgmnRoleDto,String,LgmnRoleEntityRepository> implements LgmnRoleEntityService {

    @Autowired
    private LgmnRoleEntityRepository lgmnroleentityRepository;

    public LgmnRoleEntityServiceImpl(LgmnRoleEntityRepository repository) {
        super(repository);
    }

    @Override
    public List<LgmnRoleEntity> querySelctedRole(String userId) {
        return lgmnroleentityRepository.querySelctedRole(userId);
    }

    @Override
    public List<LgmnRoleEntity> queryCanSelctRole(String userId) {
        return lgmnroleentityRepository.queryCanSelctRole(userId);
    }
}
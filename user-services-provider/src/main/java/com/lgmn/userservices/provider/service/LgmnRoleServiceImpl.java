package com.lgmn.userservices.provider.service;

import java.util.Date;
import java.util.List;

import com.alibaba.dubbo.config.annotation.Service;
import com.lgmn.userservices.basic.dto.LgmnRoleDto;
import com.lgmn.userservices.basic.entity.LgmnRoleEntity;
import com.lgmn.userservices.basic.repository.LgmnRoleRepository;
import com.lgmn.userservices.basic.service.LgmnRoleService;
import com.lgmn.common.service.LgmnAbstractService;
import org.springframework.beans.factory.annotation.Autowired;

@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class LgmnRoleServiceImpl extends LgmnAbstractService<LgmnRoleEntity, LgmnRoleDto, String, LgmnRoleRepository> implements LgmnRoleService {

    @Autowired
    private LgmnRoleRepository lgmnRoleRepository;

    public LgmnRoleServiceImpl(LgmnRoleRepository repository) {
        super(repository);
    }

    @Override
    public List<LgmnRoleEntity> querySelctedRole(String userId) {
        return lgmnRoleRepository.querySelctedRole(userId);
    }

    @Override
    public List<LgmnRoleEntity> queryCanSelctRole(String userId) {
        return lgmnRoleRepository.queryCanSelctRole(userId);
    }
}
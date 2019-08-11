package com.lgmn.userservices.provider.service;

import java.util.Date;
import java.util.List;

import com.alibaba.dubbo.config.annotation.Service;
import com.lgmn.userservices.basic.dto.LgmnPermissionDto;
import com.lgmn.userservices.basic.entity.LgmnPermissionEntity;
import com.lgmn.userservices.basic.repository.LgmnPermissionRepository;
import com.lgmn.userservices.basic.service.LgmnPermissionService;
import com.lgmn.common.service.LgmnAbstractService;
import org.springframework.beans.factory.annotation.Autowired;

@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class LgmnPermissionServiceImpl extends LgmnAbstractService<LgmnPermissionEntity, LgmnPermissionDto, String, LgmnPermissionRepository> implements LgmnPermissionService {

    @Autowired
    private LgmnPermissionRepository lgmnPermissionRepository;

    public LgmnPermissionServiceImpl(LgmnPermissionRepository repository) {
        super(repository);
    }

    @Override
    public List<LgmnPermissionEntity> querySelctedPermission(String roleId) {
        return lgmnPermissionRepository.querySelctedPermission(roleId);
    }

    @Override
    public List<LgmnPermissionEntity> queryCanSelctPermission(String roleId) {
        return lgmnPermissionRepository.queryCanSelctPermission(roleId);
    }

    @Override
    public List<LgmnPermissionEntity> queryUserPermission(String userId) {
        return lgmnPermissionRepository.queryUserPermission(userId);
    }
}
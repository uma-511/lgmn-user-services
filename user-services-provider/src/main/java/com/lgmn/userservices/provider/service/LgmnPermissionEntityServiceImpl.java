package com.lgmn.userservices.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.lgmn.common.service.LgmnAbstractService;
import com.lgmn.userservices.basic.dto.LgmnPermissionDto;
import com.lgmn.userservices.basic.entity.LgmnPermissionEntity;
import com.lgmn.userservices.basic.repository.LgmnPermissionEntityRepository;
import com.lgmn.userservices.basic.service.LgmnPermissionEntityService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class LgmnPermissionEntityServiceImpl extends LgmnAbstractService<LgmnPermissionEntity,LgmnPermissionDto,String,LgmnPermissionEntityRepository> implements LgmnPermissionEntityService {

    @Autowired
    private LgmnPermissionEntityRepository lgmnpermissionentityRepository;

    public LgmnPermissionEntityServiceImpl(LgmnPermissionEntityRepository repository) {
        super(repository);
    }

    @Override
    public List<LgmnPermissionEntity> querySelctedPermission(String roleId) {
        return lgmnpermissionentityRepository.querySelctedPermission(roleId);
    }

    @Override
    public List<LgmnPermissionEntity> queryCanSelctPermission(String roleId) {
        return lgmnpermissionentityRepository.queryCanSelctPermission(roleId);
    }

    @Override
    public List<LgmnPermissionEntity> queryUserPermission(String userId) {
        return lgmnpermissionentityRepository.queryUserPermission(userId);
    }
}
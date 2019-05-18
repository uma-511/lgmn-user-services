package com.lgmn.userservices.api.repository;

import com.lgmn.common.repository.LgmnRepository;
import com.lgmn.userservices.api.dto.LgmnPermissionDto;
import com.lgmn.userservices.api.entity.LgmnPermissionEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LgmnPermissionEntityRepository extends LgmnRepository<LgmnPermissionEntity, LgmnPermissionDto, String> {

    @Query(value = "select lp.* from lgmn_permission lp RIGHT JOIN lgmn_role_permission lrp on lp.id=lrp.permission_id where lrp.role_id=:roleId",nativeQuery = true)
    List<LgmnPermissionEntity> querySelctedPermission(@Param("roleId") String roleId);

    @Query(value = "select * from lgmn_permission where id not in (select permission_id from lgmn_role_permission where role_id=:roleId)",nativeQuery = true)
    List<LgmnPermissionEntity> queryCanSelctPermission(@Param("roleId") String roleId);

    @Query(value = "select lp.* from lgmn_user lu LEFT JOIN lgmn_user_role lur on lu.id=lur.user_id " +
            " LEFT JOIN lgmn_role_permission lrp on lur.role_id = lrp.role_id" +
            " LEFT JOIN lgmn_permission lp on lrp.permission_id=lp.id " +
            "where lu.id=:userId",nativeQuery = true)
    List<LgmnPermissionEntity> queryUserPermission(@Param("userId") String userId);
}
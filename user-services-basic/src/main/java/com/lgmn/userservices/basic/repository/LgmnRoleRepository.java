package com.lgmn.userservices.basic.repository;

import java.util.Date;
import java.util.List;

import com.lgmn.userservices.basic.dto.LgmnRoleDto;
import com.lgmn.userservices.basic.entity.LgmnRoleEntity;
import com.lgmn.common.repository.LgmnRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LgmnRoleRepository extends LgmnRepository<LgmnRoleEntity, LgmnRoleDto, String> {
    @Query(value = "select lp.* from lgmn_role lp RIGHT JOIN lgmn_user_role lrp on lp.id=lrp.role_id where lrp.user_id=:userId",nativeQuery = true)
    List<LgmnRoleEntity> querySelctedRole(@Param("userId") String userId);

    @Query(value = "select * from lgmn_role where id not in (select role_id from lgmn_user_role where user_id=:userId)",nativeQuery = true)
    List<LgmnRoleEntity> queryCanSelctRole(@Param("userId") String userId);
}
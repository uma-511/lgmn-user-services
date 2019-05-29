package com.lgmn.userservices.basic.dto;

import com.lgmn.common.annotation.Condition;
import com.lgmn.common.domain.LgmnDto;
import com.lgmn.common.enums.ConditionExcept;
import lombok.Data;

import java.util.List;

@Data
public class LgmnRolePermissionDto extends LgmnDto {
    @Condition(except = ConditionExcept.IN)
    protected List<Integer> id;

    @Condition(except = ConditionExcept.IN)
    private List<String> roleId;

    @Condition(except = ConditionExcept.IN)
    private List<String> permissionId;
}
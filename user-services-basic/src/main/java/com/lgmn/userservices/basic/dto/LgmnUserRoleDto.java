package com.lgmn.userservices.basic.dto;

import com.lgmn.common.annotation.Condition;
import com.lgmn.common.domain.LgmnDto;
import com.lgmn.common.enums.ConditionExcept;
import lombok.Data;

import java.util.List;

@Data
public class LgmnUserRoleDto extends LgmnDto {
    @Condition(except = ConditionExcept.IN)
    private List<Integer> id;
    @Condition
    private String userId;
    @Condition(except = ConditionExcept.IN)
    private List<String> roleId;
}
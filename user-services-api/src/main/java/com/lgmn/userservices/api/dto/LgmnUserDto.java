package com.lgmn.userservices.api.dto;

import com.lgmn.common.annotation.Condition;
import com.lgmn.common.domain.LgmnDto;
import com.lgmn.common.enums.ConditionExcept;
import lombok.Data;

import java.sql.Timestamp;
import java.util.List;

@Data
public class LgmnUserDto extends LgmnDto {
    @Condition(except = ConditionExcept.IN)
    private List<String> id;
    @Condition
    private String avatar;
    @Condition
    private String account;
    @Condition(except = ConditionExcept.CONTAIN)
    private String nikeName;
    @Condition
    private String password;

    @Condition(field = "regTime",isMax = true, except = ConditionExcept.BETWEEN_AND)
    private Timestamp endRegTime;

    @Condition(field = "regTime",isMin = true, except = ConditionExcept.BETWEEN_AND)
    private Timestamp beginRegTime;

    @Condition(field = "lastLoginTime",isMax = true, except = ConditionExcept.BETWEEN_AND)
    private Timestamp endLastLoginTime;

    @Condition(field = "lastLoginTime",isMin = true, except = ConditionExcept.BETWEEN_AND)
    private Timestamp beginLastLoginTime;

    @Condition
    private Integer userType;
}

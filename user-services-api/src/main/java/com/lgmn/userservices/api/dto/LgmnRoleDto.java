package com.lgmn.userservices.api.dto;

import com.lgmn.common.annotation.Condition;
import com.lgmn.common.domain.LgmnDto;
import com.lgmn.common.enums.ConditionExcept;
import lombok.Data;

import java.sql.Timestamp;
import java.util.List;

@Data
public class LgmnRoleDto extends LgmnDto {
    @Condition(except = ConditionExcept.IN)
    protected List<String> id;
    private String name;
    private String chineseName;
    private Byte valid;
    private String remark;
    private Timestamp createTime;
    private Timestamp updateTime;
}
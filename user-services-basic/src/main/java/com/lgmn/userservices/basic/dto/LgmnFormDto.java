package com.lgmn.userservices.basic.dto;

import com.lgmn.common.annotation.Condition;
import com.lgmn.common.domain.LgmnDto;
import lombok.Data;

@Data
public class LgmnFormDto extends LgmnDto {
    	@Condition
    private Integer id;
    	@Condition
    private Integer permissionId;
        //表单类型 1:新增表单 2:修改表单 3:详情表单 4:搜索表单
    	@Condition
    private Integer formType;

}
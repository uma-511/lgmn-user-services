package com.lgmn.userservices.basic.dto;

import com.lgmn.common.annotation.Condition;
import com.lgmn.common.domain.LgmnDto;
import lombok.Data;

@Data
public class LgmnRoleFieldDto extends LgmnDto {
    	@Condition
    private Integer id;
    	@Condition
    private Integer roleId;
    	@Condition
    private Integer fieldId;
        //是否显示，0：隐藏 1：显示
    	@Condition
    private Integer isShow;

}
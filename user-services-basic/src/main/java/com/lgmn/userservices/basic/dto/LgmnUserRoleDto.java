package com.lgmn.userservices.basic.dto;

import com.lgmn.common.annotation.Condition;
import com.lgmn.common.domain.LgmnDto;
import lombok.Data;

@Data
public class LgmnUserRoleDto extends LgmnDto {
    	@Condition
    private Integer id;
    	@Condition
    private String userId;
    	@Condition
    private String roleId;

}
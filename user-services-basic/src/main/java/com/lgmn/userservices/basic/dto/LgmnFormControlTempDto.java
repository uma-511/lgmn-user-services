package com.lgmn.userservices.basic.dto;

import com.lgmn.common.annotation.Condition;
import com.lgmn.common.domain.LgmnDto;
import lombok.Data;

@Data
public class LgmnFormControlTempDto extends LgmnDto {
    	@Condition
    private Integer id;
        //控件类型值（input、select、radio...)
    	@Condition
    private String type;
        //控件名称
    	@Condition
    private String name;

}
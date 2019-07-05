package com.lgmn.userservices.basic.dto;

import com.lgmn.common.annotation.Condition;
import com.lgmn.common.domain.LgmnDto;
import lombok.Data;

@Data
public class LgmnFormControlPropsTempDto extends LgmnDto {
    	@Condition
    private Integer id;
        //lgmn_form_control_temp.id
    	@Condition
    private Integer lfctId;
        //属性键
    	@Condition
    private String key;
        //属性值
    	@Condition
    private String value;
        //属性类型：String,Number,Boolean,Object,Array
    	@Condition
    private String type;
        //属性分组：basic,props,validate
    	@Condition
    private String group;

}
package com.lgmn.userservices.basic.dto;

import com.lgmn.common.annotation.Condition;
import com.lgmn.common.domain.LgmnDto;
import lombok.Data;

@Data
public class LgmnFormControlDto extends LgmnDto {
    	@Condition
    private Integer id;
        //控件类型值（input、select、radio...)
    	@Condition
    private String type;
        //控件名称
    	@Condition
    private String name;
        //表单id
    	@Condition
    private Integer formId;
        //字段id
    	@Condition
    private Integer fieldId;
        //字段类型
    	@Condition
    private String fieldType;
        //字段注释
    	@Condition
    private String fieldComment;

}
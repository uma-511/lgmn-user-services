package com.lgmn.userservices.basic.dto;

import com.lgmn.common.annotation.Condition;
import com.lgmn.common.domain.LgmnDto;
import lombok.Data;

@Data
public class LgmnFieldsDto extends LgmnDto {
    	@Condition
    private Integer id;
        //模块id lgmn_premission.type=1
    	@Condition
    private Integer permissionId;
        //表名称
    	@Condition
    private String tableName;
        //字段名
    	@Condition
    private String fieldName;
        //字段类型
    	@Condition
    private String fieldType;
        //字段注释
    	@Condition
    private String fieldComment;
        //多语言id
    	@Condition
    private Integer langId;

}
package com.lgmn.userservices.basic.dto;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import com.lgmn.common.annotation.Condition;
import com.lgmn.common.domain.LgmnDto;
import com.lgmn.common.enums.ConditionExcept;
import lombok.Data;

@Data
public class LgmnPermissionDto extends LgmnDto {
    @Condition(except = ConditionExcept.IN)
    private List<String> id;
        //权限名称
    	@Condition
    private String name;
        //简体中文名称
    	@Condition
    private String chineseName;
        //备注
    	@Condition
    private String remark;
        //创建时间
    	@Condition
    private Timestamp createTime;
        //更新时间
    	@Condition
    private Timestamp updateTime;
        //权限类别 1：模块 2：功能
//    	@Condition
//    private Integer type;
//        //是否设置多语言
//    	@Condition
//    private Integer multilang;
//        //多语言id
//    	@Condition
//    private Integer langId;

}
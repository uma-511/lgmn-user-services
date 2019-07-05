package com.lgmn.userservices.basic.dto;

import java.util.Date;
import com.lgmn.common.annotation.Condition;
import com.lgmn.common.domain.LgmnDto;
import lombok.Data;

@Data
public class LgmnRoleDto extends LgmnDto {
    	@Condition
    private String id;
        //权限名称
    	@Condition
    private String name;
        //中文名称
    	@Condition
    private String chineseName;
        //是否可用 1：是 0：否
    	@Condition
    private byte valid;
        //备注
    	@Condition
    private String remark;
        //创建时间
    	@Condition
    private Date createTime;
        //更新时间
    	@Condition
    private Date updateTime;

}
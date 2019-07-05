package com.lgmn.userservices.basic.dto;

import com.lgmn.common.annotation.Condition;
import com.lgmn.common.domain.LgmnDto;
import lombok.Data;

@Data
public class LgmnLangDto extends LgmnDto {
    	@Condition
    private Integer id;
        //简体中文
    	@Condition
    private String zhCn;
        //繁体中文
    	@Condition
    private String zhTw;
        //美式英文
    	@Condition
    private String enUs;

}
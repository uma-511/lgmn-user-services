package com.lgmn.userservices.basic.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class ResetUserPwdDto implements Serializable {
    private String account;
    private String password;
    private String userType;
}
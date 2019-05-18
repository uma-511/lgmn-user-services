package com.lgmn.userservices.api.util;

import com.lgmn.common.domain.LgmnUserInfo;
import com.lgmn.common.utils.RefUtil;
import org.springframework.security.oauth2.provider.OAuth2Authentication;

import java.security.Principal;
import java.util.Map;

public class UserUtil {
    public static LgmnUserInfo getCurrUser(Principal principal){
        OAuth2Authentication auth2Authentication = (OAuth2Authentication) principal;

        Map<String,String> details = (Map<String,String>)auth2Authentication.getUserAuthentication().getDetails();

        LgmnUserInfo lgmnUserEntity = RefUtil.MapToObject(details,LgmnUserInfo.class);

        return lgmnUserEntity;
    }
}
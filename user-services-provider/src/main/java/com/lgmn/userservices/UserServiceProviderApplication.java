package com.lgmn.userservices;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
@NacosPropertySource(dataId = "user-serviceProvider", autoRefreshed = true)
public class UserServiceProviderApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(UserServiceProviderApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);
    }
}

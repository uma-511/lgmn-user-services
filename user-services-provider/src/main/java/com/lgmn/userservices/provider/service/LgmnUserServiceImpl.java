package com.lgmn.userservices.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.lgmn.common.result.Result;
import com.lgmn.common.result.ResultEnum;
import com.lgmn.userservices.basic.dto.LgmnUserDto;
import com.lgmn.userservices.basic.dto.ResetUserPwdDto;
import com.lgmn.userservices.basic.entity.LgmnUserEntity;
import com.lgmn.userservices.basic.repository.LgmnUserRepository;
import com.lgmn.userservices.basic.service.LgmnUserService;
import com.lgmn.common.service.LgmnAbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.util.StringUtils;

import java.sql.Timestamp;
import java.util.List;

@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class LgmnUserServiceImpl extends LgmnAbstractService<LgmnUserEntity, LgmnUserDto, String, LgmnUserRepository> implements LgmnUserService {

    @Autowired
    private LgmnUserRepository lgmnUserRepository;

    public LgmnUserServiceImpl(LgmnUserRepository repository) {
        super(repository);
    }

    @Override
    public Result register(LgmnUserEntity lgmnUserEntity) {
        LgmnUserEntity userEntity = lgmnUserRepository.findByAccount(lgmnUserEntity.getAccount());
        if(userEntity!=null && userEntity.getUserType().equals(lgmnUserEntity.getUserType())){
                return Result.error(ResultEnum.DATA_EXISTS);
        } else {
            initUser(lgmnUserEntity);
            lgmnUserRepository.save(lgmnUserEntity);
            return Result.success("注册成功");
        }
    }

    @Override
    public Result resetPassword(ResetUserPwdDto resetUserPwdDto) {
        LgmnUserEntity userEntity = lgmnUserRepository.findByAccount(resetUserPwdDto.getAccount());
        if(userEntity==null || !userEntity.getUserType().equals(resetUserPwdDto.getUserType())){
            return Result.error(ResultEnum.DATA_NOT_EXISTS);
        } else {
            userEntity.setPassword(generatePassow(resetUserPwdDto.getPassword()));
            lgmnUserRepository.save(userEntity);
            return Result.success("密码重置成功");
        }
    }

    @Override
    public Result login(LgmnUserDto loginDto) {
        loginDto.getPassword();
        return null;
    }

    private void initUser(LgmnUserEntity lgmnUserEntity){
        String password = lgmnUserEntity.getPassword();
        if(StringUtils.isEmpty(lgmnUserEntity.getAvatar())){
            lgmnUserEntity.setAccount("http://qncdn.gdsdec.com/default/avatar/man.png");
        }
        lgmnUserEntity.setPassword(generatePassow(password));
        lgmnUserEntity.setSalt("123456");
        lgmnUserEntity.setRegTime(new Timestamp(System.currentTimeMillis()));
    }

    private String generatePassow(String password){
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        return bCryptPasswordEncoder.encode(password);
    }
}
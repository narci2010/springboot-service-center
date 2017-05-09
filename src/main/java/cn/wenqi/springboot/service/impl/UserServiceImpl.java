package cn.wenqi.springboot.service.impl;

import cn.wenqi.springboot.entity.Users;
import cn.wenqi.springboot.service.UserService;
import com.alibaba.dubbo.config.annotation.Service;

import java.util.UUID;

/**
 * @author wenqi
 */
@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {

    @Override
    public Users findByUnameAndPwd(String uName, String pwd) {
        return new Users(UUID.randomUUID().toString(),UUID.randomUUID().toString());
    }
}

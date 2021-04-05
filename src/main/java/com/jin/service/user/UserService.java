package com.jin.service.user;

import com.jin.pojo.User;

public interface UserService {
    //用户登录
    public User login(String userCode, String password);
}

package com.benxin.service;

import com.benxin.entity.User;
import entity.Result;

public interface UserService {

    /**
     * 注册
     * @param user
     */
    Result regist(User user);

    /**
     * 获取注册验证码
     */
    void getCode(String code);
}

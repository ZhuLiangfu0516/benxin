package com.benxin.service.impl;

import com.benxin.dao.UserDao;
import com.benxin.entity.User;
import com.benxin.service.UserService;
import entity.Result;
import entity.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    private String code;

    @Override
    public Result regist(User user){
        if(code.equals(user.getCode())){
            System.out.println(user);
            userDao.regist(user);
            return new Result(true, StatusCode.OK,"恭喜您注册成功!");
        }else {
            System.out.println("验证码不正确");
            return new Result(false, StatusCode.ERROR,"服务器繁忙!");
        }
    }


    @Override
    public void getCode(String code) {
        this.code = code;
    }

}

package com.benxin.dao;

import com.benxin.entity.User;
import org.apache.ibatis.annotations.Insert;


public interface UserDao {

    @Insert("insert into user(username,password) VALUES (#{username},#{password}) ")
    void regist(User user);
}

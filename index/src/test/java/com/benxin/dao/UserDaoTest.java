package com.benxin.dao;


import com.benxin.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class UserDaoTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void test(){
        User user = new User();
        user.setId(0);
        user.setCode("");
        user.setUsername("123456");
        user.setPassword("123456");

        userDao.regist(user);
    }

}
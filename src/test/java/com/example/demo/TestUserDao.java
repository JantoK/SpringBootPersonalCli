package com.example.demo;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {DemoApplication.class})

public class TestUserDao {
    private static Logger logger = LoggerFactory.getLogger(TestUserDao.class);

    @Autowired
    private UserDao userDao;

    @Test
    public void test() {
        List<User> all = userDao.findAllUser();
        for (User user : all) {
            System.out.println(user);
        }
        logger.warn("fuck");
    }
}

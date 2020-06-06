package com.example.demo;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {DemoApplication.class})
public class TestUserDao {
    @Autowired
    private UserDao userDao;

    @Test
    public void test() {
        List<User> all = userDao.findAll();
        for (User user : all) {
            System.out.println(user);
        }
    }
}

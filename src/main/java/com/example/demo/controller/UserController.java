package com.example.demo.controller;
import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import com.mysql.cj.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {

    @Resource
    UserDao userDao;

    @GetMapping("/users/getAll")
    public List<User> getAll() {
        return userDao.findAllUser();
    }

    @GetMapping("/users/insert")
    public Boolean insert(String name,String password) {
        if (StringUtils.isNullOrEmpty(name) || StringUtils.isNullOrEmpty(password)) {
            return false;
        }
        User user = new User();
        user.setUsername(name);
        user.setPassword(password);
        return userDao.insertUser(user) > 0;
    }

    @GetMapping("/users/update")
    public Boolean update(Integer id,String name,String password) {
        if (id == null || id < 1 || StringUtils.isNullOrEmpty(name) || StringUtils.isNullOrEmpty(password)) {
            return false;
        }
        User user = new User();
        user.setId(id);
        user.setUsername(name);
        user.setPassword(password);
        return userDao.updateUser(user) > 0;
    }

    @GetMapping("/users/delete")
    public Boolean delete(Integer id) {
        if (id == null || id < 1) {
            return false;
        }
        return userDao.deleteUser(id) > 0;
    }
}

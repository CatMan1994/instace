package com.bc.service.Impl;

import com.bc.common.Contance;
import com.bc.dao.FileDao;
import com.bc.dao.UserDao;
import com.bc.entity.File;
import com.bc.entity.User;
import com.bc.service.FileService;
import com.bc.service.UserService;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Autowired
    private FileService fileService;

    public User getUser(String id) {
        return userDao.getUser(id);
    }

    public void addUser(String phone, String password) {
        User user = new User();
        user.setId(Contance.getUniqId());
        user.setPhone(phone);
        user.setNickName(phone);
        user.setPassword(password);
        userDao.addUser(user);
    }
}

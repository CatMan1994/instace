package com.bc.dao;

import com.bc.entity.User;

public interface UserDao {
    User getUser(String id);
    void addUser(User user);
}

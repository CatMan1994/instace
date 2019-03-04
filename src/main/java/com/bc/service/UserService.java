package com.bc.service;

import com.bc.entity.User;

public interface UserService {
    User getUser(String id);
    void addUser(String phone, String password);
}

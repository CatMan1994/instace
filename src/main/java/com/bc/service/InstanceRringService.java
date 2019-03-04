package com.bc.service;

import com.bc.common.ReturnData;


public interface InstanceRringService {
    void add(String content, String userId);
    ReturnData list();
}

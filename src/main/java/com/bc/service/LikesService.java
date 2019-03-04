package com.bc.service;

import com.bc.common.ReturnData;

public interface LikesService {
    ReturnData add(String instanceId, String userId, String beLikeUserId);
}

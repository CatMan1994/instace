package com.bc.service;

import com.bc.common.ReturnData;

public interface CommentsService {
    ReturnData add(String content, String instanceId, String userId, String beLikeUserId);
}

package com.bc.dao;

import com.bc.entity.Comments;

import java.util.List;

public interface CommentsDao {
    List<Comments> getCommentsByInstanceId(String instanceId);
    void add(Comments comments);
}

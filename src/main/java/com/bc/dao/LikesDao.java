package com.bc.dao;

import com.bc.entity.Likes;

import java.util.List;

public interface LikesDao {
    List<Likes> getLikesByInstanceId(String instanceId);
    void add(Likes likes);
}

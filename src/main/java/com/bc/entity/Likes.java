package com.bc.entity;

import java.util.Date;

public class Likes {
    private String id; // id
    private Date createTime; // 创建时间（即点赞时间）
    private String instanceId; // 关联的即时圈内容表id
    private String userId; // 点赞者id
    private String userName; // 点赞者name
    private String userPhoto; // 点赞者头像
    private String beLikeUserId; // 被点赞者userid
    private int delFlag; // 是否删除点赞 1点赞 2取消点赞

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto;
    }

    public String getBeLikeUserId() {
        return beLikeUserId;
    }

    public void setBeLikeUserId(String beLikeUserId) {
        this.beLikeUserId = beLikeUserId;
    }

    public int getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(int delFlag) {
        this.delFlag = delFlag;
    }
}

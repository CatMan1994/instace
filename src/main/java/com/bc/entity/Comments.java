package com.bc.entity;

import java.util.Date;

public class Comments {
    private String id; // id
    private Date createTime; // 创建时间
    private String content; // 评论内容
    private String instanceId; // 评论的即时圈内容id
    private String responderId; // 评论者userid
    private String responderName; // 评论者name
    private String responderPhoto; // 评论者头像
    private String respondentId; // 被评论者userid
    private String respondentName; // 被评论者name
    private int delFlag; // 是否删除 1是 2否

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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getResponderId() {
        return responderId;
    }

    public void setResponderId(String responderId) {
        this.responderId = responderId;
    }

    public String getResponderName() {
        return responderName;
    }

    public void setResponderName(String responderName) {
        this.responderName = responderName;
    }

    public String getResponderPhoto() {
        return responderPhoto;
    }

    public void setResponderPhoto(String responderPhoto) {
        this.responderPhoto = responderPhoto;
    }

    public String getRespondentId() {
        return respondentId;
    }

    public void setRespondentId(String respondentId) {
        this.respondentId = respondentId;
    }

    public String getRespondentName() {
        return respondentName;
    }

    public void setRespondentName(String respondentName) {
        this.respondentName = respondentName;
    }

    public int getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(int delFlag) {
        this.delFlag = delFlag;
    }
}

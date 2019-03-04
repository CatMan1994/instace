package com.bc.service.Impl;

import com.bc.common.Contance;
import com.bc.common.ReturnData;
import com.bc.dao.CommentsDao;
import com.bc.dao.UserDao;
import com.bc.entity.Comments;
import com.bc.entity.User;
import com.bc.service.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CommentsServiceImpl implements CommentsService {
    @Autowired
    private CommentsDao commentsDao;
    @Autowired
    private UserDao userDao;
    @Transactional(readOnly = true)
    public ReturnData add(String content, String instanceId, String responderId, String respondentId) {
        ReturnData returnData = new ReturnData();
        Comments comments = new Comments();
        try {
            User responder = userDao.getUser(responderId);
            User respondent = userDao.getUser(respondentId);
            comments.setId(Contance.getUniqId());
            comments.setContent(content);
            comments.setInstanceId(instanceId);
            comments.setResponderId(responder.getId());
            comments.setResponderName(responder.getNickName());
            comments.setResponderPhoto(responder.getPhoto());
            comments.setRespondentId(respondent.getId());
            comments.setRespondentName(respondent.getNickName());
            commentsDao.add(comments);
            returnData.setData(null);
        } catch (Exception e) {
            returnData.setData(null);
            returnData.setCode(101);
            returnData.setMsg("评论失败");
        }
        return returnData;
    }
}

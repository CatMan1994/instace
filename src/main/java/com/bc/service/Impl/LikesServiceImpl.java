package com.bc.service.Impl;

import com.bc.common.Contance;
import com.bc.common.ReturnData;
import com.bc.dao.LikesDao;
import com.bc.dao.UserDao;
import com.bc.entity.Likes;
import com.bc.entity.User;
import com.bc.service.LikesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LikesServiceImpl implements LikesService {
    @Autowired
    private LikesDao likesDao;
    @Autowired
    private UserDao userDao;
    @Transactional(readOnly = true)
    public ReturnData add(String instanceId, String userId, String beLikeUserId) {
        ReturnData returnData = new ReturnData();
        Likes likes = new Likes();
        try {
            User user = userDao.getUser(userId);
            likes.setId(Contance.getUniqId());
            likes.setInstanceId(instanceId);
            likes.setUserId(userId);
            likes.setUserName(user.getNickName());
            likes.setUserPhoto(user.getPhoto());
            likes.setBeLikeUserId(beLikeUserId);
            likesDao.add(likes);
            returnData.setData(null);
        } catch (Exception e) {
            returnData.setData(null);
            returnData.setCode(101);
            returnData.setMsg("点赞失败");
        }
        return returnData;
    }
}

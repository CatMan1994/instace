package com.bc.service.Impl;

import com.bc.common.Contance;
import com.bc.common.ReturnData;
import com.bc.dao.*;
import com.bc.entity.File;
import com.bc.entity.InstanceMain;
import com.bc.service.InstanceRringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class InstanceRingServiceImpl implements InstanceRringService {
    @Autowired
    private InstanceRingDao instanceRingDao;
    @Autowired
    private UserDao userDao;
    @Autowired
    private FileDao fileDao;
    @Autowired
    private LikesDao likesDao;
    @Autowired
    private CommentsDao commentsDao;
    // 插入数据库时，要插入多个表的话，用事务，以下注解即可，一个个表插
    @Transactional(readOnly = true)
    public void add(String content, String userId) {
        InstanceMain instanceMain = new InstanceMain();
        instanceMain.setId(Contance.getUniqId());
        instanceMain.setContent(content);
        instanceMain.setUserId(userId);
        instanceRingDao.add(instanceMain);
    }

    /**
     * list查询方式是，先查出主表的list，然后再for循环去查关联表的信息
     * @return
     */
    public ReturnData list() {
        ReturnData returnData = new ReturnData();
        List<InstanceMain> list = new ArrayList<InstanceMain>();
        list = instanceRingDao.list();
        if (list != null && list.size() > 0) {
            for (InstanceMain instanceMain : list) {
                // setUser
                instanceMain.setUser(userDao.getUser(instanceMain.getUserId()));
                // set图片
                instanceMain.setImages(fileDao.getFilesByInstanceId(instanceMain.getId()));
                // set点赞和评论
                instanceMain.setLikesList(likesDao.getLikesByInstanceId(instanceMain.getId()));
                instanceMain.setCommentsList(commentsDao.getCommentsByInstanceId(instanceMain.getId()));
            }
        }
        returnData.setData(list);
        return returnData;
    }
}

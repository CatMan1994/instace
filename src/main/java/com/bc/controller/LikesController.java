package com.bc.controller;

import com.bc.common.ReturnData;
import com.bc.entity.Likes;
import com.bc.service.LikesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/like")
public class LikesController {
    @Autowired
    private LikesService likesService;
    @ResponseBody
    @RequestMapping(value = "/add")
    ReturnData add(String instanceId, String userId, String beLikeUserId){
        return likesService.add(instanceId, userId, beLikeUserId);
    }
}

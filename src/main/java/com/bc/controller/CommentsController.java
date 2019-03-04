package com.bc.controller;

import com.bc.common.ReturnData;
import com.bc.service.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/comment")
public class CommentsController {
    @Autowired
    private CommentsService commentsService;
    @ResponseBody
    @RequestMapping(value = "/add")
    ReturnData add(String content, String instanceId, String responderId, String respondentId){
        return commentsService.add(content, instanceId, responderId, respondentId);
    }
}

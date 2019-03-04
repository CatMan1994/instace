package com.bc.controller;

import com.bc.common.ReturnData;
import com.bc.service.InstanceRringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/instantring")
public class InstantRingController {
    @Autowired
    private InstanceRringService instanceRringService;

    @ResponseBody
    @RequestMapping(value = "/list")
    public ReturnData list () {
        return instanceRringService.list();
    }
    @ResponseBody
    @RequestMapping(value = "add")
    public ReturnData add (String content, String userId) {
        ReturnData returnData = new ReturnData();
        instanceRringService.add(content, userId);
        return returnData;
    }
}

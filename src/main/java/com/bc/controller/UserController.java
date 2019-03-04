package com.bc.controller;

import com.bc.common.ReturnData;
import com.bc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/get")
    public ReturnData get (String id) {
        ReturnData returnData = new ReturnData();
        returnData.setData(userService.getUser(id));
        return returnData;
    }

    @ResponseBody
    @RequestMapping("/add")
    public ReturnData add (String phone, String password) {
        ReturnData returnData = new ReturnData();
        userService.addUser(phone, password);
        return returnData;
    }
}

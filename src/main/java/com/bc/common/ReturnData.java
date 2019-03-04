package com.bc.common;

import org.springframework.stereotype.Component;

@Component
public class ReturnData {
    private int code; // 状态码
    private String msg; // 描述信息
    private Object data; // 返回data

    public ReturnData () {
        code = 200;
        msg = "成功";
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}

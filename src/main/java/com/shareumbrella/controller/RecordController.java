package com.shareumbrella.controller;

import com.alibaba.fastjson.JSON;
import com.shareumbrella.service.IRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RecordController {
    @Autowired
    private IRecordService recordService;

    @ResponseBody
    @RequestMapping(method = RequestMethod.POST, value = "/record")
    public String record(String openid){
        System.out.println(JSON.toJSONString(recordService.selectByOpenid(openid)));

        return JSON.toJSONString(recordService.selectByOpenid(openid));
    }

}

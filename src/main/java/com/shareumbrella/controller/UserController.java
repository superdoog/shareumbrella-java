package com.shareumbrella.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.shareumbrella.entity.User;
import com.shareumbrella.service.IUserService;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.poi.util.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class UserController {

    @Autowired
    private IUserService userService;

    @ResponseBody
    @RequestMapping("/getOpenid")
    public String getUserInfo(@RequestParam(name = "code") String code) throws Exception {
        Map<String, Object> rtnMap = new HashMap<String, Object>();
        String url = "https://api.weixin.qq.com/sns/jscode2session";
        //自己的appid
        url += "?appid=wxfb8650e9472e0c9b";
        //密匙
        url += "&secret=7ca610e1e92a9fe8246c80a49e49452d";
        url += "&js_code=" + code;
        url += "&grant_type=authorization_code";
        byte[] res = null;
        HttpClient httpclient = new DefaultHttpClient();
        HttpGet httpget = new HttpGet(url);
        HttpResponse response = null;
        try {
            response = httpclient.execute(httpget);
            res = IOUtils.toByteArray(response.getEntity().getContent());
        } catch (Exception e) {
            throw e;
        } finally {
            if (httpget != null) {
                httpget.abort();
            }
            httpclient.getConnectionManager().shutdown();
        }
        JSONObject jo = JSON.parseObject(new String(res, "utf-8"));
        String openid = jo.getString("openid");
        System.out.println("openid:");
        System.out.println(openid);

        User user = userService.getById(openid);

        Map<String, Object> map = new HashMap<>();
        map.put("openid", openid);
        map.put("user", user);

        return JSON.toJSONString(map);

    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.POST, value = "/register")
    public String register(String openid, String username, String password) {
        User user = new User(openid, username, password);
        boolean flag = userService.add(user);
        if (flag) {
            return "200";
        } else {
            return "FAIL";
        }
    }
}

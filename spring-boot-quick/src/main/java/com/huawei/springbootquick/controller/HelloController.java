package com.huawei.springbootquick.controller;

import com.huawei.springbootquick.pojo.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Controller
public class HelloController {
    private Logger logger = LoggerFactory.getLogger(HelloController.class);
    @RequestMapping("/success")
    public String success(HttpServletRequest http,Map<String, Object> map){
        logger.info("调用开始===");
        map.put("hello","你好");
        map.put("hello2","<h1>你好呀</h1>");
        map.put("users", Arrays.asList("张三","李四","王五"));
        map.put("userAges", Arrays.asList("18","19","20"));
        map.put("uList", Arrays.asList("18","19","20","","123","123","123","123","123","123","123","123","123","123","123","123","123","123","123","123","123","123","123","123","23","123","123"));
        http.getSession().setAttribute("zwq","我媳妇");
        User user = new User("zwq",18,"guangzhou","qq");
        User user2 = new User("zwq2",18,"guangzhou","qq");
        User user3 = new User("zwq3",18,"guangzhou","qq");
        User user4 = new User("zwq4",18,"guangzhou","qq");
        List list = new ArrayList<User>();
        list.add(user);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        map.put("userList",list);
        map.put("user",user);

        logger.info("调用结束===");
        return "success";
    }

    @RequestMapping("user2")
    public String user2(String name,int age){
        System.out.println(name);
        System.out.println(age);
        return "B";
    }
}

package com.qf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("f")
    public String test(){

        return "login";
    }
    @RequestMapping("Home")
    public String test5(){

        return "Home";
    }



    @RequestMapping("/unauthorize")
    public String test2(){

        return "unauthorize";
    }
    @RequestMapping("/test2")
    public String test3(){

        return "success";
    }
}

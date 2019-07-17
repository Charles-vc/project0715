package com.qf.controller;

import com.qf.pojo.User;
import com.qf.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    @Autowired
    private SecurityManager securityManager;
    @Autowired
    private UserService userService;

    @RequestMapping("/first")
    public String test(){
        return "login";
    }
    @RequestMapping("Home")
    public String home(){
        return "Home";
    }
    @RequestMapping("login")
    public String login(User user, HttpSession session){
        SecurityUtils.setSecurityManager(securityManager);
        session.setAttribute("user",user);
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(user.getUname(),user.getPassword());
        try{
            subject.login(usernamePasswordToken);
            if(subject.isAuthenticated()){
                int uid = userService.getUid(user.getUname());
                session.setAttribute("uid",uid);
                return "index";
            }
        }catch (SecurityException e){
            System.out.println("登录失败");
        }
        return "login";


    }
    @RequestMapping("/unauthorize")
    public String test2(){

        return "unauthorize";
    }
    @RequestMapping("/kk")
    public String test3(){

        return "kk";
    }
    @RequestMapping("home")
    public String home1(){
        return  "Home";
    }
    @RequestMapping("updatePassword")
    public String updatePassword(String password,HttpSession session){
        int uid = (int) session.getAttribute("uid");
        userService.updatePassword(uid,password);
        return "restart";
    }


}

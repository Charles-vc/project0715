package com.qf.controller;

import com.qf.pojo.Sleave;
import com.qf.pojo.Student;
import com.qf.pojo.Weekly;
import com.qf.service.StudentService;
import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @autor hhh
 * @create 2019/7/16
 */
@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("studetail")
    public String detail(Model model, HttpSession session){
       int uid = (int) session.getAttribute("uid");
        System.out.println(uid);
        Student studentByUid = null;
        studentByUid= studentService.getStudentByUid(uid);
        System.out.println("studentByUid = " + studentByUid);
        session.setAttribute("sid",studentByUid.getSid());
        session.setAttribute("Student",studentByUid);
        model.addAttribute("Student",studentByUid);
        return "/student/SingleStudentDetail";
    }
    @RequestMapping("updatestudent")
    public String updateSingleStudent(Student student,HttpSession session){
        System.out.println(student.getSname());
        System.out.println(student.getSage());
        int sid = (int) session.getAttribute("sid");
        student.setSid(sid);
        int i = studentService.updateStudent(student);
        System.out.println(i);
        return "redirect:studetail";

    }
    @RequestMapping("updateSingleStudent")
    public String jumpUpdate(){
        return "/student/UpdateSingleStudent";

    }
    @RequestMapping("upword")
    public String upword(){
        return  "/student/updatePassword";
    }
    @RequestMapping("/sweeklyshow")
    public String weekly(HttpSession session,Model model){
        int sid = (int) session.getAttribute("sid");
        System.out.println(sid);
        List<Weekly> weeklyListBySid = studentService.getWeeklyListBySid(sid);
        System.out.println(weeklyListBySid);
        model.addAttribute("SingleStudentWeeklyList",weeklyListBySid);
        return "/student/lookMyWeekly";
    }
    @RequestMapping("/deletesWeekly")
    @ResponseBody
    public String deletesWeekly(int wid){
        System.out.println(wid);
        studentService.delWeekly(wid);
        return "aaa";
    }
    @RequestMapping("addsWeekly")
    public String addWeekly(){
        return "/student/addWeekly";

    }
    @RequestMapping("addsWeekly1")
    public String addWeekly1(Weekly weekly,HttpSession session){
        int sid = (int) session.getAttribute("sid");
        weekly.setSid(sid);
        System.out.println(weekly);
        int i = studentService.addWeekly(weekly);
        return "redirect:sweeklyshow";
    }
    @RequestMapping("showsLeave")
    public String showsLeave(HttpSession session,Model model){
        int sid = (int) session.getAttribute("sid");
        List<Sleave> sleaveListBySid = studentService.getSleaveListBySid(sid);
        System.out.println(sleaveListBySid);
        model.addAttribute("showsLeave",sleaveListBySid);
        return "/student/showLeave";
    }

}

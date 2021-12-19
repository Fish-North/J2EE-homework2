package com.homework.controller;

import com.homework.pojo.Curriculum;
import com.homework.pojo.Homework;
import com.homework.pojo.Teacher;
import com.homework.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

/**
 * @Author 24962
 * @create 2021/12/16 12:39
 */
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired
    @Qualifier("teacherServiceImpl")
    private TeacherService teacherService;

    public void setTeacherService(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @GetMapping("/login")
    public String login(@RequestParam("teacherID")Integer teacherID, @RequestParam("teacherPassword")String teacherPassword, Model model, HttpServletRequest request){
        if(teacherService.login(teacherID,teacherPassword)){
            model.addAttribute("status","loginSucceed");
            HttpSession session = request.getSession();
            session.setAttribute("teacherID",teacherID);
            return "/teacher/login";
        }
        model.addAttribute("status","loginFailed");
        return "/teacher/loginFailed";
    }

    @GetMapping("/assignHomework")
    public String assignHomework(@RequestParam("courseID")Integer courseID,@RequestParam("homeworkDescription")String description, Model model){
        Integer id =(int) new Date().getTime();
        Homework homework = new Homework(id,description,courseID);
        teacherService.assignHomework(homework);
        model.addAttribute("status","assign successfully!");
        return "/teacher/assignHomework";
    }

    @GetMapping("/myHomework")
    public String myHomework(HttpServletRequest request, Model model){
        HttpSession session = request.getSession();
        Integer teacherID = (Integer) session.getAttribute("teacherID");
        List<Homework> homeworkList = teacherService.myHomework(teacherID);
        model.addAttribute("homeworkList",homeworkList);
        model.addAttribute("status","query successfully!");
        return "/teacher/myHomework";
    }

    @GetMapping("/modifyPassword")
    public String modifyPassword(@RequestParam("newPassword")String newPassword,Model model,HttpServletRequest request){
        HttpSession session = request.getSession();
        Integer teacherID = (Integer) session.getAttribute("teacherID");
        teacherService.modifyPassword(newPassword,teacherID);
        model.addAttribute("status","modify successfully!");
        return "/teacher/modifyPassword";
    }

    @GetMapping("/checkHomework")
    public String checkHomework(@RequestParam("homeworkID")Integer homeworkID,Model model){
        List<Object[]> list = teacherService.checkHomework(homeworkID);
        model.addAttribute("list",list);
        model.addAttribute("status","query successfully");
        return "/teacher/checkHomework";
    }

    @GetMapping("/myCourse")
    public String myCourse(HttpServletRequest request, Model model){
        HttpSession session = request.getSession();
        Integer teacherID = (Integer) session.getAttribute("teacherID");
        List<Curriculum> courseList = teacherService.myCourse(teacherID);
        model.addAttribute("courseList",courseList);
        model.addAttribute("status","query successfully");
        return "/teacher/myCourse";
    }

    @GetMapping("/myInfo")
    public String myInfo(HttpServletRequest request, Model model){
        HttpSession session = request.getSession();
        Integer teacherID = (Integer) session.getAttribute("teacherID");
        Teacher teacher = teacherService.myInfo(teacherID);
        model.addAttribute("teacher",teacher);
        model.addAttribute("status","query successfully!");
        return "/teacher/myInfo";
    }
}

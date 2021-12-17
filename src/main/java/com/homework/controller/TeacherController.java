package com.homework.controller;

import com.homework.service.TeacherService;
import com.homework.service.impl.TeacherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author 24962
 * @create 2021/12/16 12:39
 */
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired
    @Qualifier("teacherServiceImpl")
    private TeacherService teacherService;

    @GetMapping("/login")
    public String login(@RequestParam("teacherID")Integer teacherID,@RequestParam("teacherPassword")String teacherPassword,Model model){
        if(teacherService.login(teacherID,teacherPassword)){
            model.addAttribute("status","loginSucceed");
            return "teacher";
        }
        model.addAttribute("status","loginFailed");
        return "";
    }

    @GetMapping("/assignHomework")
    public String assignHomework(){
        return "assignHomework";
    }
}

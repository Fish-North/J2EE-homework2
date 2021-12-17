package com.homework.controller;


import com.homework.service.TeacherService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/teacher")
public class TeacherController {


    @GetMapping("/login")
    public String login(Model model){
        model.addAttribute("code",0);
        return " ";
    }
}

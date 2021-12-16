package com.homework.controller;

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
    @GetMapping("/assignHomework")
    public String assignHomework(Model model){

        return null;
    }
}

package com.homework.controller;

import com.homework.service.StudentService;
import com.homework.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author 24962
 * @create 2021/12/17 15:50
 */
@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    @Qualifier("studentServiceImpl")
    private StudentService studentService;

    @GetMapping("/submitHomework")
    public String submitHomework(){
        return "submitHomework";
    }
}

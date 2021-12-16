package com.homework.service;


import org.springframework.web.servlet.ModelAndView;


public interface TeacherService {
    ModelAndView login(Integer teacherID, String teacherPassword);
}

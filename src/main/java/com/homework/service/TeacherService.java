package com.homework.service;

import com.homework.pojo.Curriculum;
import com.homework.pojo.Homework;

import java.util.List;

/**
 * @Author 24962
 * @create 2021/12/17 1:07
 */
public interface TeacherService {
    boolean login(Integer teacherID,String teacherPassword);
    List<Homework> myHomework(Integer teacherID);
    List<Curriculum> myCourse(Integer teacherID);
    void assignHomework(Homework homework);
    void modifyPassword(String newPassword,Integer teacherID);
    void checkHomework(Integer homeworkID);
}

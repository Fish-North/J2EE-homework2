package com.homework.service;

import com.homework.pojo.Homework;
import com.homework.pojo.Curriculum;
import com.homework.pojo.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author 24962
 * @create 2021/12/17 15:27
 */
@Service
public interface StudentService {
    //login
    boolean login(Integer studentID,String password);
    //提交作业
    void submitHomework(Homework homework, Integer studentID, String fileUrl);
    //撤销作业
    void withdrawHomework(Integer homeworkID, Integer studentID);
    //查看自己有哪些作业
    List<Homework> myHomework(Integer studentID);
    //查看自己的课程表
    List<Curriculum> myCourse(Integer studentID);
    //修改自己的密码
    void modifyPassword(String newPassword,Integer studentID);
    //查看自己的信息
    Student myInfo(Integer studentID);
    //查看自己的某一次作业
    List<Object> queryHomeworkByID(@Param("studentID")Integer studentID, @Param("homeworkID")Integer homeworkID);
}

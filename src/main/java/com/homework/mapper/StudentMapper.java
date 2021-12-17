package com.homework.mapper;

import com.homework.pojo.Curriculum;
import com.homework.pojo.Homework;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author 24962
 * @create 2021/12/15 23:36
 */
public interface StudentMapper {
    //提交作业
    void submitHomework(@Param("homework")Homework homework,@Param("studentID")Integer studentID,@Param("fileUrl")String fileUrl);
    //撤销作业
    void withdrawHomework(@Param("homeworkID")Integer homeworkID, @Param("studentID")Integer studentID);
    //查看自己有哪些作业
    List<Homework> myHomework(@Param("studentID")Integer studentID);
    //查看自己的课程表
    List<Curriculum> myCourse(@Param("studentID")Integer studentID);
    //修改自己的密码
    void modifyPassword(@Param("newPassword")String newPassword,@Param("studentID")Integer studentID);
}

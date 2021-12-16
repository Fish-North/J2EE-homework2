package com.homework.mapper;

import com.homework.pojo.Curriculum;
import com.homework.pojo.Homework;
import com.homework.pojo.Student;
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
    //
    List<Curriculum> myCourse(@Param("courseID")Integer courseID);
    void modifyPassword(@Param("newPassword")String newPassword,@Param("studentID")Integer studentID);
}

package com.homework.mapper;

import com.homework.pojo.Homework;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface TeacherMapper {
     //布置作业
     void assignHomework(@Param("homework") Homework homework);

     //查看自己名下的所有作业
     List<Homework> myHomework(@Param("teacherID")Integer teacherID);

     //修改教师的密码
     void modifyPassword(@Param("newPassword")String newPassword,@Param("teacherID")Integer teacherID);

     //检查布置的某次作业的完成情况
     void checkHomework(@Param("homeworkID") Integer homeworkID);
}

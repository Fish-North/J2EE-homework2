package com.homework.mapper;

import com.homework.pojo.Homework;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

public interface TeacherMapper {
     void assignHomework(@Param("homework") Homework homework, @Param("courseID") Integer courseID);
     void myHomework(Integer teacherID);
     void modifyPassword(String newPassword);
     void checkHomework(Map<String,Object> parameterMap);
}

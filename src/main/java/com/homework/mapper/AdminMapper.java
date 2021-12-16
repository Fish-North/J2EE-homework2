package com.homework.mapper;

import com.homework.pojo.Student;
import com.homework.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

/**
 * @Author 24962
 * @create 2021/12/16 12:10
 */
public interface AdminMapper {
    void registerTeacher(@Param("teacher")Teacher teacher);
    void registerStudent(@Param("student")Student student);
    void deleteTeacher(@Param("teacherID")Integer teacherID);
    void deleteStudent(@Param("studentID")Integer student);
}

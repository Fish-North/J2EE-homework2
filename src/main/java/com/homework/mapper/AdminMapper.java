package com.homework.mapper;

import com.homework.pojo.Curriculum;
import com.homework.pojo.Student;
import com.homework.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author 24962
 * @create 2021/12/16 12:10
 */
public interface AdminMapper {
    /*
     *教师注册
     */
    void registerTeacher(@Param("teacher") Teacher teacher);

    /*
     *学生注册
     */
    void registerStudent(@Param("student") Student student);

    /*
     *根据教师id删除教师
     */
    void deleteTeacher(@Param("teacherID") Integer teacherID);

    /*
     *根据学生id删除学生
     */
    void deleteStudent(@Param("studentID") Integer studentID);

    /*
     *添加课程
     */
    void addCourse(@Param("course") Curriculum course);

    /*
     *添加学生到课程
     */
    void addStudentToCourse(@Param("studentID") Integer studentId, @Param("courseID") Integer courseID);

    /*
     *查看所有课程
     */
    List<Curriculum> allCourse();

    /*
     *查看课程下的教师
     */
    Teacher queryTeacherByCourseID(@Param("courseID")Integer courseID);

    /*
     *查看课程下的学生
     */
    List<Student> queryStudentByStudentID(@Param("studentID")Integer studentID);
}

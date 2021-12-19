package com.homework.service;

import com.homework.pojo.Curriculum;
import com.homework.pojo.Student;
import com.homework.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author 24962
 * @create 2021/12/17 15:37
 */
@Service
public interface AdminService {
    /*
     *教师注册
     */
    void registerTeacher(Teacher teacher);

    /*
     *学生注册
     */
    void registerStudent(Student student);

    /*
     *根据教师id删除教师
     */
    void deleteTeacher(Integer teacherID);

    /*
     *根据学生id删除学生
     */
    void deleteStudent(Integer studentID);

    /*
     *添加课程
     */
    void addCourse(Curriculum course);

    /*
     *添加学生到课程
     */
    void addStudentToCourse(Integer studentId, Integer courseID);

    /*
     *查看所有课程
     */
    List<Curriculum> allCourse();

    /*
     *查看课程下的教师
     */
    Teacher queryTeacherByCourseID(Integer courseID);

    /*
     *查看课程下的学生
     */
    List<Student> queryStudentByStudentID(Integer studentID);
}

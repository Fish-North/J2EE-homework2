package com.homework.service;

import com.homework.pojo.Curriculum;
import com.homework.pojo.Student;
import com.homework.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

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
        void addStudentToClass( Integer studentId, Integer courseID);

        /*
         *查看所有课程
         */
        List<Curriculum> allCourse();

        /*
         *查看课程下的教师
         */
        Teacher queryWhoTeachCourse(Integer courseID);

        /*
         *查看课程下的学生
         */
        List<Student> queryWhoStudyCourse(Integer courseID);

}

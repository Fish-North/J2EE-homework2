package com.homework.service.impl;

import com.homework.mapper.AdminMapper;
import com.homework.pojo.Curriculum;
import com.homework.pojo.Student;
import com.homework.pojo.Teacher;
import com.homework.service.AdminService;

import java.util.List;

/**
 * @Author 24962
 * @create 2021/12/17 15:40
 */
public class AdminServiceImpl implements AdminService {
    private AdminMapper adminMapper;

    public void setAdminMapper(AdminMapper adminMapper) {
        this.adminMapper = adminMapper;
    }

    @Override
    public void registerTeacher(Teacher teacher) {
        adminMapper.registerTeacher(teacher);
    }

    @Override
    public void registerStudent(Student student) {
        adminMapper.registerStudent(student);
    }

    @Override
    public void deleteTeacher(Integer teacherID) {
        adminMapper.deleteTeacher(teacherID);
    }

    @Override
    public void deleteStudent(Integer studentID) {
        adminMapper.deleteStudent(studentID);
    }

    @Override
    public void addCourse(Curriculum course) {
        adminMapper.addCourse(course);
    }

    @Override
    public void addStudentToCourse(Integer studentId, Integer courseID) {
        adminMapper.addStudentToCourse(studentId,courseID);
    }

    @Override
    public List<Curriculum> allCourse() {
        return adminMapper.allCourse();
    }

    @Override
    public Teacher queryTeacherByCourseID(Integer courseID) {
        return adminMapper.queryTeacherByCourseID(courseID);
    }

    @Override
    public List<Student> queryStudentByStudentID(Integer studentID) {
        return adminMapper.queryStudentByStudentID(studentID);
    }
}

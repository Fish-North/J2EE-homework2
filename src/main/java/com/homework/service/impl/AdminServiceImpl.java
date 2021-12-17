package com.homework.service.impl;

import com.homework.mapper.AdminMapper;
import com.homework.pojo.Curriculum;
import com.homework.pojo.Student;
import com.homework.pojo.Teacher;
import com.homework.service.AdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    @Resource
    private AdminMapper adminMapper;

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
    public void addStudentToClass(Integer studentId, Integer courseID) {
        adminMapper.addStudentToClass(studentId, courseID);
    }

    @Override
    public List<Curriculum> allCourse() {
        return adminMapper.allCourse();
    }

    @Override
    public Teacher queryWhoTeachCourse(Integer courseID) {
        return queryWhoTeachCourse(courseID);
    }

    @Override
    public List<Student> queryWhoStudyCourse(Integer courseID) {
        return queryWhoStudyCourse(courseID);
    }
}

package com.homework.service.impl;

import com.homework.mapper.StudentMapper;
import com.homework.pojo.Curriculum;
import com.homework.pojo.Homework;
import com.homework.service.StudentService;

import java.util.List;

/**
 * @Author 24962
 * @create 2021/12/17 15:30
 */
public class StudentServiceImpl implements StudentService {
    public void setStudentMapper(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    private StudentMapper studentMapper;

    @Override
    public void submitHomework(Homework homework, Integer studentID, String fileUrl) {
        studentMapper.submitHomework(homework,studentID,fileUrl);
    }

    @Override
    public void withdrawHomework(Integer homeworkID, Integer studentID) {
        studentMapper.withdrawHomework(homeworkID,studentID);
    }

    @Override
    public List<Homework> myHomework(Integer studentID) {
        return studentMapper.myHomework(studentID);
    }

    @Override
    public List<Curriculum> myCourse(Integer studentID) {
        return studentMapper.myCourse(studentID);
    }

    @Override
    public void modifyPassword(String newPassword, Integer studentID) {
        studentMapper.modifyPassword(newPassword,studentID);
    }
}

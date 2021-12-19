package com.homework.service.impl;

import com.homework.mapper.StudentMapper;
import com.homework.pojo.Curriculum;
import com.homework.pojo.Homework;
import com.homework.pojo.Student;
import com.homework.service.StudentService;
import com.homework.utils.SqlSessionFactoryUtil;

import java.util.List;

/**
 * @Author 24962
 * @create 2021/12/17 15:30
 */
public class StudentServiceImpl implements StudentService {

    private StudentMapper studentMapper;
    public void setStudentMapper(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    @Override
    public boolean login(Integer studentID,String password){
        boolean flag = false;
        studentMapper = SqlSessionFactoryUtil.getSqlSession().getMapper(StudentMapper.class);
        Student student = studentMapper.myInfo(studentID);
        if(student.getStudentPassword().equals(password)){
            flag = true;
        }
        return flag;
    }

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

    @Override
    public Student myInfo(Integer studentID){
        return studentMapper.myInfo(studentID);
    }

    @Override
    public List<Object> queryHomeworkByID(Integer studentID, Integer homeworkID) {
        return studentMapper.queryHomeworkByID(studentID,homeworkID);
    }
}

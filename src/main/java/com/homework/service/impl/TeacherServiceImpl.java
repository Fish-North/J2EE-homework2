package com.homework.service.impl;

import com.homework.mapper.TeacherMapper;
import com.homework.pojo.Curriculum;
import com.homework.pojo.Homework;
import com.homework.pojo.Teacher;
import com.homework.service.TeacherService;
import com.homework.utils.SqlSessionFactoryUtil;

import java.util.List;

/**
 * @Author 24962
 * @create 2021/12/17 1:18
 */
public class TeacherServiceImpl implements TeacherService {
    private TeacherMapper teacherMapper;


    @Override
    public boolean login(Integer teacherID, String teacherPassword) {
        boolean flag = false;
        teacherMapper = SqlSessionFactoryUtil.getSqlSession().getMapper(TeacherMapper.class);
        Teacher teacher = teacherMapper.myInfo(teacherID);
        if(teacher.getTeacherPassword().equals(teacherPassword)){
            flag = true;
        }
        return flag;
    }

    @Override
    public List<Homework> myHomework(Integer teacherID) {
        return teacherMapper.myHomework(teacherID);
    }

    @Override
    public List<Curriculum> myCourse(Integer teacherID) {
        return teacherMapper.myCourse(teacherID);
    }

    @Override
    public void assignHomework(Homework homework) {
        teacherMapper.assignHomework(homework);
    }

    @Override
    public void modifyPassword(String newPassword,Integer teacherID) {
        teacherMapper.modifyPassword(newPassword,teacherID);
    }

    @Override
    public void checkHomework(Integer homeworkID) {
        teacherMapper.checkHomework(homeworkID);
    }

    public void setTeacherMapper(TeacherMapper teacherMapper) {
        this.teacherMapper = teacherMapper;
    }
}

package com.homework.service.impl;

import com.homework.mapper.HomeworkMapper;
import com.homework.pojo.Homework;
import com.homework.service.HomeworkService;

import java.util.List;

/**
 * @Author 24962
 * @create 2021/12/19 10:49
 */
public class HomeworkServiceImpl implements HomeworkService {
    private HomeworkMapper homeworkMapper;

    public void setHomeworkMapper(HomeworkMapper homeworkMapper) {
        this.homeworkMapper = homeworkMapper;
    }

    @Override
    public List<Homework> allHomework() {
        return homeworkMapper.allHomework();
    }

    @Override
    public Homework queryHomeworkByID(Integer homeworkID) {
        return homeworkMapper.queryHomeworkByID(homeworkID);
    }
}

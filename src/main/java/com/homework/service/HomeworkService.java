package com.homework.service;

import com.homework.pojo.Homework;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author 24962
 * @create 2021/12/19 10:46
 */
@Service
public interface HomeworkService {
    List<Homework> allHomework();
    Homework queryHomeworkByID(Integer homeworkID);
}

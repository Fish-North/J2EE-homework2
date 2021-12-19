package com.homework.mapper;

import com.homework.pojo.Homework;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author 24962
 * @create 2021/12/18 12:10
 */
public interface HomeworkMapper {
    List<Homework> allHomework();
    Homework queryHomeworkByID(@Param("homeworkID")Integer homeworkID);
}

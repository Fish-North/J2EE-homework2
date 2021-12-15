package com.homework.mapper;

import com.homework.pojo.Homework;
import org.apache.ibatis.annotations.Param;

/**
 * @Author 24962
 * @create 2021/12/15 23:36
 */
public interface StudentMapper {
    //提交作业
    void submitHomework(@Param("homework")Homework homework);
}

package com.homework.mapper;

import com.homework.pojo.Homework;
import com.homework.utils.SqlSessionFactoryUtil;
import org.junit.Test;

/**
 * @Author 24962
 * @create 2021/12/15 23:21
 */
public class TeacherMapperTest {
    @Test
    public void assignHomeworkTest(){
        TeacherMapper teacherMapper = SqlSessionFactoryUtil.getSqlSession().getMapper(TeacherMapper.class);
        Homework homework = new Homework(123,"homework test",2);
        teacherMapper.assignHomework(homework);
    }

}

package com.homework.mapper;

import com.homework.pojo.Student;
import com.homework.utils.SqlSessionFactoryUtil;
import org.junit.Test;

/**
 * @Author 24962
 * @create 2021/12/15 23:21
 */
public class TeacherMapperTest {
    @Test
    public void assignHomeworkTest(){
        StudentMapper sm = SqlSessionFactoryUtil.getSqlSession().getMapper(StudentMapper.class);
        System.out.println(sm.myInfo(456));
    }
}

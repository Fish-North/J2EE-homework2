package com.homework.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Author 24962
 * @create 2021/12/13 14:43
 * sql会话工厂工具类，用于快捷创建SqlSession实例
 */
public class SqlSessionFactoryUtil {

    private final static Class<com.homework.utils.SqlSessionFactoryUtil> Lock = com.homework.utils.SqlSessionFactoryUtil.class;
    private static SqlSessionFactory sqlSessionFactory = null;

    //构造方法私有，使其不能通过代码构建，采用单例模式
    private SqlSessionFactoryUtil(){}

    //获取SqlSessionFactory实例
    private static SqlSessionFactory getSqlSessionFactory(){
        synchronized (Lock){
            if(sqlSessionFactory!=null){
                return sqlSessionFactory;
            }
            String resource = "mybatis-config.xml";
            InputStream inputStream;
            try {
                inputStream = Resources.getResourceAsStream(resource);
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            }catch (IOException e){
                e.printStackTrace();
                return null;
            }
            return sqlSessionFactory;
        }
    }

    //构建SqlSession
    public static SqlSession getSqlSession(){
        if(sqlSessionFactory==null){
            getSqlSessionFactory();
        }
        return sqlSessionFactory.openSession();
    }

}

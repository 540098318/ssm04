package com.spring.dao;

import com.spring.entity.Users;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class UsersMapperTest {
    private ApplicationContext applicationContext;
    @Autowired
    private UsersMapper mapper;
    @Before
    public void setUp() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
        mapper = applicationContext.getBean(UsersMapper.class);
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("success");
    }

    @Test
    public void insert() {
        Users u = new Users();
        u.setId(2);
        u.setAge(12);
        u.setName("weiwei");
        int result = mapper.insert(u);
        System.out.println(result);
        assert (result==1);

    }
}
package com.example.demo;

import com.example.demo.dao.Utils;
import com.example.demo.mapper.CategoryMapper;
import com.example.demo.pojo.Category;
import com.example.demo.pojo.Product;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@SpringBootApplication
public class DemoApplication {

    @Autowired
    Utils utils;
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}

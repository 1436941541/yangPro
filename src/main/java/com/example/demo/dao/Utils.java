package com.example.demo.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Utils {
    @Value("${ll.sdsd}")
    private String s;
    public void test() {
        System.out.println(s);
    }
}

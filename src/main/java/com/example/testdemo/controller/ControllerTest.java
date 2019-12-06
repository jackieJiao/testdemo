package com.example.testdemo.controller;

import com.netflix.discovery.DiscoveryClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerTest {
    @Value("${book.name}")
    private String bookname;
    @Value("${my.name}")
    private String myname;

    @Value("${my.random}")
    private String myRandom;


    /*注入discoveryclient对象*/



    @RequestMapping("/hello")
    public String hello(){

        System.out.println("helooontroller");
        System.out.println(bookname+"---"+myname);
        System.out.println(myRandom);

        System.out.println();
        return "hello";
    }
}

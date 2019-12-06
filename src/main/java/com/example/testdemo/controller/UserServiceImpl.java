package com.example.testdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl {


    @Autowired
    private UserDao dao;


    public void setUserDao(UserDao dao){
        this.dao=dao;
    }
    public User query( int id){
        return dao.getById(id);
    }
}

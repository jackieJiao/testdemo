package com.example.testdemo;


import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TestDemo extends ApplicationTest {

    /*@Autowired
    private AdminInterfaceServiceImpl adminInterfaceServiceImpl;*/

    @Test
    public void test(){
        System.out.println("测试逻辑");
        Assert.assertSame("测试未通过",1,1);
    }


}

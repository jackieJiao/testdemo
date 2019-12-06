package com.example.testdemo;

public class Initable3 {

    static final int staticFinal=333;//编译期常量，这个值不需要对Initable类进行初始化就能被读取。

    static{
        System.out.println("Initializing Initable3333!");
    }
}

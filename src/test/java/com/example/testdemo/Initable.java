package com.example.testdemo;

public class Initable {

    static final int staticFinal=47;//编译期常量，这个值不需要对Initable类进行初始化就能被读取。
    static final int staticFinal2=ReflectionApi.rand.nextInt(1000);
    static{
        System.out.println("Initializing Initable!");
    }
}

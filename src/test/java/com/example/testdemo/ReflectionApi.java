package com.example.testdemo;

import java.util.Random;

public class ReflectionApi {


    public static Random rand=new Random(47);
    public static void main(String[] args)throws Exception{
        Class initable=Initable.class;
        System.out.println("After creating Initable ref!");


        System.out.println(Initable.staticFinal);
        System.out.println(Initable.staticFinal2);
        System.out.println(Initable2.staticFinal);
        try{
            Class initable3=Class.forName("com.example.testdemo.Initable3");
        }catch(ClassNotFoundException e){
            System.out.println("类找不到！");
        }
        System.out.println("After creating Initable3 ref");
        System.out.println(Initable3.staticFinal);
    }

}

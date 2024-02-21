package com.example.demo;

/**
 * @author MikeWang
 * @date 2023/12/27 14:21
 */
public class MyClass implements MyInterface{
    @Override
    public void method1() {
        System.out.println("This is a method1 implement.");
    }


    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.method1();
        myClass.method2();
    }
}

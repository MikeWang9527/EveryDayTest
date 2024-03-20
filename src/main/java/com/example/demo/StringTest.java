package com.example.demo;

/**
 * @author MikeWang
 * @date 2024/2/22 17:46
 */
public class StringTest {

    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        swap(a, b);
        System.out.println(a + " " + b);
    }

    private static void swap(String a, String b) {
        String temp = a;
        a = b;
        b = temp;
        System.out.println("swap内:"+a + " " + b);
    }
}

package com.example.demo;

/**
 * @author MikeWang
 * @date 2023/12/29 11:35
 */
public class StaticTest {

    public static  short returnShort(short s){
        return s;
    }

    public static void main(String[] args) {
        short s1 =5;
        short s2 = 7;
        //short s3 = s1+s2; //编译报错 int转short
        returnShort((short) (s1+s2));
    }
}

package com.example.demo.controller;

import cn.hutool.http.HttpUtil;

/**
 * @author MikeWang
 * @date 2023/7/17 16:45
 */
public class MainTest {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int finalI = i;
            new Thread(() -> {
                try {
                    HttpUtil.get("127.0.0.1:8080/test?num=" + finalI);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }).start();
        }
        Thread.yield();
    }
}

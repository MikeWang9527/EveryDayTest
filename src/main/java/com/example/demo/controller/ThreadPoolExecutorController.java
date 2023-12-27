package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author MikeWang
 * @date 2023/7/17 16:32
 */
@Slf4j
@RestController
@RequestMapping("/threadPoolExecutor")
public class ThreadPoolExecutorController {
    @GetMapping("/test")
    public void getTest(int num) throws InterruptedException {
        log.info("{} 接收到请求:num={}",Thread.currentThread().getName(),num);
        TimeUnit.SECONDS.sleep(5);
    }
}

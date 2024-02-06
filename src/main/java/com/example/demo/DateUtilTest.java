package com.example.demo;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import org.joda.time.LocalDate;

import java.util.Date;

/**
 * @author MikeWang
 * @date 2024/2/1 14:05
 */
public class DateUtilTest {
    public static void main(String[] args) {
        Date startTime = LocalDate.now().plusDays(0).toDate();
        String format = DateUtil.format(startTime, "yyyy-MM-dd");
        System.out.println(LocalDate.now().plusDays(0));
        System.out.println(startTime);
        Date currentDate = DateUtil.offsetDay(startTime, 1);
        System.out.println(currentDate);
        Date beginOfDay = DateUtil.beginOfDay(startTime);
        DateTime endOfDay = DateUtil.endOfDay(startTime);
        System.out.println(beginOfDay);
        System.out.println(endOfDay);
    }
}

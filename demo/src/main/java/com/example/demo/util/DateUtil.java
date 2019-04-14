package com.example.demo.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;

/**
 * <p>create at 2019/4/14</p>
 *
 * @author guzhan
 * @since 1.0.0
 */
public class DateUtil {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);
        int year = today.getYear();
        System.out.println(year);
        int month = today.getMonthValue();
        System.out.println(month);
        int day = today.getDayOfMonth();
        System.out.println(day);
        LocalDateTime end = LocalDateTime.of(year, month, 1, 0, 0);
        System.out.println(end);
        LocalDateTime start = end.minus(1, ChronoUnit.MONTHS);
        System.out.println(start);

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        YearMonth currentYearMonth = YearMonth.now();
        System.out.println(currentYearMonth);
        LocalDateTime today_start = LocalDateTime.of(LocalDate.now(), LocalTime.MIN);
        System.out.println(today_start);
    }
}

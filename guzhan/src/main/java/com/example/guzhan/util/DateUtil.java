package com.example.guzhan.util;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * <p>create at 2019/4/23</p>
 *
 * @author guzhan
 * @since 1.0.0
 */
public final class DateUtil {
    private static final DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ISO_ZONED_DATE_TIME;


    public static void main(String[] args) {
        new Thread(
                () -> System.out.println(ZonedDateTime.now().format(TIME_FORMATTER))
        ).start();
    }
}

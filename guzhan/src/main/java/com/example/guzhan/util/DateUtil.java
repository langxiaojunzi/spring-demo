package com.example.guzhan.util;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * <p>create at 2019/4/23</p>
 *
 * @author guzhan
 * @since 1.0.0
 */
@Slf4j
public final class DateUtil {
    private static final DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ISO_ZONED_DATE_TIME;


//    public static void main(String[] args) {
//        new Thread(
//                () -> System.out.println(ZonedDateTime.now().format(TIME_FORMATTER))
//        ).start();
//    }

    public static void main(String[] args) {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime time = LocalDateTime.now();
        String localTime = df.format(time);
        log.info(localTime);
        LocalDateTime ldt = LocalDateTime.parse("2017-09-28 17:07:05",df);
        System.out.println("LocalDateTime转成String类型的时间："+localTime);
        System.out.println("String类型的时间转成LocalDateTime："+ldt);



//        LocalDateTime dateTime = LocalDateTime.now();
//
//        //使用预定义实例来转换
//        DateTimeFormatter fmt = DateTimeFormatter.ISO_LOCAL_DATE;
//        String dateStr = dateTime.format(fmt);
//        System.out.println("LocalDateTime转String[预定义]:"+dateStr);
//
//        //使用pattern来转换
//        //12小时制与24小时制输出由hh的大小写决定
//        DateTimeFormatter fmt12 = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss:SSS");
//        String dateStr12 = dateTime.format(fmt12);
//        System.out.println("LocalDateTime转String[pattern](12小时制):"+dateStr12);
//
//        DateTimeFormatter fmt24 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss:SSS");
//        String dateStr24 = dateTime.format(fmt24);
//        System.out.println("LocalDateTime转String[pattern](24小时制):"+dateStr24);
//
//        //如果想要给12小时制时间加上am/pm,这样子做：
//        fmt12 = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss:SSS a");
//        dateStr12 = dateTime.format(fmt12);
//        System.out.println("LocalDateTime转String[pattern](12小时制带am/pm):"+dateStr12);


    }
}

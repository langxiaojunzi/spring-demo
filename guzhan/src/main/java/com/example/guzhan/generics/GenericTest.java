package com.example.guzhan.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>create at 2019/5/28</p>
 *
 * @author guzhan
 * @since 1.0.0
 */
public class GenericTest {

    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        List<Integer> age = new ArrayList<>();
        List<Number> number = new ArrayList<>();

        name.add("icon");
        age.add(18);
        number.add(314);

//        getUperNumber(name);//1
        getUperNumber(age);//2
        getUperNumber(number);//3

    }

    public static void getUperNumber(List<? extends Number> data) {
        System.out.println("data :" + data.get(0));
    }
}

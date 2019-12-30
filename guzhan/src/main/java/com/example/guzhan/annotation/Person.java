package com.example.guzhan.annotation;

/**
 * <p>created at 2019/12/30</p>
 *
 * @author guzhan
 * @since 1.0.0
 */
public class Person {

    /**
     * empty()方法同时被 "@Deprecated" 和 "@MyAnnotation(value={"a","b"})"所标注
     * (01) @Deprecated，意味着empty()方法，不再被建议使用
     * (02) @MyAnnotation, 意味着empty() 方法对应的MyAnnotation的value值是默认值"unknown"
     */
    @MyAnnotation
    @Deprecated
    public void empty() {
        System.out.println("\nempty");
    }

    /**
     * sombody() 被 @MyAnnotation(value={"girl","boy"}) 所标注，
     * 意味着MyAnnotation的value值是{"girl","boy"}
     */
    @MyAnnotation(value = {"girl", "boy"})
    public void somebody(String name, int age) {
        System.out.println("\nsomebody: " + name + ", " + age);
    }

}

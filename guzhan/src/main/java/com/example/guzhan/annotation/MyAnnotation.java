package com.example.guzhan.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * <p>created at 2019/12/30</p>
 *
 * @author guzhan
 * @since 1.0.0
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String[] value() default "unknown";
}

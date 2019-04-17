package com.example.demo.aop;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * <p>create at 2019/4/17</p>
 *
 * @author guzhan
 * @since 1.0.0
 */
public class LogArgsAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("准备执行方法: " + method.getName() + ", 参数列表：" + Arrays.toString(args));
    }
}

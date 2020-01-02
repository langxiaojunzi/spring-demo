package com.example.guzhan.cglib;

import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.CallbackFilter;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.NoOp;

/**
 * <p>created at 2019/12/30</p>
 *
 * @author guzhan
 * @since 1.0.0
 */
public class TestCglib {

    /**
     * 这里Enhancer类是CGLib中的一个字节码增强器，它可以方便的对你想要处理的类进行扩展，以后会经常看到它。
     * <p>
     * 首先将被代理类TargetObject设置成父类，然后设置拦截器TargetInterceptor，
     * 最后执行enhancer.create()动态生成一个代理类，并从Object强制转型成父类型TargetObject。
     * <p>
     * 最后，在代理类上调用方法。
     *
     * @param args args
     */
    public static void main(String args[]) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(TargetObject.class);
//        enhancer.setCallback(new TargetInterceptor());

        CallbackFilter callbackFilter = new TargetMethodCallbackFilter();
        // (1)callback1：方法拦截器
        // (2)NoOp.INSTANCE：这个NoOp表示no operator，即什么操作也不做，代理类直接调用被代理的方法不进行拦截。
        // (3)FixedValue：表示锁定方法返回值，无论被代理类的方法返回什么值，回调方法都返回固定值。
        Callback noopCb = NoOp.INSTANCE;
        Callback callback1 = new TargetInterceptor();
        Callback fixedValue = new TargetResultFixed();
        Callback[] cbarray = new Callback[]{callback1, noopCb, fixedValue};
        enhancer.setCallbacks(cbarray);
        enhancer.setCallbackFilter(callbackFilter);

        TargetObject targetObject2 = (TargetObject) enhancer.create();
        System.out.println(targetObject2);
        System.out.println(targetObject2.method1("mmm1"));
        System.out.println(targetObject2.method2(100));
        System.out.println(targetObject2.method3(100));
        System.out.println(targetObject2.method3(200));
    }
}

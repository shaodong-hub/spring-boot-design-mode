package com.github.design.mode.template;

/**
 * @author 石少东
 * @date 2020-06-10 22:09
 */

public abstract class BaseTemplate {

    public void kickOff() {
        method1();
        method2();
        method3();
    }

    public void method1() {
        System.out.println("BaseTemplate - method1");
    }

    public abstract void method2();

    public abstract void method3();

}

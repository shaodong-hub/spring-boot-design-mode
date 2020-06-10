package com.github.design.mode;

import java.util.Date;

/**
 * @author 石少东
 * @date 2020-06-10 19:39
 */

public class PrototypeTest {

    private static Date date = new Date();

    public static void main(String[] args) {
        long num = 100000000;
        long newBefore = System.currentTimeMillis();
        newObject(num);
        System.out.println("直接生成耗时:" + (System.currentTimeMillis() - newBefore));


        long newAfter = System.currentTimeMillis();
        copyObject(num);
        System.out.println("原型模式耗时:" + (System.currentTimeMillis() - newAfter));


    }

    private static void newObject(long num) {
        for (long i = 0; i < num; i++) {
            new Date();
        }
    }

    private static void copyObject(long num) {
        for (long i = 0; i < num; i++) {
            date.clone();
        }
    }


}
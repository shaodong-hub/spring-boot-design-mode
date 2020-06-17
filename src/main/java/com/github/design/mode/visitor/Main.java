package com.github.design.mode.visitor;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author 石少东
 * @date 2020-06-17 19:46
 * @since 1.0
 */
public class Main {

    public static void main(String[] args) {
        List<Course> list = Lists.newLinkedList();

        CourseFree courseFree = new CourseFree();
        courseFree.setName("Java基础！");

        CourseCoding courseCoding = new CourseCoding();
        courseCoding.setName("SpringBoot实战！");
        courseCoding.setPrice(111);

        list.add(courseFree);
        list.add(courseCoding);

        list.forEach(one -> one.accept(new Visitor()));
    }

}

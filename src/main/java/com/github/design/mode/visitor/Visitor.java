package com.github.design.mode.visitor;

import org.jetbrains.annotations.NotNull;

/**
 * @author 石少东
 * @date 2020-06-17 19:50
 * @since 1.0
 */


public class Visitor implements IVisitor {

    @Override
    public void visitor(@NotNull CourseFree course) {
        System.out.println("免费课程：" + course.getName());
    }

    @Override
    public void visitor(@NotNull CourseCoding course) {
        System.out.println("实战课程：" + course.getName() + "  价格：" + course.getPrice());
    }
}

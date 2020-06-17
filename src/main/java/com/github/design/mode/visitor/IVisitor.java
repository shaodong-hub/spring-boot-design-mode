package com.github.design.mode.visitor;

/**
 * @author 石少东
 * @date 2020-06-17 19:47
 * @since
 */


public interface IVisitor {

    void visitor(CourseFree courseFree);

    void visitor(CourseCoding courseCoding);

}

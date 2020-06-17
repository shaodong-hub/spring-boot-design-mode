package com.github.design.mode.visitor;

import lombok.Getter;
import lombok.Setter;

/**
 * @author 石少东
 * @date 2020-06-17 19:46
 * @since 1.0
 */

@Getter
@Setter
public abstract class Course {

    private String name;

    public abstract void accept(IVisitor visitor);


}

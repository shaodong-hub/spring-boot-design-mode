package com.github.design.mode.visitor;

import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

/**
 * @author 石少东
 * @date 2020-06-17 19:48
 * @since 1.0
 */


@Getter
@Setter
public class CourseCoding extends Course {

    private String name;

    private Integer price;

    @Override
    public void accept(@NotNull IVisitor visitor) {
        visitor.visitor(this);
    }

}

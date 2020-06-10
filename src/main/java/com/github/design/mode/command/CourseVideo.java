package com.github.design.mode.command;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author 石少东
 * @date 2020-06-10 19:49
 */

@Getter
@Setter
@AllArgsConstructor
public class CourseVideo {

    private String name;

    public void open() {
        System.out.println(name + "open");
    }

    public void close() {
        System.out.println(name + "Close");
    }


}

package com.github.design.mode.command;

import lombok.AllArgsConstructor;

/**
 * @author 石少东
 * @date 2020-06-10 19:49
 */

@AllArgsConstructor
public class CommandClose implements Command {

    private final CourseVideo video;

    @Override
    public void execute() {
        video.close();
    }
}

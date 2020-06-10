package com.github.design.mode.command;

/**
 * @author 石少东
 * @date 2020-06-10 19:52
 */

public class Main {

    public static void main(String[] args) {
        CourseVideo courseVideo = new CourseVideo("Java");
        Staff staff = new Staff();
        staff.addCommand(new CommandOpen(courseVideo));
        staff.addCommand(new CommandClose(courseVideo));
        staff.execute();

    }
}

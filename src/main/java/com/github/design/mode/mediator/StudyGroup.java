package com.github.design.mode.mediator;

import org.jetbrains.annotations.NotNull;

import java.util.Date;

/**
 * @author 石少东
 * @date 2020-06-10 20:04
 */

public class StudyGroup {

    public static void showMessage(@NotNull User user, String message) {
        System.out.println(new Date().toString() + " [" + user.toString() + "] :  " + message);
    }

}

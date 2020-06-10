package com.github.design.mode.mediator;

import lombok.AllArgsConstructor;

/**
 * @author 石少东
 * @date 2020-06-10 20:03
 */

@AllArgsConstructor
public class User {

    private String name;

    public void sentMessage(String message) {
        StudyGroup.showMessage(this, message);
    }


}

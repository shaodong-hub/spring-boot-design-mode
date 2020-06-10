package com.github.design.mode.mediator;

/**
 * @author 石少东
 * @date 2020-06-10 20:05
 */

public class Main {

    public static void main(String[] args) {
        User user1 = new User("name1");
        User user2 = new User("name2");

        user1.sentMessage("123");
        user2.sentMessage("456");


    }

}

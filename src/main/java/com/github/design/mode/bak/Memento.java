package com.github.design.mode.bak;

/**
 * @author 石少东
 * @date 2020-07-21 19:21
 * @since 1.0
 */


public class Memento {

    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}

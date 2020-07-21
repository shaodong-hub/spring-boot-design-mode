package com.github.design.mode.bak;

/**
 * @author 石少东
 * @date 2020-07-21 19:21
 * @since 1.0
 */


public class Caretaker {

    private Memento mMemento;

    public Memento restoreMemento(){
        return mMemento;
    }

    public void storeMemengto(Memento memento){
        this.mMemento = memento;
    }

}

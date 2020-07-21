package com.github.design.mode.bak;

/**
 * @author 石少东
 * @date 2020-07-21 19:21
 * @since 1.0
 */


public class Originator {

    private String state;

    /** 创建一个新的备忘录对象 */
    public Memento createMemento(){
        return new Memento(state);
    }

    /** 将发起者的状态恢复到备忘录的状态 */
    public void restore(Memento memento){
        this.state = memento.getState();
    }

}

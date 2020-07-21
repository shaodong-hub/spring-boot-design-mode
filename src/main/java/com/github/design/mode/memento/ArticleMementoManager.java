package com.github.design.mode.memento;

import java.util.Stack;

/**
 * @author 石少东
 * @date 2020-07-21 19:35
 * @since 1.0
 */


public class ArticleMementoManager {

    private final Stack<ArticleMemento> articleMementoStack = new Stack<>();

    public ArticleMemento getMemento(){
        return articleMementoStack.pop();
    }

    public void addMemento(ArticleMemento memento){
        articleMementoStack.push(memento);
    }

}

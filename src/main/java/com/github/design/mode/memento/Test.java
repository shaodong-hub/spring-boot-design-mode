package com.github.design.mode.memento;

import org.checkerframework.checker.units.qual.A;

/**
 * @author 石少东
 * @date 2020-07-21 19:38
 * @since 1.0
 */


public class Test {

    public static void main(String[] args) {
        ArticleMementoManager manager = new ArticleMementoManager();
        Article article = new Article("123-1", "456-1", "789-1");
        ArticleMemento memento1 = article.saveToMemento();
        manager.addMemento(memento1);

        System.out.println(article);

        article.setTitle("123-2");
        article.setContent("456-2");
        article.setImgs("789-2");

        System.out.println(article);

        ArticleMemento memento2 = article.saveToMemento();
//        manager.addMemento(memento2);

        article.undoFromMemento(manager.getMemento());


        System.out.println(article);
    }

}

package com.github.design.mode.memento;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.jetbrains.annotations.NotNull;

/**
 * @author 石少东
 * @date 2020-07-21 19:29
 * @since 1.0
 */

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Article {

    private String title;

    private String content;

    private String imgs;

    public ArticleMemento saveToMemento() {
        return new ArticleMemento(title, content, imgs);
    }

    public void undoFromMemento(@NotNull ArticleMemento memento){
        this.title = memento.getTitle();
        this.content = memento.getContent();
        this.imgs = memento.getImgs();
    }

}

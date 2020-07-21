package com.github.design.mode.memento;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author 石少东
 * @date 2020-07-21 19:31
 * @since 1.0
 */

@Getter
@AllArgsConstructor
public class ArticleMemento {

    private final String title;

    private final String content;

    private final String imgs;

}

package com.github.design.mode.command;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedList;
import java.util.List;

/**
 * @author 石少东
 * @date 2020-06-10 19:51
 */

@Setter
@Getter
@AllArgsConstructor
public class Staff {

    private final List<Command> list = new LinkedList<>();

    public void execute() {
        list.forEach(Command::execute);
    }

    public void addCommand(Command command) {
        list.add(command);
    }

}

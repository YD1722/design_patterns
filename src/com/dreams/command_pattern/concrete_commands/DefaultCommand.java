package com.dreams.command_pattern.concrete_commands;

import com.dreams.command_pattern.Command;

public class DefaultCommand implements Command {
    @Override
    public void execute() {
        System.out.println("No command wis set here");
    }
}

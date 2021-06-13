package com.dreams.command_pattern;

import com.dreams.command_pattern.concrete_commands.DefaultCommand;

public class SimpleRemoteControl {
    Command[] commands;

    public SimpleRemoteControl() {
        Command defaultCommand = new DefaultCommand();
        commands = new Command[4];

        for (int i = 0; i < 4; i++) {
            commands[i] = defaultCommand;
        }
    }

    public void setCommand(int slot, Command command) {
        this.commands[slot] = command;
    }

    public void onBtnPress(int slot) {
        commands[slot].execute();
    }
}

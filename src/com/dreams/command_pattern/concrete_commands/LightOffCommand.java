package com.dreams.command_pattern.concrete_commands;

import com.dreams.command_pattern.Command;
import com.dreams.command_pattern.beans.Light;

public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.off();
    }
}

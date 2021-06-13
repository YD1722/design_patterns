package com.dreams.command_pattern.concrete_commands;

import com.dreams.command_pattern.Command;
import com.dreams.command_pattern.beans.TV;

public class TvVolumeDownCommand implements Command {
    TV tv;

    public TvVolumeDownCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.volumeDOwn();
    }
}

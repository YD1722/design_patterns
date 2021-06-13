package com.dreams.command_pattern.beans;

public class TV {
    int volume = 10;

    public void on() {
        System.out.println("TV is on");
    }

    public void off() {
        System.out.println("TV is off");
    }

    public void volumeUp() {
        volume++;
        System.out.println("TV volume :" + volume);
    }

    public void volumeDOwn() {
        volume--;
        System.out.println("TV volume :" + volume);
    }
}

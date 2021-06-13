package com.dreams;

import com.dreams.factory.simpleFactory.BappaKottuStore;
import com.dreams.factory.simpleFactory.SimpleKottuFactory;

public class Main {

    public static void main(String[] args) {
//        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
//        Light light = new Light();
//        LightOnCommand lightOnCommand = new LightOnCommand(light);
//
//        simpleRemoteControl.setCommand(lightOnCommand);
//        simpleRemoteControl.onBtnPress();

        SimpleKottuFactory simpleKottuFactory = new SimpleKottuFactory();
        BappaKottuStore kottuStore = new BappaKottuStore(simpleKottuFactory);

        kottuStore.orderKottu("cheese");
        kottuStore.orderKottu("chicken");
    }
}

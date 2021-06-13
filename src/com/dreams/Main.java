package com.dreams;

import com.dreams.decorator.*;
import com.dreams.factory.simpleFactory.BappaKottuStore;
import com.dreams.factory.simpleFactory.SimpleKottuFactory;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
//        Light light = new Light();
//        LightOnCommand lightOnCommand = new LightOnCommand(light);
//
//        simpleRemoteControl.setCommand(lightOnCommand);
//        simpleRemoteControl.onBtnPress();

//        SimpleKottuFactory simpleKottuFactory = new SimpleKottuFactory();
//        BappaKottuStore kottuStore = new BappaKottuStore(simpleKottuFactory);
//
//        kottuStore.orderKottu("cheese");
//        kottuStore.orderKottu("chicken");

        List<Extra> extraList = new ArrayList<>();
        extraList.add(new Cheese());
        Pizza sausageDelight = new SausageDelight(extraList);
        Pizza sausageDelight1 = new SausageDelight();
        Pizza tandooriChicken = new ThandooriChicken();
        extraList.add(new ChickenHam());
        Pizza tandooriChicken1 = new ThandooriChicken(extraList);

        System.out.println(sausageDelight.description + " : " + sausageDelight.cost());
        System.out.println(sausageDelight1.description + " : " + sausageDelight1.cost());
        System.out.println(tandooriChicken.description + " : " + tandooriChicken.cost());
        System.out.println(tandooriChicken1.description + " : " + tandooriChicken1.cost());
    }
}

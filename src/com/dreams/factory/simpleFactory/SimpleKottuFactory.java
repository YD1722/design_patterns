package com.dreams.factory.simpleFactory;

import com.dreams.factory.simpleFactory.beans.CheeseKottu;
import com.dreams.factory.simpleFactory.beans.ChickenKottu;
import com.dreams.factory.simpleFactory.beans.Kottu;

public class SimpleKottuFactory {
    Kottu kottu;

    public Kottu createKottu(String type) {
        if (type == "chicken") {
            kottu = new ChickenKottu();
        } else if (type == "cheese") {
            kottu = new CheeseKottu();
        }

        return kottu;
    }
}

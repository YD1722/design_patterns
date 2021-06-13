package com.dreams.factory.realFactory;

import com.dreams.factory.realFactory.beans.CheeseKottu;
import com.dreams.factory.realFactory.beans.ChickenKottu;
import com.dreams.factory.realFactory.beans.Kottu;

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

package com.dreams.factory.realFactory;

import com.dreams.factory.realFactory.beans.Kottu;

public class BappaKottuStore {
    SimpleKottuFactory kottuFactory;

    public BappaKottuStore(SimpleKottuFactory kottuFactory) {
        this.kottuFactory = kottuFactory;
    }

    public void orderKottu(String type) {
        Kottu kottu = this.kottuFactory.createKottu(type);

        kottu.addIngredients();
        kottu.cut();
        kottu.box();
    }
}

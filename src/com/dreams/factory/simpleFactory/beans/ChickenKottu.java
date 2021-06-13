package com.dreams.factory.simpleFactory.beans;

public class ChickenKottu extends Kottu {

    public void addIngredients() {
        super.addIngredients();
        System.out.println("adding Chicken");
    }
}

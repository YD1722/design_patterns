package com.dreams.factory.simpleFactory.beans;

public class CheeseKottu extends Kottu {
    public void addIngredients() {
        super.addIngredients();
        System.out.println("adding Chicken");
        System.out.println("adding Cheese");
    }
}

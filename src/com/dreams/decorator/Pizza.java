package com.dreams.decorator;

import java.util.List;

public abstract class Pizza {
    public String description;
    public List<Extra> extraItems;

    public String getDescription() {
        return this.description;
    }

    public abstract int cost();

    public int getExtraCost() {
        int cost = 0;

        if (this.extraItems != null) {
            for (Extra item : this.extraItems) {
                cost += item.cost();
            }
        }
        
        return cost;
    }
}

package com.dreams.decorator;

import java.util.List;

public class ThandooriChicken extends Pizza {
    public ThandooriChicken(List<Extra> extraList) {
        this.description = "ThandooriChicken";
        this.extraItems = extraList;
    }

    public ThandooriChicken() {
        this.description = "ThandooriChicken";
    }


    @Override
    public int cost() {
        return 510 + this.getExtraCost();
    }
}

// BBQChicken - 310, cheese -140 . chickenHam-300, MushRoom-120

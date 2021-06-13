package com.dreams.decorator;

import java.util.List;

public class SausageDelight extends Pizza {

    public SausageDelight(List<Extra> extraList) {
        this.description = "SausageDelight";
        this.extraItems = extraList;
    }

    public SausageDelight() {
        this.description = "SausageDelight";
    }


    @Override
    public int cost() {
        return 410 + this.getExtraCost();
    }
}

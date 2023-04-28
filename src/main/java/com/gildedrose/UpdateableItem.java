package com.gildedrose;

public class UpdateableItem extends Item implements Updateable {

    public UpdateableItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void update() {

    }
}

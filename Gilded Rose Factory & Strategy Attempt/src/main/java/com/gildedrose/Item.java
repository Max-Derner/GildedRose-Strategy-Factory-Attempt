package com.gildedrose;

public class Item /*implements IStrategy*/ {

    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    /*public void update() {
        //TODO figure out why this gets called instead of the strategy implementation of update
    }*/
}

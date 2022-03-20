package com.gildedrose;

public class LegendaryStrategy extends Item implements IStrategy {
    public LegendaryStrategy(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }
    public LegendaryStrategy(Item item){
        super(item.name, item.sellIn, item.quality);
    }

    public void update(){
        quality=80;
    }
    @Override
    public String toString(){
        return ", is legendary";
    }
}

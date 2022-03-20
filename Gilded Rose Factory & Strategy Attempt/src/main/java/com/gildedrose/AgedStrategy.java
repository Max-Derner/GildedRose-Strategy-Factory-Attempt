package com.gildedrose;

public class AgedStrategy extends Item implements IStrategy {
    public AgedStrategy(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }
    public AgedStrategy(Item item){
        super(item.name, item.sellIn, item.quality);
    }

    public void update(){
        quality++;
        if(sellIn<=0){
            quality++;
        }
        if(quality>50){
            quality=50;
        }
        sellIn--;
    }
    @Override
    public String toString(){
        return ", is aged";
    }
}

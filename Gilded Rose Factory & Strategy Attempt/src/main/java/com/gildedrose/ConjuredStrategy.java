package com.gildedrose;

public class ConjuredStrategy extends Item implements IStrategy {
    public ConjuredStrategy(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }
    public ConjuredStrategy(Item item){
        super(item.name, item.sellIn, item.quality);
    }

    public void update(){
        quality-=2;
        if(sellIn<=0){
            quality-=2;
        }
        if(quality<0){
            quality=0;
        }
        sellIn--;
    }
    @Override
    public String toString(){
        return ", is conjured";
    }
}

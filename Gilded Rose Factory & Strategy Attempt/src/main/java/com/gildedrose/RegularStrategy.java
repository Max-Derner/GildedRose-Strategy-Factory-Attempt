package com.gildedrose;

public class RegularStrategy extends Item implements IStrategy {
    public RegularStrategy(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }
    public RegularStrategy(Item item){
        super(item.name, item.sellIn, item.quality);
    }

    public void update(){
        quality--;
        if(sellIn<=0){
            quality--;
        }
        if(quality<0){
            quality=0;
        }
        sellIn--;
    }
    @Override
    public String toString(){
        return ", is regular";
    }
}

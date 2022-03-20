package com.gildedrose;

public class TicketStrategy extends Item implements IStrategy {

    public TicketStrategy(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }
    public TicketStrategy(Item item){
        super(item.name, item.sellIn, item.quality);
    }

    public void update(){
        if(sellIn<=0){
            quality=0;
        }else{
            quality++;
            if(sellIn<=10){
                quality++;
            }
            if(sellIn<=5){
                quality++;
            }
        }
        if(quality>50){
            quality=50;
        }
        sellIn--;
    }
    @Override
    public String toString(){
        return ", is ticket";
    }
}

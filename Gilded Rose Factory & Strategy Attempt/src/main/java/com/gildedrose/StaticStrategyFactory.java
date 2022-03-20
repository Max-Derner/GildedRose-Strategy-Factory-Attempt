package com.gildedrose;

public class StaticStrategyFactory {
    public static IStrategy create(Item item){
        switch(item.name){
            case "Backstage passes to a TAFKAL80ETC concert":
                return new TicketStrategy(item);
            case "Sulfuras, Hand of Ragnaros":
                return new LegendaryStrategy(item);
            case "Aged Brie":
                return new AgedStrategy(item);
            case "Conjured Mana Cake":
                return new ConjuredStrategy(item);
            default:
                return new RegularStrategy(item);

        }
    }
}

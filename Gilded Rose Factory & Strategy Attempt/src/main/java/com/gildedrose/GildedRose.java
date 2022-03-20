package com.gildedrose;

class GildedRose {
    Item[] items;
    IStrategy[] strategies;
    //StaticStrategyFactory factory = new StaticStrategyFactory();//TODO remove this given it's a static class

    public GildedRose(Item[] items) {
        this.items = items;
        strategies = new IStrategy[items.length];
        for(int i=0; i<items.length;i++){
            strategies[i]= StaticStrategyFactory.create(items[i]);//This feels very wrong, is it?
        }
    }


    public void updateQuality() {
        for(IStrategy item: strategies){
            IStrategy.update();//ERROR:  Non-static method 'update()' cannot be referenced from a static context
        }

                /*for (int i = 0; i < items.length; i++) {
                    if (!items[i].name.equals("Aged Brie")
                        && !items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (items[i].quality > 0) {
                            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                                items[i].quality = items[i].quality - 1;
                            }
                        }
                    } else {
                        if (items[i].quality < 50) {
                            items[i].quality = items[i].quality + 1;

                            if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                                if (items[i].sellIn < 11) {
                                    if (items[i].quality < 50) {
                                        items[i].quality = items[i].quality + 1;
                                    }
                                }

                                if (items[i].sellIn < 6) {
                                    if (items[i].quality < 50) {
                                        items[i].quality = items[i].quality + 1;
                                    }
                                }
                            }
                        }
                    }

                    if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                        items[i].sellIn = items[i].sellIn - 1;
                    }

                    if (items[i].sellIn < 0) {
                        if (!items[i].name.equals("Aged Brie")) {
                            if (!items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                                if (items[i].quality > 0) {
                                    if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                                        items[i].quality = items[i].quality - 1;
                                    }
                                }
                            } else {
                                items[i].quality = items[i].quality - items[i].quality;
                            }
                        } else {
                            if (items[i].quality < 50) {
                                items[i].quality = items[i].quality + 1;
                            }
                        }
                    }
                }*/
    }
}

package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
    }

  /*  @Test
    void AgedBrieReducesQualityCorrectlyWithoutGoingThroughGildedRose() {
        Item item =  new Item("Aged Brie", 2, 0);
        IStrategy strategy=StaticStrategyFactory.create(item);
        item.update();
        assertEquals(1, item.quality);
    }*/

}

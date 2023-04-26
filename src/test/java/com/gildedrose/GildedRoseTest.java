package com.gildedrose;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

public class GildedRoseTest {

    @Test
    public void agedBrieUpdateOnceTest() {
        Item[] items = new Item[] {new Item("Aged Brie", 2, 0)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(1, items[0].sellIn);
        assertEquals(1, items[0].quality);
        app.updateQuality();
        assertEquals(0, items[0].sellIn);
        assertEquals(2, items[0].quality);
    }
    @Test
    public void elixirUpdateOnceTest() {
        Item[] items = new Item[] {new Item("Elixir of the Mongoose", 5, 7)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(4, items[0].sellIn);
        assertEquals(6, items[0].quality);
        app.updateQuality();
        assertEquals(3, items[0].sellIn);
        assertEquals(5, items[0].quality);
    }
    @Test
    public void sulfurusUpdateOnceTest() {
        Item[] items = new Item[] {new Item("Sulfuras, Hand of Ragnaros", 0, 80)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(0, items[0].sellIn);
        assertEquals(80, items[0].quality);
        app.updateQuality();
        assertEquals(0, items[0].sellIn);
        assertEquals(80, items[0].quality);
    }
    @Test
    public void backstagePassesUpdateOnceTest() {
        Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(4, items[0].sellIn);
        assertEquals(50, items[0].quality);
        app.updateQuality();
        assertEquals(3, items[0].sellIn);
        assertEquals(50, items[0].quality);
    }
}

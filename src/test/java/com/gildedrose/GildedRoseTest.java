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
    public void staleBrieUpdateOnceTest() {
        Item[] items = new Item[] {new Item("Aged Brie", -1, 0)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(-2, items[0].sellIn);
        assertEquals(2, items[0].quality);
        app.updateQuality();
        assertEquals(-3, items[0].sellIn);
        assertEquals(4, items[0].quality);
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
    public void elixirUpdateOnceTes2() {
        Item[] items = new Item[] {new Item("Elixir of the Mongoose", 15, -7)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(14, items[0].sellIn);
        assertEquals(-7, items[0].quality);
        app.updateQuality();
        assertEquals(13, items[0].sellIn);
        assertEquals(-7, items[0].quality);
    }

    @Test
    public void elixirUpdateOnceTest2() {
        Item[] items = new Item[] {new Item("Elixir of the Mongoose", -1, 7)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(-2, items[0].sellIn);
        assertEquals(5, items[0].quality);
        app.updateQuality();
        assertEquals(-3, items[0].sellIn);
        assertEquals(3, items[0].quality);
    }

    @Test
    public void elixirUpdateOnceTest3() {
        Item[] items = new Item[] {new Item("Elixir of the Mongoose", -1, -7)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(-2, items[0].sellIn);
        assertEquals(-7, items[0].quality);
        app.updateQuality();
        assertEquals(-3, items[0].sellIn);
        assertEquals(-7, items[0].quality);
    }

    @Test
    public void elixirUpdateOnceTest4() {
        Item[] items = new Item[] {new Item("Elixir of the Mongoose", 5, 1)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(4, items[0].sellIn);
        assertEquals(0, items[0].quality);
        app.updateQuality();
        assertEquals(3, items[0].sellIn);
        assertEquals(0, items[0].quality);
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
    public void elixirUpdateOnceTest5() {
        Item[] items = new Item[] {new Item("Elixir of the Mongoose", -1, 2)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(-2, items[0].sellIn);
        assertEquals(0, items[0].quality);
    }
    @Test
    public void elixirUpdateOnceTest6() {
        Item[] items = new Item[] {new Item("Elixir of the Mongoose", -1, 1)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(-2, items[0].sellIn);
        assertEquals(0, items[0].quality);
    }

    @Test
    public void agedBrieUpdateOnceTest7() {
        Item[] items = new Item[] {new Item("Aged Brie", -1, 50)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(-2, items[0].sellIn);
        assertEquals(50, items[0].quality);
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

    @Test
    public void backstagePassesUpdateOnceTest2() {
        Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert", 5, 40)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(4, items[0].sellIn);
        assertEquals(43, items[0].quality);
        app.updateQuality();
        assertEquals(3, items[0].sellIn);
        assertEquals(46, items[0].quality);
    }

    @Test
    public void backstagePassesUpdateOnceTest3() {
        Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert", -1, 40)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(-2, items[0].sellIn);
        assertEquals(0, items[0].quality);
        app.updateQuality();
        assertEquals(-3, items[0].sellIn);
        assertEquals(0, items[0].quality);
    }

    @Test
    public void backstagePassesUpdateOnceTest4() {
        Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert", 12, -40)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(11, items[0].sellIn);
        assertEquals(-39, items[0].quality);
        app.updateQuality();
        assertEquals(10, items[0].sellIn);
        assertEquals(-38, items[0].quality);
    }
    @Test
    public void backstagePassesUpdateOnceTest5() {
        Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert", 6, -40)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(5, items[0].sellIn);
        assertEquals(-38, items[0].quality);
    }
}

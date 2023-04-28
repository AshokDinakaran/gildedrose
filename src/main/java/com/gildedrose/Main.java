package com.gildedrose;

public class Main {
    public static void main(String[] args) {
        System.out.println("Example of running Gilded Rose");

        Item[] items = new Item[] {
                new AgedBrie(2, 0),
                new Elixir(5, 7),
                new Sulfuras( 0, 80),
                new Backstage(5, 49) };

        GildedRose app = new GildedRose(items);

        System.out.println("Day 1 ======================");
        for (Item item : items) {
            System.out.println("item = " + item);
        }

        System.out.println("Day 2 ======================");
        app.updateQuality();
        for (Item item : items) {
            System.out.println("item = " + item);
        }

        System.out.println("Day 3 ======================");
        app.updateQuality();
        for (Item item : items) {
            System.out.println("item = " + item);
        }
    }
}

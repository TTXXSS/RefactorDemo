package gildedRose;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GildedRoseTest {
    @Test
    public void should_return_quality_0_and_sellIn_9_when_given_item_with_quality_1_and_name_Aged_and_sellIn_10(){
        Item[] item = new Item[1];
        item[0]= new Item("Aged",10,1);
        GildedRose gildedRose = new GildedRose(item);
        gildedRose.updateQuality();
        assertEquals(gildedRose.items[0].quality,0);
        assertEquals(gildedRose.items[0].sellIn,9);
    }
    @Test
    public void should_return_quality_1_and_sellIn_10_when_given_item_with_quality_1_and_name_Sulfuras_Hand_of_Ragnaros_and_sellIn_10(){
        Item[] item = new Item[1];
        item[0]= new Item("Sulfuras, Hand of Ragnaros",10,1);
        GildedRose gildedRose = new GildedRose(item);
        gildedRose.updateQuality();
        assertEquals(gildedRose.items[0].quality,1);
        assertEquals(gildedRose.items[0].sellIn,10);
    }

}

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
    @Test
    public void should_return_quality_2_and_sellIn_9_when_given_item_with_quality_1_and_name_Aged_Brie_of_Ragnaros_and_sellIn_10(){
        Item[] item = new Item[1];
        item[0]= new Item("Aged Brie",10,1);
        GildedRose gildedRose = new GildedRose(item);
        gildedRose.updateQuality();
        assertEquals(gildedRose.items[0].quality,2);
        assertEquals(gildedRose.items[0].sellIn,9);
    }

    @Test
    public void should_return_quality_50_and_sellIn_9_when_given_item_with_quality_49_and_name_Backstage_passes_to_a_TAFKAL80ETC_concert_and_sellIn_10(){
        Item[] item = new Item[1];
        item[0]= new Item("Backstage passes to a TAFKAL80ETC concert",10,49);
        GildedRose gildedRose = new GildedRose(item);
        gildedRose.updateQuality();
        assertEquals(gildedRose.items[0].quality,50);
        assertEquals(gildedRose.items[0].sellIn,9);

    }

    @Test
    public void should_return_quality_50_and_sellIn_9_when_given_item_with_quality_48_and_name_Backstage_passes_to_a_TAFKAL80ETC_concert_and_sellIn_10(){
        Item[] item = new Item[1];
        item[0]= new Item("Backstage passes to a TAFKAL80ETC concert",10,48);
        GildedRose gildedRose = new GildedRose(item);
        gildedRose.updateQuality();
        assertEquals(gildedRose.items[0].quality,50);
        assertEquals(gildedRose.items[0].sellIn,9);

    }
    @Test
    public void should_return_quality_50_and_sellIn_4_when_given_item_with_quality_47_and_name_Backstage_passes_to_a_TAFKAL80ETC_concert_and_sellIn_5(){
        Item[] item = new Item[1];
        item[0]= new Item("Backstage passes to a TAFKAL80ETC concert",5,47);
        GildedRose gildedRose = new GildedRose(item);
        gildedRose.updateQuality();
        assertEquals(gildedRose.items[0].quality,50);
        assertEquals(gildedRose.items[0].sellIn,4);
    }
    @Test
    public void should_return_quality_50_and_sellIn_4_when_given_item_with_quality_50_and_name_Backstage_passes_to_a_TAFKAL80ETC_concert_and_sellIn_5(){
        Item[] item = new Item[1];
        item[0]= new Item("Backstage passes to a TAFKAL80ETC concert",5,50);
        GildedRose gildedRose = new GildedRose(item);
        gildedRose.updateQuality();
        assertEquals(gildedRose.items[0].quality,50);
        assertEquals(gildedRose.items[0].sellIn,4);
    }
    @Test
    public void should_return_quality_50_and_sellIn_9_when_given_item_with_quality_50_and_name_Backstage_passes_to_a_TAFKAL80ETC_concert_and_sellIn_10(){
        Item[] item = new Item[1];
        item[0]= new Item("Backstage passes to a TAFKAL80ETC concert",10,50);
        GildedRose gildedRose = new GildedRose(item);
        gildedRose.updateQuality();
        assertEquals(gildedRose.items[0].quality,50);
        assertEquals(gildedRose.items[0].sellIn,9);
    }

    @Test
    public void should_return_quality_49_and_sellIn_11_when_given_item_with_quality_48_and_name_Backstage_passes_to_a_TAFKAL80ETC_concert_and_sellIn_12(){
        Item[] item = new Item[1];
        item[0]= new Item("Backstage passes to a TAFKAL80ETC concert",12,48);
        GildedRose gildedRose = new GildedRose(item);
        gildedRose.updateQuality();
        assertEquals(gildedRose.items[0].quality,49);
        assertEquals(gildedRose.items[0].sellIn,11);

    }

    @Test
    public void should_return_quality_0_and_sellIn_negtive_1_when_given_item_with_quality_50_and_name_Backstage_passes_to_a_TAFKAL80ETC_concert_and_sellIn_0(){
        Item[] item = new Item[1];
        item[0]= new Item("Backstage passes to a TAFKAL80ETC concert",0,50);
        GildedRose gildedRose = new GildedRose(item);
        gildedRose.updateQuality();
        assertEquals(gildedRose.items[0].quality,0);
        assertEquals(gildedRose.items[0].sellIn,-1);

    }
    @Test
    public void should_return_quality_48_and_sellIn_negtive_1_when_given_item_with_quality_50_and_name_Backstage_and_sellIn_0(){
        Item[] item = new Item[1];
        item[0]= new Item("Backstage",0,50);
        GildedRose gildedRose = new GildedRose(item);
        gildedRose.updateQuality();
        assertEquals(gildedRose.items[0].quality,48);
        assertEquals(gildedRose.items[0].sellIn,-1);

    }

}

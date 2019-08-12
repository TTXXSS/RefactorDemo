package gildedRose;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GildedRoseTest {
    @Test
    public void should_return_0_when_given_item_with_quality_1_and_name_Aged_and_sellIn_10(){
        Item[] item = new Item[1];
        item[0]= new Item("Aged",10,1);
        GildedRose gildedRose = new GildedRose(item);
        gildedRose.updateQuality();
        assertEquals(gildedRose.items[0].quality,0);
    }

}

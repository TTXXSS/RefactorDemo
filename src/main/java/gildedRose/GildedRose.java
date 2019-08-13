package gildedRose;
public class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
           switch (items[i].name) {
               case "Aged Brie":
               {
                   new AgedItem().updateQuality(items[i]);

               }
               break;

               case "Backstage passes to a TAFKAL80ETC concert":
                {

                  new BackstageItem().updateQuality(items[i]);
               }
               break;

               case "Sulfuras, Hand of Ragnaros":
               {

               }
               break;
               default:
               {
                   new OtherItem().updateQuality(items[i]);

               }
               break;

           }


        }
    }
}
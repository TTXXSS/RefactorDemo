package gildedRose;

import java.util.ArrayList;
import java.util.List;

public class GildedRose {
    Item[] items;
    List<Stratege> strateges = new ArrayList<>();
    public GildedRose(Item[] items) {
        this.items = items;
    }
    public void initStratege(){
        strateges.add(new AgedItem("Aged Brie",0,0));
        strateges.add(new BackstageItem("Backstage passes to a TAFKAL80ETC concert",0,0));
        strateges.add(new SulfurasItem("Sulfuras, Hand of Ragnaros",0,0));
        strateges.add(new OtherItem("Other Item",0,0));
    }
    public List<Stratege> getStrateges(){
        return strateges;
    }
    public void updateQuality() {
        initStratege();
        List<Stratege> strateges = getStrateges();
        for (Item item :items) {
            strateges.stream().filter(stratege -> stratege.isEqualsName(item))
                    .forEach(stratege -> stratege.updateQuality(item));
        }
    }
}
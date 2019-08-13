package gildedRose;

public class AgedItem implements Stratege {
    @Override
    public void updateQuality(Item item) {
        if (isQualityLessThan50(item)) {
            item.quality = item.quality + 1;
        }

        if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
            item.sellIn = item.sellIn - 1;
        }

        if (item.sellIn < 0) {
            if (isQualityLessThan50(item)) {
                item.quality = item.quality + 1;
            }
        }
    }

    @Override
    public boolean isQualityLessThan50(Item item) {
        return item.quality<50;
    }
}

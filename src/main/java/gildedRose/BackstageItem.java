package gildedRose;

public class BackstageItem implements Stratege{
    @Override
    public void updateQuality(Item item) {
        if (isQualityLessThan50(item)) {
            updateQualityAdd1(item);

            if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (item.sellIn < 11) {
                    if (isQualityLessThan50(item)) {
                        updateQualityAdd1(item);
                    }
                }

                if (item.sellIn < 6) {
                    if (isQualityLessThan50(item)) {
                        updateQualityAdd1(item);
                    }
                }
            }
        }

        if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
            item.sellIn = item.sellIn - 1;
        }
        if (item.sellIn < 0) {
            item.quality = item.quality - item.quality;
        }
    }

    @Override
    public boolean isQualityLessThan50(Item item) {
        return item.quality<50;
    }

    @Override
    public void updateQualityDecrease1(Item item) {

    }

    @Override
    public void updateQualityAdd1(Item item) {
        item.quality+=1;
    }
}

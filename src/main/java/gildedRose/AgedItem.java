package gildedRose;

public class AgedItem implements Stratege {
    @Override
    public void updateQuality(Item item) {
        if (isQualityLessThan50(item)) {
            updateQualityAdd1(item);
        }

        if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
            item.sellIn = item.sellIn - 1;
        }

        if (item.sellIn < 0) {
            if (isQualityLessThan50(item)) {
                updateQualityAdd1(item);
            }
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

package gildedRose;

public class OtherItem implements Stratege {
    @Override
    public void updateQuality(Item item) {
        {
            item.quality = item.quality - 1;
        }

        item.sellIn = item.sellIn - 1;

        if (item.sellIn < 0) {
            if (item.quality > 0) {
                item.quality = item.quality - 1;

            }
        }
    }

    @Override
    public boolean isQualityLessThan50(Item item) {
        return false;
    }
}

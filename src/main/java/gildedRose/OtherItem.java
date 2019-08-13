package gildedRose;

public class OtherItem implements Stratege {
    @Override
    public void updateQuality(Item item) {
        {
            updateQualityDecrease1(item);
        }

        item.sellIn = item.sellIn - 1;

        if (item.sellIn < 0) {
            if (item.quality > 0) {
                updateQualityDecrease1(item);

            }
        }
    }

    @Override
    public boolean isQualityLessThan50(Item item) {
        return false;
    }

    @Override
    public void updateQualityDecrease1(Item item) {
        item.quality-=1;
    }

    @Override
    public void updateQualityAdd1(Item item) {
        item.quality+=1;
    }
}

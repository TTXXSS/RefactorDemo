package gildedRose;

public class OtherItem implements Stratege {
    private String name;
    private int sellIn;
    private int quality;

    public OtherItem() {
    }

    public OtherItem(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public String getName() {
        return name;
    }

    public int getSellIn() {
        return sellIn;
    }

    public int getQuality() {
        return quality;
    }

    @Override
    public void updateQuality(Item item) {

        updateQualityDecrease1(item);

        item.sellIn = item.sellIn - 1;

        updateQualityBySellInLess0QualityGreater0(item);
    }

    private void updateQualityBySellInLess0QualityGreater0(Item item) {
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

    @Override
    public boolean isEqualsName(Item item) {
        return item.name.equals(getName());
    }
}

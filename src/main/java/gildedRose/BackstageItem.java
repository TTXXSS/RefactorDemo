package gildedRose;

public class BackstageItem implements Stratege{
    private String name;
    private int sellIn;
    private int quality;

    public BackstageItem() {
    }

    public BackstageItem(String name, int sellIn, int quality) {
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
        updateQualityByQualityLess50(item);

        decreaseSellIn1ByEquaelsSulfuras(item);
        if (item.sellIn < 0) {
            item.quality = item.quality - item.quality;
        }
    }

    private void decreaseSellIn1ByEquaelsSulfuras(Item item) {
        if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
            item.sellIn = item.sellIn - 1;
        }
    }

    private void updateQualityByQualityLess50(Item item) {
        if (isQualityLessThan50(item)) {
            updateQualityAdd1(item);

            if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                addQuality1BySellInLess11QualityLess50(item, 11);

                addQuality1BySellInLess6QualityLess50(item, 6);
            }
        }
    }

    private void addQuality1BySellInLess6QualityLess50(Item item, int i) {
        if (item.sellIn < i) {
            if (isQualityLessThan50(item)) {
                updateQualityAdd1(item);
            }
        }
    }

    private void addQuality1BySellInLess11QualityLess50(Item item, int i) {
        if (item.sellIn < i) {
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

    @Override
    public boolean isEqualsName(Item item) {
        return item.name.equals(getName());
    }
}

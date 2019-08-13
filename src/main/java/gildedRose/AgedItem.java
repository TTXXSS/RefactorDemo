package gildedRose;

public class AgedItem implements Stratege {
    private String name;
    private int sellIn;
    private int quality;

    public AgedItem() {
    }

    public AgedItem(String name, int sellIn, int quality) {
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

        decreaseSellIn1ByNotEqualsSulfuras(item);

        if (item.sellIn < 0) {
            updateQualityByQualityLess50(item);
        }
    }

    private void decreaseSellIn1ByNotEqualsSulfuras(Item item) {
        if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
            item.sellIn = item.sellIn - 1;
        }
    }

    private void updateQualityByQualityLess50(Item item) {
        if (isQualityLessThan50(item)) {
            updateQualityAdd1(item);
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

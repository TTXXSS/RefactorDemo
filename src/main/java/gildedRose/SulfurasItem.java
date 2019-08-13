package gildedRose;

public class SulfurasItem implements Stratege {
    private String name;
    private int sellIn;
    private int quality;

    public SulfurasItem() {
    }

    public SulfurasItem(String name, int sellIn, int quality) {
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

    }

    @Override
    public boolean isQualityLessThan50(Item item) {
        return false;
    }

    @Override
    public void updateQualityDecrease1(Item item) {

    }

    @Override
    public void updateQualityAdd1(Item item) {

    }

    @Override
    public boolean isEqualsName(Item item) {
        return item.name.equals(getName());
    }
}

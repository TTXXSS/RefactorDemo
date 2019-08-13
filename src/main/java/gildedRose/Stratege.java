package gildedRose;

public interface Stratege {
    public void updateQuality(Item item);
    public boolean isQualityLessThan50(Item item);
    public void updateQualityDecrease1(Item item);
}

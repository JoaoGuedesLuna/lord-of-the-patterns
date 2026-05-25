package dev.guedes.lordofthepatterns.common.item;

import dev.guedes.lordofthepatterns.common.item.enums.ItemRarity;
import dev.guedes.lordofthepatterns.common.item.enums.ItemType;
import dev.guedes.lordofthepatterns.common.stats.Stats;

/**
 * @author João Guedes
 */
public class Item {
    private String name;
    private ItemType itemType;
    private ItemRarity rarity;
    private Stats statsBonus;

    public Item(String name, ItemType itemType, ItemRarity rarity, Stats statsBonus) {
        this.name = name;
        this.itemType = itemType;
        this.rarity = rarity;
        this.statsBonus = statsBonus;
    }

    public Item() {
        this.statsBonus = new Stats();
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public ItemType getItemType() { return itemType; }
    public void setItemType(ItemType itemType) { this.itemType = itemType; }

    public ItemRarity getRarity() { return rarity; }
    public void setRarity(ItemRarity rarity) { this.rarity = rarity; }

    public Stats getStatsBonus() { return statsBonus; }

    public int getHpBonus() { return statsBonus.getHp(); }
    public int getMpBonus() { return statsBonus.getMp(); }
    public int getStrengthBonus() { return statsBonus.getStrength(); }
    public int getDexterityBonus() { return statsBonus.getDexterity(); }
    public int getDefenseBonus() { return statsBonus.getDefense(); }
}

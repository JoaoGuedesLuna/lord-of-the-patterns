package dev.guedes.lordofthepatterns.common.item;

import dev.guedes.lordofthepatterns.common.item.enums.ItemRarity;
import dev.guedes.lordofthepatterns.common.item.enums.ItemType;

/**
 * @author João Guedes
 */
public class Item {
    private String name;
    private ItemType itemType;
    private ItemRarity rarity;

    public Item(String name, ItemType itemType, ItemRarity rarity) {
        this.name = name;
        this.itemType = itemType;
        this.rarity = rarity;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public ItemType getItemType() { return itemType; }
    public void setItemType(ItemType itemType) { this.itemType = itemType; }

    public ItemRarity getRarity() { return rarity; }
    public void setRarity(ItemRarity rarity) { this.rarity = rarity; }
}

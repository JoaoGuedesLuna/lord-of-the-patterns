package dev.guedes.lordofthepatterns.common.item;

import dev.guedes.lordofthepatterns.common.item.enums.AccessoryType;
import dev.guedes.lordofthepatterns.common.item.enums.ItemRarity;
import dev.guedes.lordofthepatterns.common.item.enums.ItemType;
import dev.guedes.lordofthepatterns.common.stats.Stats;

/**
 * @author João Guedes
 */
public class Accessory extends Item {
    private AccessoryType accessoryType;

    public Accessory(String name, ItemRarity rarity, AccessoryType accessoryType, Stats statsBonus) {
        super(name, ItemType.ACCESSORY, rarity, statsBonus);
        this.accessoryType = accessoryType;
    }

    public AccessoryType getAccessoryType() { return accessoryType; }
    public void setAccessoryType(AccessoryType accessoryType) { this.accessoryType = accessoryType; }
}

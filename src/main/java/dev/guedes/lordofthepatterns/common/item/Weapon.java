package dev.guedes.lordofthepatterns.common.item;

import dev.guedes.lordofthepatterns.common.item.enums.ItemRarity;
import dev.guedes.lordofthepatterns.common.item.enums.ItemType;
import dev.guedes.lordofthepatterns.common.item.enums.WeaponType;
import dev.guedes.lordofthepatterns.common.stats.Stats;

/**
 * @author João Guedes
 */
public class Weapon extends Item {
    private WeaponType weaponType;

    public Weapon(String name, ItemRarity rarity, WeaponType weaponType, Stats statsBonus) {
        super(name, ItemType.WEAPON, rarity, statsBonus);
        this.weaponType = weaponType;
    }

    public WeaponType getWeaponType() { return weaponType; }
    public void setWeaponType(WeaponType weaponType) { this.weaponType = weaponType; }
}

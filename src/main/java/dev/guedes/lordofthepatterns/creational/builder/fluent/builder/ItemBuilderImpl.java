package dev.guedes.lordofthepatterns.creational.builder.fluent.builder;

import dev.guedes.lordofthepatterns.common.item.Item;
import dev.guedes.lordofthepatterns.common.item.enums.ItemRarity;
import dev.guedes.lordofthepatterns.common.item.enums.ItemType;

/**
 * Builder Pattern - Fluent Concrete Builder
 *
 * <p>
 * The Builder pattern enables step-by-step object construction
 * while separating creation logic from representation.
 * </p>
 *
 * <p>
 * This concrete builder implements the Fluent Builder approach,
 * allowing chained configuration methods for creating {@link Item} objects.
 * </p>
 *
 * <h2>When to Use</h2>
 * <ul>
 *     <li>When object creation requires many optional fields.</li>
 *     <li>When fluent APIs improve readability and usability.</li>
 *     <li>When object configuration should remain flexible.</li>
 * </ul>
 *
 * <h2>When Not to Use</h2>
 * <ul>
 *     <li>When direct constructors are sufficient.</li>
 *     <li>When fluent chaining reduces code clarity.</li>
 * </ul>
 *
 * <h2>Advantages</h2>
 * <ul>
 *     <li>Provides expressive and readable object creation.</li>
 *     <li>Supports flexible configuration flows.</li>
 *     <li>Encapsulates item construction logic.</li>
 * </ul>
 *
 * <h2>Disadvantages</h2>
 * <ul>
 *     <li>Can introduce additional complexity.</li>
 *     <li>May require more boilerplate code than simple constructors.</li>
 * </ul>
 *
 * @author João Guedes
 */
public class ItemBuilderImpl implements ItemBuilder {
    private Item item;

    public ItemBuilderImpl() { reset(); }

    @Override
    public ItemBuilder reset() {
        item = new Item();
        return this;
    }

    @Override
    public ItemBuilder name(String name) {
        item.setName(name);
        return this;
    }

    @Override
    public ItemBuilder itemType(ItemType type) {
        item.setItemType(type);
        return this;
    }

    @Override
    public ItemBuilder rarity(ItemRarity rarity) {
        item.setRarity(rarity);
        return this;
    }

    @Override
    public ItemBuilder hpBonus(int hpBonus) {
        item.getStatsBonus().setHp(hpBonus);
        return this;
    }

    @Override
    public ItemBuilder mpBonus(int mpBonus) {
        item.getStatsBonus().setMp(mpBonus);
        return this;
    }

    @Override
    public ItemBuilder strengthBonus(int strengthBonus) {
        item.getStatsBonus().setStrength(strengthBonus);
        return this;
    }

    @Override
    public ItemBuilder dexterityBonus(int dexterityBonus) {
        item.getStatsBonus().setDexterity(dexterityBonus);
        return this;
    }

    @Override
    public ItemBuilder defenseBonus(int defenseBonus) {
        item.getStatsBonus().setDefense(defenseBonus);
        return this;
    }

    @Override
    public Item build() { return item; }
}

package dev.guedes.lordofthepatterns.creational.builder.fluent.builder;

import dev.guedes.lordofthepatterns.common.item.Item;
import dev.guedes.lordofthepatterns.common.item.enums.ItemRarity;
import dev.guedes.lordofthepatterns.common.item.enums.ItemType;

/**
 * Builder Pattern - Fluent Builder Interface
 *
 * <p>
 * The Builder pattern separates the construction of complex objects
 * from their representation, enabling flexible and reusable object creation.
 * </p>
 *
 * <p>
 * This Fluent Builder variation returns the builder instance after each
 * configuration step, allowing chained method calls and improved readability.
 * </p>
 *
 * <h2>When to Use</h2>
 * <ul>
 *     <li>When objects contain many configurable or optional fields.</li>
 *     <li>When method chaining improves readability.</li>
 *     <li>When object creation should be expressive and maintainable.</li>
 * </ul>
 *
 * <h2>When Not to Use</h2>
 * <ul>
 *     <li>When object construction is simple.</li>
 *     <li>When fluent APIs introduce unnecessary verbosity.</li>
 * </ul>
 *
 * <h2>Advantages</h2>
 * <ul>
 *     <li>Improves readability through method chaining.</li>
 *     <li>Provides expressive object creation syntax.</li>
 *     <li>Supports flexible configuration flows.</li>
 * </ul>
 *
 * <h2>Disadvantages</h2>
 * <ul>
 *     <li>Can increase API complexity.</li>
 *     <li>May require additional boilerplate code.</li>
 * </ul>
 *
 * @author João Guedes
 */
public interface ItemBuilder {
    ItemBuilder reset();
    ItemBuilder name(String name);
    ItemBuilder itemType(ItemType type);
    ItemBuilder rarity(ItemRarity rarity);
    ItemBuilder hpBonus(int hpBonus);
    ItemBuilder mpBonus(int mpBonus);
    ItemBuilder strengthBonus(int strengthBonus);
    ItemBuilder dexterityBonus(int dexterityBonus);
    ItemBuilder defenseBonus(int defenseBonus);
    Item build();
}

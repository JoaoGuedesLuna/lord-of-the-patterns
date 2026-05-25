package dev.guedes.lordofthepatterns.creational.builder.fluent.director;

import dev.guedes.lordofthepatterns.common.item.enums.ItemType;
import dev.guedes.lordofthepatterns.common.item.enums.ItemRarity;
import dev.guedes.lordofthepatterns.creational.builder.fluent.builder.ItemBuilder;

/**
 * Builder Pattern - Fluent Director
 *
 * <p>
 * The Builder pattern separates object construction from representation,
 * enabling reusable and maintainable construction logic.
 * </p>
 *
 * <p>
 * This Director coordinates the creation of predefined consumable items
 * using the Fluent Builder approach.
 * </p>
 *
 * <h2>When to Use</h2>
 * <ul>
 *     <li>When predefined object recipes are required.</li>
 *     <li>When construction logic should remain centralized.</li>
 *     <li>When fluent APIs improve readability and maintainability.</li>
 * </ul>
 *
 * <h2>When Not to Use</h2>
 * <ul>
 *     <li>When object creation is simple and straightforward.</li>
 *     <li>When predefined configurations are unnecessary.</li>
 * </ul>
 *
 * <h2>Advantages</h2>
 * <ul>
 *     <li>Encapsulates predefined item construction logic.</li>
 *     <li>Improves consistency of object creation.</li>
 *     <li>Separates creation logic from client code.</li>
 * </ul>
 *
 * <h2>Disadvantages</h2>
 * <ul>
 *     <li>Introduces additional abstraction layers.</li>
 *     <li>May increase project complexity.</li>
 * </ul>
 *
 * @author João Guedes
 */
public class ConsumableItemDirector {
    public void constructHealingDraught(ItemBuilder builder) {
        builder.reset()
                .name("Healing Draught")
                .itemType(ItemType.CONSUMABLE)
                .rarity(ItemRarity.COMMON)
                .hpBonus(20);
    }

    public void constructElvenCordial(ItemBuilder builder) {
        builder.reset()
                .name("Elven Cordial")
                .itemType(ItemType.CONSUMABLE)
                .rarity(ItemRarity.COMMON)
                .mpBonus(15);
    }

    public void constructTravelBread(ItemBuilder builder) {
        builder.reset()
                .name("Travel Bread")
                .itemType(ItemType.CONSUMABLE)
                .rarity(ItemRarity.COMMON)
                .hpBonus(15)
                .strengthBonus(1);
    }

    public void constructHerbalTea(ItemBuilder builder) {
        builder.reset()
                .name("Herbal Tea")
                .itemType(ItemType.CONSUMABLE)
                .rarity(ItemRarity.COMMON)
                .mpBonus(10)
                .dexterityBonus(1);
    }

    public void constructKingsfoilTincture(ItemBuilder builder) {
        builder.reset()
                .name("Kingsfoil Tincture")
                .itemType(ItemType.CONSUMABLE)
                .rarity(ItemRarity.UNCOMMON)
                .hpBonus(35)
                .mpBonus(15);
    }

    public void constructDwarvenStrengthBrew(ItemBuilder builder) {
        builder.reset()
                .name("Dwarven Strength Brew")
                .itemType(ItemType.CONSUMABLE)
                .rarity(ItemRarity.UNCOMMON)
                .hpBonus(10)
                .strengthBonus(5);
    }

    public void constructElvenAgilityElixir(ItemBuilder builder) {
        builder.reset()
                .name("Elven Agility Elixir")
                .itemType(ItemType.CONSUMABLE)
                .rarity(ItemRarity.UNCOMMON)
                .mpBonus(10)
                .dexterityBonus(5);
    }

    public void constructHoneyCakesOfBeorn(ItemBuilder builder) {
        builder.reset()
                .name("Honey Cakes of Beorn")
                .itemType(ItemType.CONSUMABLE)
                .rarity(ItemRarity.UNCOMMON)
                .hpBonus(25)
                .dexterityBonus(3);
    }

    public void constructLembasBread(ItemBuilder builder) {
        builder.reset()
                .name("Lembas Bread")
                .itemType(ItemType.CONSUMABLE)
                .rarity(ItemRarity.RARE)
                .hpBonus(50)
                .mpBonus(20)
                .strengthBonus(2)
                .dexterityBonus(2);
    }

    public void constructDwarvenAle(ItemBuilder builder) {
        builder.reset()
                .name("Dwarven Ale")
                .itemType(ItemType.CONSUMABLE)
                .rarity(ItemRarity.RARE)
                .hpBonus(20)
                .strengthBonus(6)
                .defenseBonus(3);
    }

    public void constructRohirrimHorsemead(ItemBuilder builder) {
        builder.reset()
                .name("Rohirrim Horsemead")
                .itemType(ItemType.CONSUMABLE)
                .rarity(ItemRarity.RARE)
                .hpBonus(40)
                .strengthBonus(3)
                .dexterityBonus(5);
    }

    public void constructKingsfoilSalve(ItemBuilder builder) {
        builder.reset()
                .name("Kingsfoil Salve")
                .itemType(ItemType.CONSUMABLE)
                .rarity(ItemRarity.RARE)
                .hpBonus(45)
                .defenseBonus(4);
    }

    public void constructMiruvor(ItemBuilder builder) {
        builder.reset()
                .name("Miruvor")
                .itemType(ItemType.CONSUMABLE)
                .rarity(ItemRarity.EPIC)
                .hpBonus(60)
                .mpBonus(40)
                .dexterityBonus(6);
    }

    public void constructEntDraught(ItemBuilder builder) {
        builder.reset()
                .name("Ent-Draught")
                .itemType(ItemType.CONSUMABLE)
                .rarity(ItemRarity.EPIC)
                .hpBonus(70)
                .strengthBonus(8)
                .defenseBonus(6);
    }

    public void constructAthelasPoultice(ItemBuilder builder) {
        builder.reset()
                .name("Athelas Poultice")
                .itemType(ItemType.CONSUMABLE)
                .rarity(ItemRarity.EPIC)
                .hpBonus(80)
                .mpBonus(20)
                .defenseBonus(5);
    }

    public void constructHobbitsPipeWeed(ItemBuilder builder) {
        builder.reset()
                .name("Hobbit's Pipe-weed")
                .itemType(ItemType.CONSUMABLE)
                .rarity(ItemRarity.EPIC)
                .mpBonus(35)
                .dexterityBonus(5)
                .defenseBonus(3);
    }

    public void constructOrcDraught(ItemBuilder builder) {
        builder.reset()
                .name("Orc Draught")
                .itemType(ItemType.CONSUMABLE)
                .rarity(ItemRarity.LEGENDARY)
                .hpBonus(90)
                .mpBonus(-30)
                .strengthBonus(12)
                .dexterityBonus(-4);
    }

    public void constructDragonsStrengthElixir(ItemBuilder builder) {
        builder.reset()
                .name("Dragon's Strength Elixir")
                .itemType(ItemType.CONSUMABLE)
                .rarity(ItemRarity.LEGENDARY)
                .hpBonus(40)
                .strengthBonus(15)
                .defenseBonus(5);
    }

    public void constructMorgulElixir(ItemBuilder builder) {
        builder.reset()
                .name("Morgul Elixir")
                .itemType(ItemType.CONSUMABLE)
                .rarity(ItemRarity.LEGENDARY)
                .hpBonus(-40)
                .strengthBonus(18)
                .dexterityBonus(8)
                .defenseBonus(-8);
    }

    public void constructLightOfEarendil(ItemBuilder builder) {
        builder.reset()
                .name("Light of Eärendil")
                .itemType(ItemType.CONSUMABLE)
                .rarity(ItemRarity.MYTHIC)
                .hpBonus(100)
                .mpBonus(60)
                .strengthBonus(10)
                .dexterityBonus(10)
                .defenseBonus(8);
    }

    public void constructSilmarilEssence(ItemBuilder builder) {
        builder.reset()
                .name("Silmaril Essence")
                .itemType(ItemType.CONSUMABLE)
                .rarity(ItemRarity.MYTHIC)
                .hpBonus(120)
                .mpBonus(80)
                .strengthBonus(12)
                .dexterityBonus(12)
                .defenseBonus(10);
    }

    public void constructValinorAmbrosia(ItemBuilder builder) {
        builder.reset()
                .name("Valinor Ambrosia")
                .itemType(ItemType.CONSUMABLE)
                .rarity(ItemRarity.MYTHIC)
                .hpBonus(150)
                .mpBonus(100)
                .strengthBonus(15)
                .dexterityBonus(15)
                .defenseBonus(12);
    }
}

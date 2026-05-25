package dev.guedes.lordofthepatterns.creational.builder.fluent.director;

import dev.guedes.lordofthepatterns.common.item.Item;
import dev.guedes.lordofthepatterns.common.item.enums.ItemRarity;
import dev.guedes.lordofthepatterns.common.item.enums.ItemType;
import dev.guedes.lordofthepatterns.creational.builder.fluent.builder.ItemBuilder;
import dev.guedes.lordofthepatterns.creational.builder.fluent.builder.ItemBuilderImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link ConsumableItemDirector}.
 *
 * @author João Guedes
 */
class ConsumableItemDirectorTest {
    @Test
    void constructHealingDraught_ShouldBuildCorrectConsumable_WhenDirectorConstructsObject() {
        ConsumableItemDirector director = new ConsumableItemDirector();
        ItemBuilder builder = new ItemBuilderImpl();

        director.constructHealingDraught(builder);
        Item item = builder.build();

        assertAll(
                () -> assertEquals("Healing Draught", item.getName()),
                () -> assertEquals(ItemType.CONSUMABLE, item.getItemType()),
                () -> assertEquals(ItemRarity.COMMON, item.getRarity()),
                () -> assertEquals(20, item.getHpBonus())
        );
    }

    @Test
    void constructElvenCordial_ShouldBuildCorrectConsumable_WhenDirectorConstructsObject() {
        ConsumableItemDirector director = new ConsumableItemDirector();
        ItemBuilder builder = new ItemBuilderImpl();

        director.constructElvenCordial(builder);
        Item item = builder.build();

        assertAll(
                () -> assertEquals("Elven Cordial", item.getName()),
                () -> assertEquals(ItemType.CONSUMABLE, item.getItemType()),
                () -> assertEquals(ItemRarity.COMMON, item.getRarity()),
                () -> assertEquals(15, item.getMpBonus())
        );
    }

    @Test
    void constructTravelBread_ShouldBuildCorrectConsumable_WhenDirectorConstructsObject() {
        ConsumableItemDirector director = new ConsumableItemDirector();
        ItemBuilder builder = new ItemBuilderImpl();

        director.constructTravelBread(builder);
        Item item = builder.build();

        assertAll(
                () -> assertEquals("Travel Bread", item.getName()),
                () -> assertEquals(ItemType.CONSUMABLE, item.getItemType()),
                () -> assertEquals(ItemRarity.COMMON, item.getRarity()),
                () -> assertEquals(15, item.getHpBonus()),
                () -> assertEquals(1, item.getStrengthBonus())
        );
    }

    @Test
    void constructHerbalTea_ShouldBuildCorrectConsumable_WhenDirectorConstructsObject() {
        ConsumableItemDirector director = new ConsumableItemDirector();
        ItemBuilder builder = new ItemBuilderImpl();

        director.constructHerbalTea(builder);
        Item item = builder.build();

        assertAll(
                () -> assertEquals("Herbal Tea", item.getName()),
                () -> assertEquals(ItemType.CONSUMABLE, item.getItemType()),
                () -> assertEquals(ItemRarity.COMMON, item.getRarity()),
                () -> assertEquals(10, item.getMpBonus()),
                () -> assertEquals(1, item.getDexterityBonus())
        );
    }

    @Test
    void constructKingsfoilTincture_ShouldBuildCorrectConsumable_WhenDirectorConstructsObject() {
        ConsumableItemDirector director = new ConsumableItemDirector();
        ItemBuilder builder = new ItemBuilderImpl();

        director.constructKingsfoilTincture(builder);
        Item item = builder.build();

        assertAll(
                () -> assertEquals("Kingsfoil Tincture", item.getName()),
                () -> assertEquals(ItemType.CONSUMABLE, item.getItemType()),
                () -> assertEquals(ItemRarity.UNCOMMON, item.getRarity()),
                () -> assertEquals(35, item.getHpBonus()),
                () -> assertEquals(15, item.getMpBonus())
        );
    }

    @Test
    void constructDwarvenStrengthBrew_ShouldBuildCorrectConsumable_WhenDirectorConstructsObject() {
        ConsumableItemDirector director = new ConsumableItemDirector();
        ItemBuilder builder = new ItemBuilderImpl();

        director.constructDwarvenStrengthBrew(builder);
        Item item = builder.build();

        assertAll(
                () -> assertEquals("Dwarven Strength Brew", item.getName()),
                () -> assertEquals(ItemType.CONSUMABLE, item.getItemType()),
                () -> assertEquals(ItemRarity.UNCOMMON, item.getRarity()),
                () -> assertEquals(10, item.getHpBonus()),
                () -> assertEquals(5, item.getStrengthBonus())
        );
    }

    @Test
    void constructElvenAgilityElixir_ShouldBuildCorrectConsumable_WhenDirectorConstructsObject() {
        ConsumableItemDirector director = new ConsumableItemDirector();
        ItemBuilder builder = new ItemBuilderImpl();

        director.constructElvenAgilityElixir(builder);
        Item item = builder.build();

        assertAll(
                () -> assertEquals("Elven Agility Elixir", item.getName()),
                () -> assertEquals(ItemType.CONSUMABLE, item.getItemType()),
                () -> assertEquals(ItemRarity.UNCOMMON, item.getRarity()),
                () -> assertEquals(10, item.getMpBonus()),
                () -> assertEquals(5, item.getDexterityBonus())
        );
    }

    @Test
    void constructHoneyCakesOfBeorn_ShouldBuildCorrectConsumable_WhenDirectorConstructsObject() {
        ConsumableItemDirector director = new ConsumableItemDirector();
        ItemBuilder builder = new ItemBuilderImpl();

        director.constructHoneyCakesOfBeorn(builder);
        Item item = builder.build();

        assertAll(
                () -> assertEquals("Honey Cakes of Beorn", item.getName()),
                () -> assertEquals(ItemType.CONSUMABLE, item.getItemType()),
                () -> assertEquals(ItemRarity.UNCOMMON, item.getRarity()),
                () -> assertEquals(25, item.getHpBonus()),
                () -> assertEquals(3, item.getDexterityBonus())
        );
    }

    @Test
    void constructLembasBread_ShouldBuildCorrectConsumable_WhenDirectorConstructsObject() {
        ConsumableItemDirector director = new ConsumableItemDirector();
        ItemBuilder builder = new ItemBuilderImpl();

        director.constructLembasBread(builder);
        Item item = builder.build();

        assertAll(
                () -> assertEquals("Lembas Bread", item.getName()),
                () -> assertEquals(ItemType.CONSUMABLE, item.getItemType()),
                () -> assertEquals(ItemRarity.RARE, item.getRarity()),
                () -> assertEquals(50, item.getHpBonus()),
                () -> assertEquals(20, item.getMpBonus()),
                () -> assertEquals(2, item.getStrengthBonus()),
                () -> assertEquals(2, item.getDexterityBonus())
        );
    }

    @Test
    void constructDwarvenAle_ShouldBuildCorrectConsumable_WhenDirectorConstructsObject() {
        ConsumableItemDirector director = new ConsumableItemDirector();
        ItemBuilder builder = new ItemBuilderImpl();

        director.constructDwarvenAle(builder);
        Item item = builder.build();

        assertAll(
                () -> assertEquals("Dwarven Ale", item.getName()),
                () -> assertEquals(ItemType.CONSUMABLE, item.getItemType()),
                () -> assertEquals(ItemRarity.RARE, item.getRarity()),
                () -> assertEquals(20, item.getHpBonus()),
                () -> assertEquals(6, item.getStrengthBonus()),
                () -> assertEquals(3, item.getDefenseBonus())
        );
    }

    @Test
    void constructRohirrimHorsemead_ShouldBuildCorrectConsumable_WhenDirectorConstructsObject() {
        ConsumableItemDirector director = new ConsumableItemDirector();
        ItemBuilder builder = new ItemBuilderImpl();

        director.constructRohirrimHorsemead(builder);
        Item item = builder.build();

        assertAll(
                () -> assertEquals("Rohirrim Horsemead", item.getName()),
                () -> assertEquals(ItemType.CONSUMABLE, item.getItemType()),
                () -> assertEquals(ItemRarity.RARE, item.getRarity()),
                () -> assertEquals(40, item.getHpBonus()),
                () -> assertEquals(3, item.getStrengthBonus()),
                () -> assertEquals(5, item.getDexterityBonus())
        );
    }

    @Test
    void constructKingsfoilSalve_ShouldBuildCorrectConsumable_WhenDirectorConstructsObject() {
        ConsumableItemDirector director = new ConsumableItemDirector();
        ItemBuilder builder = new ItemBuilderImpl();

        director.constructKingsfoilSalve(builder);
        Item item = builder.build();

        assertAll(
                () -> assertEquals("Kingsfoil Salve", item.getName()),
                () -> assertEquals(ItemType.CONSUMABLE, item.getItemType()),
                () -> assertEquals(ItemRarity.RARE, item.getRarity()),
                () -> assertEquals(45, item.getHpBonus()),
                () -> assertEquals(4, item.getDefenseBonus())
        );
    }

    @Test
    void constructMiruvor_ShouldBuildCorrectConsumable_WhenDirectorConstructsObject() {
        ConsumableItemDirector director = new ConsumableItemDirector();
        ItemBuilder builder = new ItemBuilderImpl();

        director.constructMiruvor(builder);
        Item item = builder.build();

        assertAll(
                () -> assertEquals("Miruvor", item.getName()),
                () -> assertEquals(ItemType.CONSUMABLE, item.getItemType()),
                () -> assertEquals(ItemRarity.EPIC, item.getRarity()),
                () -> assertEquals(60, item.getHpBonus()),
                () -> assertEquals(40, item.getMpBonus()),
                () -> assertEquals(6, item.getDexterityBonus())
        );
    }

    @Test
    void constructEntDraught_ShouldBuildCorrectConsumable_WhenDirectorConstructsObject() {
        ConsumableItemDirector director = new ConsumableItemDirector();
        ItemBuilder builder = new ItemBuilderImpl();

        director.constructEntDraught(builder);
        Item item = builder.build();

        assertAll(
                () -> assertEquals("Ent-Draught", item.getName()),
                () -> assertEquals(ItemType.CONSUMABLE, item.getItemType()),
                () -> assertEquals(ItemRarity.EPIC, item.getRarity()),
                () -> assertEquals(70, item.getHpBonus()),
                () -> assertEquals(8, item.getStrengthBonus()),
                () -> assertEquals(6, item.getDefenseBonus())
        );
    }

    @Test
    void constructAthelasPoultice_ShouldBuildCorrectConsumable_WhenDirectorConstructsObject() {
        ConsumableItemDirector director = new ConsumableItemDirector();
        ItemBuilder builder = new ItemBuilderImpl();

        director.constructAthelasPoultice(builder);
        Item item = builder.build();

        assertAll(
                () -> assertEquals("Athelas Poultice", item.getName()),
                () -> assertEquals(ItemType.CONSUMABLE, item.getItemType()),
                () -> assertEquals(ItemRarity.EPIC, item.getRarity()),
                () -> assertEquals(80, item.getHpBonus()),
                () -> assertEquals(20, item.getMpBonus()),
                () -> assertEquals(5, item.getDefenseBonus())
        );
    }

    @Test
    void constructHobbitsPipeWeed_ShouldBuildCorrectConsumable_WhenDirectorConstructsObject() {
        ConsumableItemDirector director = new ConsumableItemDirector();
        ItemBuilder builder = new ItemBuilderImpl();

        director.constructHobbitsPipeWeed(builder);
        Item item = builder.build();

        assertAll(
                () -> assertEquals("Hobbit's Pipe-weed", item.getName()),
                () -> assertEquals(ItemType.CONSUMABLE, item.getItemType()),
                () -> assertEquals(ItemRarity.EPIC, item.getRarity()),
                () -> assertEquals(35, item.getMpBonus()),
                () -> assertEquals(5, item.getDexterityBonus()),
                () -> assertEquals(3, item.getDefenseBonus())
        );
    }

    @Test
    void constructOrcDraught_ShouldBuildCorrectConsumable_WhenDirectorConstructsObject() {
        ConsumableItemDirector director = new ConsumableItemDirector();
        ItemBuilder builder = new ItemBuilderImpl();

        director.constructOrcDraught(builder);
        Item item = builder.build();

        assertAll(
                () -> assertEquals("Orc Draught", item.getName()),
                () -> assertEquals(ItemType.CONSUMABLE, item.getItemType()),
                () -> assertEquals(ItemRarity.LEGENDARY, item.getRarity()),
                () -> assertEquals(90, item.getHpBonus()),
                () -> assertEquals(-30, item.getMpBonus()),
                () -> assertEquals(12, item.getStrengthBonus()),
                () -> assertEquals(-4, item.getDexterityBonus())
        );
    }

    @Test
    void constructDragonsStrengthElixir_ShouldBuildCorrectConsumable_WhenDirectorConstructsObject() {
        ConsumableItemDirector director = new ConsumableItemDirector();
        ItemBuilder builder = new ItemBuilderImpl();

        director.constructDragonsStrengthElixir(builder);
        Item item = builder.build();

        assertAll(
                () -> assertEquals("Dragon's Strength Elixir", item.getName()),
                () -> assertEquals(ItemType.CONSUMABLE, item.getItemType()),
                () -> assertEquals(ItemRarity.LEGENDARY, item.getRarity()),
                () -> assertEquals(40, item.getHpBonus()),
                () -> assertEquals(15, item.getStrengthBonus()),
                () -> assertEquals(5, item.getDefenseBonus())
        );
    }

    @Test
    void constructMorgulElixir_ShouldBuildCorrectConsumable_WhenDirectorConstructsObject() {
        ConsumableItemDirector director = new ConsumableItemDirector();
        ItemBuilder builder = new ItemBuilderImpl();

        director.constructMorgulElixir(builder);
        Item item = builder.build();

        assertAll(
                () -> assertEquals("Morgul Elixir", item.getName()),
                () -> assertEquals(ItemType.CONSUMABLE, item.getItemType()),
                () -> assertEquals(ItemRarity.LEGENDARY, item.getRarity()),
                () -> assertEquals(-40, item.getHpBonus()),
                () -> assertEquals(18, item.getStrengthBonus()),
                () -> assertEquals(8, item.getDexterityBonus()),
                () -> assertEquals(-8, item.getDefenseBonus())
        );
    }

    @Test
    void constructLightOfEarendil_ShouldBuildCorrectConsumable_WhenDirectorConstructsObject() {
        ConsumableItemDirector director = new ConsumableItemDirector();
        ItemBuilder builder = new ItemBuilderImpl();

        director.constructLightOfEarendil(builder);
        Item item = builder.build();

        assertAll(
                () -> assertEquals("Light of Eärendil", item.getName()),
                () -> assertEquals(ItemType.CONSUMABLE, item.getItemType()),
                () -> assertEquals(ItemRarity.MYTHIC, item.getRarity()),
                () -> assertEquals(100, item.getHpBonus()),
                () -> assertEquals(60, item.getMpBonus()),
                () -> assertEquals(10, item.getStrengthBonus()),
                () -> assertEquals(10, item.getDexterityBonus()),
                () -> assertEquals(8, item.getDefenseBonus())
        );
    }

    @Test
    void constructSilmarilEssence_ShouldBuildCorrectConsumable_WhenDirectorConstructsObject() {
        ConsumableItemDirector director = new ConsumableItemDirector();
        ItemBuilder builder = new ItemBuilderImpl();

        director.constructSilmarilEssence(builder);
        Item item = builder.build();

        assertAll(
                () -> assertEquals("Silmaril Essence", item.getName()),
                () -> assertEquals(ItemType.CONSUMABLE, item.getItemType()),
                () -> assertEquals(ItemRarity.MYTHIC, item.getRarity()),
                () -> assertEquals(120, item.getHpBonus()),
                () -> assertEquals(80, item.getMpBonus()),
                () -> assertEquals(12, item.getStrengthBonus()),
                () -> assertEquals(12, item.getDexterityBonus()),
                () -> assertEquals(10, item.getDefenseBonus())
        );
    }

    @Test
    void constructValinorAmbrosia_ShouldBuildCorrectConsumable_WhenDirectorConstructsObject() {
        ConsumableItemDirector director = new ConsumableItemDirector();
        ItemBuilder builder = new ItemBuilderImpl();

        director.constructValinorAmbrosia(builder);
        Item item = builder.build();

        assertAll(
                () -> assertEquals("Valinor Ambrosia", item.getName()),
                () -> assertEquals(ItemType.CONSUMABLE, item.getItemType()),
                () -> assertEquals(ItemRarity.MYTHIC, item.getRarity()),
                () -> assertEquals(150, item.getHpBonus()),
                () -> assertEquals(100, item.getMpBonus()),
                () -> assertEquals(15, item.getStrengthBonus()),
                () -> assertEquals(15, item.getDexterityBonus()),
                () -> assertEquals(12, item.getDefenseBonus())
        );
    }
}

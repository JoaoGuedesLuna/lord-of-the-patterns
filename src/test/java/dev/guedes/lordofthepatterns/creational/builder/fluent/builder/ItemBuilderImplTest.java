package dev.guedes.lordofthepatterns.creational.builder.fluent.builder;

import dev.guedes.lordofthepatterns.common.item.Item;
import dev.guedes.lordofthepatterns.common.item.enums.ItemRarity;
import dev.guedes.lordofthepatterns.common.item.enums.ItemType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * Test class for {@link ItemBuilderImpl}.
 *
 * @author João Guedes
 */
class ItemBuilderImplTest {
    @Test
    void build_ShouldCreateItemWithConfiguredValues_WhenAttributesAreProvided() {
        ItemBuilder builder = new ItemBuilderImpl();

        Item item = builder
                .name("Lembas Bread")
                .itemType(ItemType.CONSUMABLE)
                .rarity(ItemRarity.RARE)
                .hpBonus(50)
                .mpBonus(20)
                .strengthBonus(2)
                .dexterityBonus(2)
                .defenseBonus(0)
                .build();

        assertAll(
                () -> assertEquals("Lembas Bread", item.getName()),
                () -> assertEquals(ItemType.CONSUMABLE, item.getItemType()),
                () -> assertEquals(ItemRarity.RARE, item.getRarity()),
                () -> assertEquals(50, item.getHpBonus()),
                () -> assertEquals(20, item.getMpBonus()),
                () -> assertEquals(2, item.getStrengthBonus()),
                () -> assertEquals(2, item.getDexterityBonus()),
                () -> assertEquals(0, item.getDefenseBonus())
        );
    }

    @Test
    void reset_ShouldClearPreviousConfiguration_WhenCalled() {
        ItemBuilder builder = new ItemBuilderImpl();

        builder.name("Lembas Bread")
                .itemType(ItemType.CONSUMABLE)
                .rarity(ItemRarity.RARE)
                .hpBonus(50)
                .mpBonus(20)
                .strengthBonus(2)
                .defenseBonus(0)
                .dexterityBonus(2);

        Item item = builder
                .reset()
                .build();

        assertAll(
                () -> assertNull(item.getName()),
                () -> assertNull(item.getItemType()),
                () -> assertNull(item.getRarity()),
                () -> assertEquals(0, item.getHpBonus()),
                () -> assertEquals(0, item.getMpBonus()),
                () -> assertEquals(0, item.getStrengthBonus()),
                () -> assertEquals(0, item.getDexterityBonus()),
                () -> assertEquals(0, item.getDefenseBonus())
        );
    }
}

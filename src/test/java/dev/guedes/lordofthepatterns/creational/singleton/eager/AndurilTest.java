package dev.guedes.lordofthepatterns.creational.singleton.eager;

import dev.guedes.lordofthepatterns.common.item.enums.ItemRarity;
import dev.guedes.lordofthepatterns.common.item.enums.ItemType;
import dev.guedes.lordofthepatterns.common.item.enums.WeaponType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

/**
 * Test class for {@link Anduril}.
 *
 * @author João Guedes
 */
class AndurilTest {
    @Test
    void getInstance_ShouldReturnSameInstance_WhenCalledMultipleTimes() {
        Anduril firstInstance = Anduril.getInstance();
        Anduril secondInstance = Anduril.getInstance();

        assertSame(firstInstance, secondInstance);
    }

    @Test
    void getInstance_ShouldInitializeCorrectAttributes_WhenInstanceIsCreated() {
        Anduril anduril = Anduril.getInstance();

        assertAll(
                () -> assertEquals("Anduril", anduril.getName()),
                () -> assertEquals(ItemType.WEAPON, anduril.getItemType()),
                () -> assertEquals(ItemRarity.LEGENDARY, anduril.getRarity()),
                () -> assertEquals(WeaponType.SWORD, anduril.getWeaponType())
        );
    }
}

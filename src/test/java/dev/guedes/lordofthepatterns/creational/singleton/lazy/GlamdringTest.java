package dev.guedes.lordofthepatterns.creational.singleton.lazy;

import dev.guedes.lordofthepatterns.common.item.enums.ItemRarity;
import dev.guedes.lordofthepatterns.common.item.enums.ItemType;
import dev.guedes.lordofthepatterns.common.item.enums.WeaponType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

/**
 * Test class for {@link Glamdring}.
 *
 * @author João Guedes
 */
class GlamdringTest {
    @Test
    void getInstance_ShouldReturnSameInstance_WhenCalledMultipleTimes() {
        Glamdring firstInstance = Glamdring.getInstance();
        Glamdring secondInstance = Glamdring.getInstance();

        assertSame(firstInstance, secondInstance);
    }

    @Test
    void getInstance_ShouldInitializeCorrectAttributes_WhenInstanceIsCreated() {
        Glamdring glamdring = Glamdring.getInstance();

        assertAll(
                () -> assertEquals("Glamdring", glamdring.getName()),
                () -> assertEquals(ItemType.WEAPON, glamdring.getItemType()),
                () -> assertEquals(ItemRarity.LEGENDARY, glamdring.getRarity()),
                () -> assertEquals(WeaponType.SWORD, glamdring.getWeaponType())
        );
    }
}

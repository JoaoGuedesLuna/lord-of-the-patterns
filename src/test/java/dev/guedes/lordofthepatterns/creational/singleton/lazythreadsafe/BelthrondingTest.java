package dev.guedes.lordofthepatterns.creational.singleton.lazythreadsafe;

import dev.guedes.lordofthepatterns.common.item.enums.ItemRarity;
import dev.guedes.lordofthepatterns.common.item.enums.ItemType;
import dev.guedes.lordofthepatterns.common.item.enums.WeaponType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

/**
 * Test class for {@link Belthronding}.
 *
 * @author João Guedes
 */
class BelthrondingTest {
    @Test
    void getInstance_ShouldReturnSameInstance_WhenCalledMultipleTimes() {
        Belthronding firstInstance = Belthronding.getInstance();
        Belthronding secondInstance = Belthronding.getInstance();

        assertSame(firstInstance, secondInstance);
    }

    @Test
    void getInstance_ShouldInitializeCorrectAttributes_WhenInstanceIsCreated() {
        Belthronding belthronding = Belthronding.getInstance();

        assertAll(
                () -> assertEquals("Belthronding", belthronding.getName()),
                () -> assertEquals(ItemType.WEAPON, belthronding.getItemType()),
                () -> assertEquals(ItemRarity.EPIC, belthronding.getRarity()),
                () -> assertEquals(WeaponType.BOW, belthronding.getWeaponType())
        );
    }
}

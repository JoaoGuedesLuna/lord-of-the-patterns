package dev.guedes.lordofthepatterns.creational.singleton.billpugh;

import dev.guedes.lordofthepatterns.common.item.enums.AccessoryType;
import dev.guedes.lordofthepatterns.common.item.enums.ItemRarity;
import dev.guedes.lordofthepatterns.common.item.enums.ItemType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

/**
 * Test class for {@link OneRing}.
 *
 * @author João Guedes
 */
class OneRingTest {
    @Test
    void getInstance_ShouldReturnSameInstance_WhenCalledMultipleTimes() {
        OneRing firstInstance = OneRing.getInstance();
        OneRing secondInstance = OneRing.getInstance();

        assertSame(firstInstance, secondInstance);
    }

    @Test
    void getInstance_ShouldInitializeCorrectAttributes_WhenInstanceIsCreated() {
        OneRing oneRing = OneRing.getInstance();

        assertAll(
                () -> assertEquals("OneRing", oneRing.getName()),
                () -> assertEquals(ItemType.ACCESSORY, oneRing.getItemType()),
                () -> assertEquals(ItemRarity.MYTHIC, oneRing.getRarity()),
                () -> assertEquals(AccessoryType.RING, oneRing.getAccessoryType())
        );
    }
}

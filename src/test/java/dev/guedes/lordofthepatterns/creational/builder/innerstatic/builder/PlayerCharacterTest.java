package dev.guedes.lordofthepatterns.creational.builder.innerstatic.builder;

import dev.guedes.lordofthepatterns.common.character.enums.Race;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * Test class for {@link PlayerCharacter}.
 *
 * @author João Guedes
 */
class PlayerCharacterTest {
    @Test
    void build_ShouldCreatePlayerCharacterWithConfiguredValues_WhenAttributesAreProvided() {
        PlayerCharacter character = PlayerCharacter.builder()
                .name("Aragorn")
                .race(Race.HUMAN)
                .hp(150)
                .mp(40)
                .strength(18)
                .dexterity(14)
                .defense(12)
                .experience(5000)
                .build();

        assertAll(
                () -> assertEquals("Aragorn", character.getName()),
                () -> assertEquals(Race.HUMAN, character.getRace()),
                () -> assertEquals(150, character.getHp()),
                () -> assertEquals(40, character.getMp()),
                () -> assertEquals(18, character.getStrength()),
                () -> assertEquals(14, character.getDexterity()),
                () -> assertEquals(12, character.getDefense()),
                () -> assertEquals(5000, character.getExperience()),
                () -> assertEquals(6, character.getLevel()),
                () -> assertEquals(10, character.getAttributePoint())
        );
    }

    @Test
    void reset_ShouldClearPreviousConfiguration_WhenCalled() {
        PlayerCharacter.Builder builder = PlayerCharacter.builder()
                .name("Aragorn")
                .race(Race.HUMAN)
                .hp(150)
                .mp(40)
                .strength(18)
                .dexterity(14)
                .defense(12)
                .experience(5000);

        PlayerCharacter character = builder
                .reset()
                .build();

        assertAll(
                () -> assertNull(character.getName()),
                () -> assertNull(character.getRace()),
                () -> assertEquals(0, character.getHp()),
                () -> assertEquals(0, character.getMp()),
                () -> assertEquals(0, character.getStrength()),
                () -> assertEquals(0, character.getDexterity()),
                () -> assertEquals(0, character.getDefense()),
                () -> assertEquals(0, character.getExperience()),
                () -> assertEquals(1, character.getLevel()),
                () -> assertEquals(0, character.getAttributePoint())
        );
    }
}

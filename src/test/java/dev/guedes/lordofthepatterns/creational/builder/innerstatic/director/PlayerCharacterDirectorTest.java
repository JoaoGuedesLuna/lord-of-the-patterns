package dev.guedes.lordofthepatterns.creational.builder.innerstatic.director;

import dev.guedes.lordofthepatterns.common.character.enums.Race;
import dev.guedes.lordofthepatterns.creational.builder.innerstatic.builder.PlayerCharacter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link PlayerCharacterDirector}.
 *
 * @author João Guedes
 */
class PlayerCharacterDirectorTest {
    @Test
    void constructAragorn_ShouldBuildCorrectCharacter_WhenDirectorConstructsObject() {
        PlayerCharacterDirector director = new PlayerCharacterDirector();
        PlayerCharacter.Builder builder = PlayerCharacter.builder();

        director.constructAragorn(builder);
        PlayerCharacter character = builder.build();

        assertAll(
                () -> assertEquals("Aragorn", character.getName()),
                () -> assertEquals(Race.HUMAN, character.getRace()),
                () -> assertEquals(150, character.getHp()),
                () -> assertEquals(40, character.getMp()),
                () -> assertEquals(18, character.getStrength()),
                () -> assertEquals(14, character.getDexterity()),
                () -> assertEquals(12, character.getDefense()),
                () -> assertEquals(6, character.getLevel()),
                () -> assertEquals(10, character.getAttributePoint())
        );
    }

    @Test
    void constructFrodo_ShouldBuildCorrectCharacter_WhenDirectorConstructsObject() {
        PlayerCharacterDirector director = new PlayerCharacterDirector();
        PlayerCharacter.Builder builder = PlayerCharacter.builder();

        director.constructFrodo(builder);
        PlayerCharacter character = builder.build();

        assertAll(
                () -> assertEquals("Frodo", character.getName()),
                () -> assertEquals(Race.HOBBIT, character.getRace()),
                () -> assertEquals(90, character.getHp()),
                () -> assertEquals(30, character.getMp()),
                () -> assertEquals(6, character.getStrength()),
                () -> assertEquals(15, character.getDexterity()),
                () -> assertEquals(8, character.getDefense()),
                () -> assertEquals(2, character.getLevel()),
                () -> assertEquals(2, character.getAttributePoint())
        );
    }

    @Test
    void constructGandalf_ShouldBuildCorrectCharacter_WhenDirectorConstructsObject() {
        PlayerCharacterDirector director = new PlayerCharacterDirector();
        PlayerCharacter.Builder builder = PlayerCharacter.builder();

        director.constructGandalf(builder);
        PlayerCharacter character = builder.build();

        assertAll(
                () -> assertEquals("Gandalf", character.getName()),
                () -> assertEquals(Race.MAIAR, character.getRace()),
                () -> assertEquals(120, character.getHp()),
                () -> assertEquals(300, character.getMp()),
                () -> assertEquals(14, character.getStrength()),
                () -> assertEquals(12, character.getDexterity()),
                () -> assertEquals(15, character.getDefense()),
                () -> assertEquals(21, character.getLevel()),
                () -> assertEquals(40, character.getAttributePoint())
        );
    }

    @Test
    void constructGimli_ShouldBuildCorrectCharacter_WhenDirectorConstructsObject() {
        PlayerCharacterDirector director = new PlayerCharacterDirector();
        PlayerCharacter.Builder builder = PlayerCharacter.builder();

        director.constructGimli(builder);
        PlayerCharacter character = builder.build();

        assertAll(
                () -> assertEquals("Gimli", character.getName()),
                () -> assertEquals(Race.DWARF, character.getRace()),
                () -> assertEquals(180, character.getHp()),
                () -> assertEquals(20, character.getMp()),
                () -> assertEquals(20, character.getStrength()),
                () -> assertEquals(8, character.getDexterity()),
                () -> assertEquals(18, character.getDefense()),
                () -> assertEquals(5, character.getLevel()),
                () -> assertEquals(8, character.getAttributePoint())
        );
    }

    @Test
    void constructLegolas_ShouldBuildCorrectCharacter_WhenDirectorConstructsObject() {
        PlayerCharacterDirector director = new PlayerCharacterDirector();
        PlayerCharacter.Builder builder = PlayerCharacter.builder();

        director.constructLegolas(builder);
        PlayerCharacter character = builder.build();

        assertAll(
                () -> assertEquals("Legolas", character.getName()),
                () -> assertEquals(Race.ELF, character.getRace()),
                () -> assertEquals(110, character.getHp()),
                () -> assertEquals(60, character.getMp()),
                () -> assertEquals(12, character.getStrength()),
                () -> assertEquals(22, character.getDexterity()),
                () -> assertEquals(10, character.getDefense()),
                () -> assertEquals(5, character.getLevel()),
                () -> assertEquals(8, character.getAttributePoint())
        );
    }
}

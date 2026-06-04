package dev.guedes.lordofthepatterns.creational.builder.innerstatic.director;

import dev.guedes.lordofthepatterns.common.character.enums.Race;
import dev.guedes.lordofthepatterns.creational.builder.innerstatic.builder.PlayerCharacter;

/**
 * Builder Pattern - Inner Static Builder Director
 *
 * <p>
 * The Builder pattern separates object construction from representation,
 * allowing reusable and organized object creation logic.
 * </p>
 *
 * <p>
 * This Director centralizes predefined player character configurations
 * using the Inner Static Builder approach.
 * </p>
 *
 * <h2>When to Use</h2>
 * <ul>
 *     <li>When predefined character templates are required.</li>
 *     <li>When object construction should remain centralized and reusable.</li>
 *     <li>When creating complex objects with many configurable fields.</li>
 * </ul>
 *
 * <h2>When Not to Use</h2>
 * <ul>
 *     <li>When direct object instantiation is simpler.</li>
 *     <li>When predefined configurations are unnecessary.</li>
 * </ul>
 *
 * <h2>Advantages</h2>
 * <ul>
 *     <li>Encapsulates predefined character construction logic.</li>
 *     <li>Improves consistency and maintainability.</li>
 *     <li>Separates configuration logic from business logic.</li>
 * </ul>
 *
 * <h2>Disadvantages</h2>
 * <ul>
 *     <li>Introduces additional abstraction layers.</li>
 *     <li>Can increase the number of supporting classes.</li>
 * </ul>
 *
 * @author João Guedes
 */
public class PlayerCharacterDirector {
    public void constructAragorn(PlayerCharacter.Builder builder) {
        builder.reset()
                .name("Aragorn")
                .race(Race.HUMAN)
                .hp(150)
                .mp(40)
                .strength(18)
                .dexterity(14)
                .defense(12)
                .experience(5000);
    }

    public void constructFrodo(PlayerCharacter.Builder builder) {
        builder.reset()
                .name("Frodo")
                .race(Race.HOBBIT)
                .hp(90)
                .mp(30)
                .strength(6)
                .dexterity(15)
                .defense(8)
                .experience(1200);
    }

    public void constructGandalf(PlayerCharacter.Builder builder) {
        builder.reset()
                .name("Gandalf")
                .race(Race.MAIAR)
                .hp(120)
                .mp(300)
                .strength(14)
                .dexterity(12)
                .defense(15)
                .experience(20000);
    }

    public void constructGimli(PlayerCharacter.Builder builder) {
        builder.reset()
                .name("Gimli")
                .race(Race.DWARF)
                .hp(180)
                .mp(20)
                .strength(20)
                .dexterity(8)
                .defense(18)
                .experience(4500);
    }

    public void constructLegolas(PlayerCharacter.Builder builder) {
        builder.reset()
                .name("Legolas")
                .race(Race.ELF)
                .hp(110)
                .mp(60)
                .strength(12)
                .dexterity(22)
                .defense(10)
                .experience(4700);
    }
}

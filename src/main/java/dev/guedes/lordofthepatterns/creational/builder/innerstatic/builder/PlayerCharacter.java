package dev.guedes.lordofthepatterns.creational.builder.innerstatic.builder;

import dev.guedes.lordofthepatterns.common.character.Character;
import dev.guedes.lordofthepatterns.common.character.enums.Race;

/**
 * Builder Pattern - Inner Static Builder
 *
 * <p>
 * The Inner Static Builder variation encapsulates the builder
 * inside the target class itself, providing a cohesive and
 * intuitive object creation API.
 * </p>
 *
 * <p>
 * This approach is commonly used for constructing complex objects
 * with multiple optional parameters while preserving readability.
 * </p>
 *
 * <h2>When to Use</h2>
 * <ul>
 *     <li>When objects contain many configurable fields.</li>
 *     <li>When avoiding telescoping constructors.</li>
 *     <li>When immutable or controlled object construction is desired.</li>
 * </ul>
 *
 * <h2>When Not to Use</h2>
 * <ul>
 *     <li>When objects are small and simple.</li>
 *     <li>When direct constructors are easier to maintain.</li>
 * </ul>
 *
 * <h2>Advantages</h2>
 * <ul>
 *     <li>Improves readability and maintainability.</li>
 *     <li>Encapsulates construction logic inside the target class.</li>
 *     <li>Supports fluent object creation.</li>
 * </ul>
 *
 * <h2>Disadvantages</h2>
 * <ul>
 *     <li>Requires additional boilerplate code.</li>
 *     <li>Can become large for highly complex objects.</li>
 * </ul>
 *
 * @author João Guedes
 */
public class PlayerCharacter extends Character {
    private int experience;
    private int level;
    private int attributePoint;

    public PlayerCharacter() {
        this.experience = 0;
        recalculateProgression();
    }

    public int getExperience() { return experience; }

    public void setExperience(int experience) {
        this.experience = experience;
        recalculateProgression();
    }

    public int getLevel() { return level; }

    public int getAttributePoint() { return attributePoint; }

    public static Builder builder() { return new Builder(); }

    private void recalculateProgression() {
        this.level = calculateLevel(experience);
        this.attributePoint = calculateAttributePoints(level);
    }

    private int calculateLevel(int experience) { return (experience / 1000) + 1; }

    private int calculateAttributePoints(int level) { return (level - 1) * 2; }

    public static class Builder {
        private PlayerCharacter playerCharacter;

        public Builder() { reset(); }

        public Builder reset() {
            playerCharacter = new PlayerCharacter();
            return this;
        }

        public Builder name(String name) {
            playerCharacter.setName(name);
            return this;
        }

        public Builder race(Race race) {
            playerCharacter.setRace(race);
            return this;
        }

        public Builder hp(int hp) {
            playerCharacter.getBaseStats().setHp(hp);
            playerCharacter.getCurrentStats().setHp(hp);
            return this;
        }

        public Builder mp(int mp) {
            playerCharacter.getBaseStats().setMp(mp);
            playerCharacter.getCurrentStats().setMp(mp);
            return this;
        }

        public Builder strength(int strength) {
            playerCharacter.getBaseStats().setStrength(strength);
            playerCharacter.getCurrentStats().setStrength(strength);
            return this;
        }

        public Builder dexterity(int dexterity) {
            playerCharacter.getBaseStats().setDexterity(dexterity);
            playerCharacter.getCurrentStats().setDexterity(dexterity);
            return this;
        }

        public Builder defense(int defense) {
            playerCharacter.getBaseStats().setDefense(defense);
            playerCharacter.getCurrentStats().setDefense(defense);
            return this;
        }

        public Builder experience(int experience) {
            playerCharacter.setExperience(experience);
            return this;
        }

        public PlayerCharacter build() { return playerCharacter; }
    }
}

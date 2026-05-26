package dev.guedes.lordofthepatterns.creational.builder.functional.director;

import dev.guedes.lordofthepatterns.common.attribute.enums.AttributeCategory;
import dev.guedes.lordofthepatterns.creational.builder.classic.builder.StatsBuilder;
import dev.guedes.lordofthepatterns.creational.builder.classic.builder.StatsBuilderImpl;
import dev.guedes.lordofthepatterns.creational.builder.functional.builder.AttributeBuilder;

/**
 * Builder Pattern - Functional Director
 *
 * <p>
 * The Builder pattern enables the step-by-step creation of complex objects
 * while separating construction logic from representation.
 * </p>
 *
 * <p>
 * This Director coordinates the creation of predefined Might attribute
 * progressions using the Functional Builder approach.
 * </p>
 *
 * <h2>When to Use</h2>
 * <ul>
 *     <li>When multiple predefined attribute configurations are required.</li>
 *     <li>When centralizing construction logic improves maintainability.</li>
 *     <li>When progressive attribute systems are used.</li>
 * </ul>
 *
 * <h2>When Not to Use</h2>
 * <ul>
 *     <li>When direct object creation is sufficient.</li>
 *     <li>When predefined recipes are unnecessary.</li>
 * </ul>
 *
 * <h2>Advantages</h2>
 * <ul>
 *     <li>Encapsulates predefined construction sequences.</li>
 *     <li>Improves consistency of attribute progression.</li>
 *     <li>Separates object configuration from usage logic.</li>
 * </ul>
 *
 * <h2>Disadvantages</h2>
 * <ul>
 *     <li>Adds additional classes and abstractions.</li>
 *     <li>May increase complexity for small systems.</li>
 * </ul>
 *
 * @author João Guedes
 */
public class MightAttributeDirector {
    private final StatsBuilder statsBuilder = new StatsBuilderImpl();

    public void constructMightTier1(AttributeBuilder builder) {
        statsBuilder.reset();
        statsBuilder.strength(3);

        builder.reset()
                .set(attr -> attr.setName("Brute Force"))
                .set(attr -> attr.setCategory(AttributeCategory.MIGHT))
                .set(attr -> attr.setDescription("Increases physical strength by 3 points"))
                .set(attr -> attr.setRequiredLevel(1))
                .set(attr -> attr.setPointCost(1))
                .set(attr -> attr.setStatsBonus(statsBuilder.build()));
    }

    public void constructMightTier2(AttributeBuilder builder) {
        statsBuilder.reset();
        statsBuilder.strength(6);
        statsBuilder.dexterity(1);

        builder.reset()
                .set(attr -> attr.setName("Power Strike"))
                .set(attr -> attr.setCategory(AttributeCategory.MIGHT))
                .set(attr -> attr.setDescription("Increases strength by 6 points and critical hit chance"))
                .set(attr -> attr.setRequiredLevel(3))
                .set(attr -> attr.setPointCost(2))
                .set(attr -> attr.setStatsBonus(statsBuilder.build()));
    }

    public void constructMightTier3(AttributeBuilder builder) {
        statsBuilder.reset();
        statsBuilder.strength(9);
        statsBuilder.dexterity(2);

        builder.reset()
                .set(attr -> attr.setName("Titan's Grip"))
                .set(attr -> attr.setCategory(AttributeCategory.MIGHT))
                .set(attr -> attr.setDescription("Increases strength by 9 points and allows wielding two-handed weapons with one hand"))
                .set(attr -> attr.setRequiredLevel(5))
                .set(attr -> attr.setPointCost(3))
                .set(attr -> attr.setStatsBonus(statsBuilder.build()));
    }

    public void constructMightTier4(AttributeBuilder builder) {
        statsBuilder.reset();
        statsBuilder.hp(20);
        statsBuilder.strength(12);
        statsBuilder.defense(2);

        builder.reset()
                .set(attr -> attr.setName("Berserker Rage"))
                .set(attr -> attr.setCategory(AttributeCategory.MIGHT))
                .set(attr -> attr.setDescription("Massive strength boost and temporary damage immunity when enraged"))
                .set(attr -> attr.setRequiredLevel(7))
                .set(attr -> attr.setPointCost(4))
                .set(attr -> attr.setStatsBonus(statsBuilder.build()));
    }

    public void constructMightTier5(AttributeBuilder builder) {
        statsBuilder.reset();
        statsBuilder.hp(30);
        statsBuilder.strength(15);
        statsBuilder.defense(3);

        builder.reset()
                .set(attr -> attr.setName("Balrog's Fury"))
                .set(attr -> attr.setCategory(AttributeCategory.MIGHT))
                .set(attr -> attr.setDescription("Ultimate might mastery - devastating attacks and area damage"))
                .set(attr -> attr.setRequiredLevel(10))
                .set(attr -> attr.setPointCost(5))
                .set(attr -> attr.setStatsBonus(statsBuilder.build()));
    }
}

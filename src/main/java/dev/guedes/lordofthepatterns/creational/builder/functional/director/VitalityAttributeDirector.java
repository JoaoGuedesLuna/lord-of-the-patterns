package dev.guedes.lordofthepatterns.creational.builder.functional.director;

import dev.guedes.lordofthepatterns.common.attribute.enums.AttributeCategory;
import dev.guedes.lordofthepatterns.creational.builder.classic.builder.StatsBuilder;
import dev.guedes.lordofthepatterns.creational.builder.classic.builder.StatsBuilderImpl;
import dev.guedes.lordofthepatterns.creational.builder.functional.builder.AttributeBuilder;

/**
 * Builder Pattern - Functional Director
 *
 * <p>
 * The Builder pattern enables organized and reusable object construction
 * while separating creation logic from representation.
 * </p>
 *
 * <p>
 * This Director coordinates the creation of predefined vitality-based
 * attribute progressions using the Functional Builder approach.
 * </p>
 *
 * <h2>When to Use</h2>
 * <ul>
 *     <li>When predefined health-oriented attribute configurations are required.</li>
 *     <li>When progression systems require reusable construction logic.</li>
 *     <li>When tier-based attribute systems are used.</li>
 * </ul>
 *
 * <h2>When Not to Use</h2>
 * <ul>
 *     <li>When object creation is simple and direct.</li>
 *     <li>When centralized construction logic is unnecessary.</li>
 * </ul>
 *
 * <h2>Advantages</h2>
 * <ul>
 *     <li>Improves consistency of vitality progression.</li>
 *     <li>Centralizes predefined construction logic.</li>
 *     <li>Promotes reuse and maintainability.</li>
 * </ul>
 *
 * <h2>Disadvantages</h2>
 * <ul>
 *     <li>Adds extra abstraction layers.</li>
 *     <li>May increase complexity in smaller applications.</li>
 * </ul>
 *
 * @author João Guedes
 */
public class VitalityAttributeDirector {
    private final StatsBuilder statsBuilder = new StatsBuilderImpl();

    public void constructVitalityTier1(AttributeBuilder builder) {
        statsBuilder.reset();
        statsBuilder.hp(20);

        builder.reset()
                .set(attr -> attr.setName("Robust Health"))
                .set(attr -> attr.setCategory(AttributeCategory.VITALITY))
                .set(attr -> attr.setDescription("Increases maximum health by 20 points"))
                .set(attr -> attr.setRequiredLevel(1))
                .set(attr -> attr.setPointCost(1))
                .set(attr -> attr.setStatsBonus(statsBuilder.build()));
    }

    public void constructVitalityTier2(AttributeBuilder builder) {
        statsBuilder.reset();
        statsBuilder.hp(40);
        statsBuilder.defense(2);

        builder.reset()
                .set(attr -> attr.setName("Enduring Constitution"))
                .set(attr -> attr.setCategory(AttributeCategory.VITALITY))
                .set(attr -> attr.setDescription("Increases maximum health by 40 points and defense by 2"))
                .set(attr -> attr.setRequiredLevel(3))
                .set(attr -> attr.setPointCost(2))
                .set(attr -> attr.setStatsBonus(statsBuilder.build()));
    }

    public void constructVitalityTier3(AttributeBuilder builder) {
        statsBuilder.reset();
        statsBuilder.hp(60);
        statsBuilder.defense(3);

        builder.reset()
                .set(attr -> attr.setName("Unbreakable Will"))
                .set(attr -> attr.setCategory(AttributeCategory.VITALITY))
                .set(attr -> attr.setDescription("Increases maximum health by 60 points and provides resistance to status effects"))
                .set(attr -> attr.setRequiredLevel(5))
                .set(attr -> attr.setPointCost(3))
                .set(attr -> attr.setStatsBonus(statsBuilder.build()));
    }

    public void constructVitalityTier4(AttributeBuilder builder) {
        statsBuilder.reset();
        statsBuilder.hp(80);
        statsBuilder.defense(5);

        builder.reset()
                .set(attr -> attr.setName("Dwarven Fortitude"))
                .set(attr -> attr.setCategory(AttributeCategory.VITALITY))
                .set(attr -> attr.setDescription("Grants massive health boost and damage reduction"))
                .set(attr -> attr.setRequiredLevel(7))
                .set(attr -> attr.setPointCost(4))
                .set(attr -> attr.setStatsBonus(statsBuilder.build()));
    }

    public void constructVitalityTier5(AttributeBuilder builder) {
        statsBuilder.reset();
        statsBuilder.hp(100);
        statsBuilder.defense(8);

        builder.reset()
                .set(attr -> attr.setName("Ent's Vitality"))
                .set(attr -> attr.setCategory(AttributeCategory.VITALITY))
                .set(attr -> attr.setDescription("Ultimate health mastery - doubles base health and grants regeneration"))
                .set(attr -> attr.setRequiredLevel(10))
                .set(attr -> attr.setPointCost(5))
                .set(attr -> attr.setStatsBonus(statsBuilder.build()));
    }
}

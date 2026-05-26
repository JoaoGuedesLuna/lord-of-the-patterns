package dev.guedes.lordofthepatterns.creational.builder.functional.director;

import dev.guedes.lordofthepatterns.common.attribute.enums.AttributeCategory;
import dev.guedes.lordofthepatterns.creational.builder.classic.builder.StatsBuilder;
import dev.guedes.lordofthepatterns.creational.builder.classic.builder.StatsBuilderImpl;
import dev.guedes.lordofthepatterns.creational.builder.functional.builder.AttributeBuilder;

/**
 * Builder Pattern - Functional Director
 *
 * <p>
 * The Builder pattern separates object construction from representation,
 * allowing reusable and maintainable construction logic.
 * </p>
 *
 * <p>
 * This Director creates predefined resilience-oriented attribute
 * progressions using the Functional Builder approach.
 * </p>
 *
 * <h2>When to Use</h2>
 * <ul>
 *     <li>When predefined defensive attribute configurations are required.</li>
 *     <li>When progression systems need centralized construction logic.</li>
 *     <li>When using reusable attribute recipes.</li>
 * </ul>
 *
 * <h2>When Not to Use</h2>
 * <ul>
 *     <li>When object creation is straightforward.</li>
 *     <li>When reusable construction logic is unnecessary.</li>
 * </ul>
 *
 * <h2>Advantages</h2>
 * <ul>
 *     <li>Centralizes defensive attribute construction logic.</li>
 *     <li>Improves consistency of progression systems.</li>
 *     <li>Promotes reuse of predefined configurations.</li>
 * </ul>
 *
 * <h2>Disadvantages</h2>
 * <ul>
 *     <li>Introduces additional complexity.</li>
 *     <li>May create excessive abstraction for small projects.</li>
 * </ul>
 *
 * @author João Guedes
 */
public class ResilienceAttributeDirector {
    private final StatsBuilder statsBuilder = new StatsBuilderImpl();

    public void constructResilienceTier1(AttributeBuilder builder) {
        statsBuilder.reset();
        statsBuilder.defense(2);

        builder.reset()
                .set(attr -> attr.setName("Sturdy Defense"))
                .set(attr -> attr.setCategory(AttributeCategory.RESILIENCE))
                .set(attr -> attr.setDescription("Increases defense by 2 points"))
                .set(attr -> attr.setRequiredLevel(1))
                .set(attr -> attr.setPointCost(1))
                .set(attr -> attr.setStatsBonus(statsBuilder.build()));
    }

    public void constructResilienceTier2(AttributeBuilder builder) {
        statsBuilder.reset();
        statsBuilder.hp(10);
        statsBuilder.defense(4);

        builder.reset()
                .set(attr -> attr.setName("Iron Skin"))
                .set(attr -> attr.setCategory(AttributeCategory.RESILIENCE))
                .set(attr -> attr.setDescription("Increases defense by 4 points and reduces physical damage"))
                .set(attr -> attr.setRequiredLevel(3))
                .set(attr -> attr.setPointCost(2))
                .set(attr -> attr.setStatsBonus(statsBuilder.build()));
    }

    public void constructResilienceTier3(AttributeBuilder builder) {
        statsBuilder.reset();
        statsBuilder.hp(20);
        statsBuilder.mp(10);
        statsBuilder.defense(6);

        builder.reset()
                .set(attr -> attr.setName("Adamant Will"))
                .set(attr -> attr.setCategory(AttributeCategory.RESILIENCE))
                .set(attr -> attr.setDescription("Increases defense by 6 points and resistance to magical attacks"))
                .set(attr -> attr.setRequiredLevel(5))
                .set(attr -> attr.setPointCost(3))
                .set(attr -> attr.setStatsBonus(statsBuilder.build()));
    }

    public void constructResilienceTier4(AttributeBuilder builder) {
        statsBuilder.reset();
        statsBuilder.hp(30);
        statsBuilder.strength(2);
        statsBuilder.defense(8);

        builder.reset()
                .set(attr -> attr.setName("Dwarven Armor Mastery"))
                .set(attr -> attr.setCategory(AttributeCategory.RESILIENCE))
                .set(attr -> attr.setDescription("Expertise in heavy armor and damage mitigation"))
                .set(attr -> attr.setRequiredLevel(7))
                .set(attr -> attr.setPointCost(4))
                .set(attr -> attr.setStatsBonus(statsBuilder.build()));
    }

    public void constructResilienceTier5(AttributeBuilder builder) {
        statsBuilder.reset();
        statsBuilder.hp(40);
        statsBuilder.strength(3);
        statsBuilder.defense(10);

        builder.reset()
                .set(attr -> attr.setName("Unbreakable Guardian"))
                .set(attr -> attr.setCategory(AttributeCategory.RESILIENCE))
                .set(attr -> attr.setDescription("Ultimate resilience mastery - near invulnerability and damage reflection"))
                .set(attr -> attr.setRequiredLevel(10))
                .set(attr -> attr.setPointCost(5))
                .set(attr -> attr.setStatsBonus(statsBuilder.build()));
    }
}

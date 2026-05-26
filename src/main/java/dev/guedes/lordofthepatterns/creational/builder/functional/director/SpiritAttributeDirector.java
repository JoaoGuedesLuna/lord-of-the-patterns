package dev.guedes.lordofthepatterns.creational.builder.functional.director;

import dev.guedes.lordofthepatterns.common.attribute.enums.AttributeCategory;
import dev.guedes.lordofthepatterns.creational.builder.classic.builder.StatsBuilder;
import dev.guedes.lordofthepatterns.creational.builder.classic.builder.StatsBuilderImpl;
import dev.guedes.lordofthepatterns.creational.builder.functional.builder.AttributeBuilder;

/**
 * Builder Pattern - Functional Director
 *
 * <p>
 * The Builder pattern supports the creation of complex objects
 * while isolating construction logic from object representation.
 * </p>
 *
 * <p>
 * This Director coordinates the creation of predefined spiritual
 * and magical attribute progressions using the Functional Builder approach.
 * </p>
 *
 * <h2>When to Use</h2>
 * <ul>
 *     <li>When reusable magical attribute configurations are required.</li>
 *     <li>When progression systems benefit from centralized construction logic.</li>
 *     <li>When using tier-based attribute systems.</li>
 * </ul>
 *
 * <h2>When Not to Use</h2>
 * <ul>
 *     <li>When direct object creation is sufficient.</li>
 *     <li>When predefined configurations add unnecessary complexity.</li>
 * </ul>
 *
 * <h2>Advantages</h2>
 * <ul>
 *     <li>Encapsulates magical attribute progression logic.</li>
 *     <li>Improves maintainability and consistency.</li>
 *     <li>Promotes reuse of predefined configurations.</li>
 * </ul>
 *
 * <h2>Disadvantages</h2>
 * <ul>
 *     <li>Introduces additional abstraction layers.</li>
 *     <li>Can increase project complexity.</li>
 * </ul>
 *
 * @author João Guedes
 */
public class SpiritAttributeDirector {
    private final StatsBuilder statsBuilder = new StatsBuilderImpl();

    public void constructSpiritTier1(AttributeBuilder builder) {
        statsBuilder.reset();
        statsBuilder.mp(15);

        builder.reset()
                .set(attr -> attr.setName("Mana Well"))
                .set(attr -> attr.setCategory(AttributeCategory.SPIRIT))
                .set(attr -> attr.setDescription("Increases maximum mana by 15 points"))
                .set(attr -> attr.setRequiredLevel(1))
                .set(attr -> attr.setPointCost(1))
                .set(attr -> attr.setStatsBonus(statsBuilder.build()));
    }

    public void constructSpiritTier2(AttributeBuilder builder) {
        statsBuilder.reset();
        statsBuilder.mp(30);
        statsBuilder.strength(1);

        builder.reset()
                .set(attr -> attr.setName("Arcane Focus"))
                .set(attr -> attr.setCategory(AttributeCategory.SPIRIT))
                .set(attr -> attr.setDescription("Increases maximum mana by 30 points and spell power"))
                .set(attr -> attr.setRequiredLevel(3))
                .set(attr -> attr.setPointCost(2))
                .set(attr -> attr.setStatsBonus(statsBuilder.build()));
    }

    public void constructSpiritTier3(AttributeBuilder builder) {
        statsBuilder.reset();
        statsBuilder.mp(45);
        statsBuilder.strength(2);

        builder.reset()
                .set(attr -> attr.setName("Ethereal Connection"))
                .set(attr -> attr.setCategory(AttributeCategory.SPIRIT))
                .set(attr -> attr.setDescription("Increases maximum mana by 45 points and mana regeneration"))
                .set(attr -> attr.setRequiredLevel(5))
                .set(attr -> attr.setPointCost(3))
                .set(attr -> attr.setStatsBonus(statsBuilder.build()));
    }

    public void constructSpiritTier4(AttributeBuilder builder) {
        statsBuilder.reset();
        statsBuilder.mp(60);
        statsBuilder.strength(3);
        statsBuilder.defense(2);

        builder.reset()
                .set(attr -> attr.setName("Ancient Wisdom"))
                .set(attr -> attr.setCategory(AttributeCategory.SPIRIT))
                .set(attr -> attr.setDescription("Grants deep magical knowledge and enhanced spell casting"))
                .set(attr -> attr.setRequiredLevel(7))
                .set(attr -> attr.setPointCost(4))
                .set(attr -> attr.setStatsBonus(statsBuilder.build()));
    }

    public void constructSpiritTier5(AttributeBuilder builder) {
        statsBuilder.reset();
        statsBuilder.mp(80);
        statsBuilder.strength(5);
        statsBuilder.defense(3);

        builder.reset()
                .set(attr -> attr.setName("Maiar's Essence"))
                .set(attr -> attr.setCategory(AttributeCategory.SPIRIT))
                .set(attr -> attr.setDescription("Ultimate spiritual mastery - near limitless mana and powerful spells"))
                .set(attr -> attr.setRequiredLevel(10))
                .set(attr -> attr.setPointCost(5))
                .set(attr -> attr.setStatsBonus(statsBuilder.build()));
    }
}

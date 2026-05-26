package dev.guedes.lordofthepatterns.creational.builder.functional.director;

import dev.guedes.lordofthepatterns.common.attribute.enums.AttributeCategory;
import dev.guedes.lordofthepatterns.creational.builder.classic.builder.StatsBuilder;
import dev.guedes.lordofthepatterns.creational.builder.classic.builder.StatsBuilderImpl;
import dev.guedes.lordofthepatterns.creational.builder.functional.builder.AttributeBuilder;

/**
 * Builder Pattern - Functional Director
 *
 * <p>
 * The Builder pattern separates the construction of complex objects
 * from their representation, enabling reusable and organized creation logic.
 * </p>
 *
 * <p>
 * This Director coordinates the creation of predefined Finesse attribute
 * progressions using the Functional Builder approach.
 * </p>
 *
 * <h2>When to Use</h2>
 * <ul>
 *     <li>When predefined attribute progressions are required.</li>
 *     <li>When construction logic should remain centralized.</li>
 *     <li>When using functional builders for flexible configuration.</li>
 * </ul>
 *
 * <h2>When Not to Use</h2>
 * <ul>
 *     <li>When attributes are simple enough for direct instantiation.</li>
 *     <li>When centralized construction logic is unnecessary.</li>
 * </ul>
 *
 * <h2>Advantages</h2>
 * <ul>
 *     <li>Encapsulates predefined attribute recipes.</li>
 *     <li>Improves consistency in object creation.</li>
 *     <li>Separates configuration logic from business logic.</li>
 * </ul>
 *
 * <h2>Disadvantages</h2>
 * <ul>
 *     <li>Introduces additional abstraction layers.</li>
 *     <li>Can increase maintenance complexity in large systems.</li>
 * </ul>
 *
 * @author João Guedes
 */
public class FinesseAttributeDirector {
    private final StatsBuilder statsBuilder = new StatsBuilderImpl();

    public void constructFinesseTier1(AttributeBuilder builder) {
        statsBuilder.reset();
        statsBuilder.dexterity(3);

        builder.reset()
                .set(attr -> attr.setName("Nimble Fingers"))
                .set(attr -> attr.setCategory(AttributeCategory.FINESSE))
                .set(attr -> attr.setDescription("Increases dexterity by 3 points."))
                .set(attr -> attr.setRequiredLevel(1))
                .set(attr -> attr.setPointCost(1))
                .set(attr -> attr.setStatsBonus(statsBuilder.build()));
    }

    public void constructFinesseTier2(AttributeBuilder builder) {
        statsBuilder.reset();
        statsBuilder.dexterity(6);

        builder.reset()
                .set(attr -> attr.setName("Lightfooted"))
                .set(attr -> attr.setCategory(AttributeCategory.FINESSE))
                .set(attr -> attr.setDescription("Increases dexterity by 6 points and movement speed."))
                .set(attr -> attr.setRequiredLevel(3))
                .set(attr -> attr.setPointCost(2))
                .set(attr -> attr.setStatsBonus(statsBuilder.build()));
    }

    public void constructFinesseTier3(AttributeBuilder builder) {
        statsBuilder.reset();
        statsBuilder.dexterity(9);
        statsBuilder.defense(2);

        builder.reset()
                .set(attr -> attr.setName("Shadow Walker"))
                .set(attr -> attr.setCategory(AttributeCategory.FINESSE))
                .set(attr -> attr.setDescription("Increases dexterity by 9 points and stealth capabilities"))
                .set(attr -> attr.setRequiredLevel(5))
                .set(attr -> attr.setPointCost(3))
                .set(attr -> attr.setStatsBonus(statsBuilder.build()));
    }

    public void constructFinesseTier4(AttributeBuilder builder) {
        statsBuilder.reset();
        statsBuilder.strength(2);
        statsBuilder.dexterity(12);
        statsBuilder.defense(3);

        builder.reset()
                .set(attr -> attr.setName("Elven Grace"))
                .set(attr -> attr.setCategory(AttributeCategory.FINESSE))
                .set(attr -> attr.setDescription("Exceptional agility and precision in combat"))
                .set(attr -> attr.setRequiredLevel(7))
                .set(attr -> attr.setPointCost(4))
                .set(attr -> attr.setStatsBonus(statsBuilder.build()));
    }

    public void constructFinesseTier5(AttributeBuilder builder) {
        statsBuilder.reset();
        statsBuilder.strength(3);
        statsBuilder.dexterity(15);
        statsBuilder.defense(4);

        builder.reset()
                .set(attr -> attr.setName("Ring-bearer's Stealth"))
                .set(attr -> attr.setCategory(AttributeCategory.FINESSE))
                .set(attr -> attr.setDescription("Ultimate finesse mastery - near invisibility and perfect accuracy"))
                .set(attr -> attr.setRequiredLevel(10))
                .set(attr -> attr.setPointCost(5))
                .set(attr -> attr.setStatsBonus(statsBuilder.build()));
    }
}

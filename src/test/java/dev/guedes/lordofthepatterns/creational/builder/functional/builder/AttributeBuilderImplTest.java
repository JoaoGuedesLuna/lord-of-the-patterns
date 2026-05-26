package dev.guedes.lordofthepatterns.creational.builder.functional.builder;

import dev.guedes.lordofthepatterns.common.attribute.Attribute;
import dev.guedes.lordofthepatterns.common.attribute.enums.AttributeCategory;
import dev.guedes.lordofthepatterns.creational.builder.classic.builder.StatsBuilder;
import dev.guedes.lordofthepatterns.creational.builder.classic.builder.StatsBuilderImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test class for {@link AttributeBuilderImpl}.
 *
 * @author João Guedes
 */
class AttributeBuilderImplTest {
    @Test
    void build_ShouldCreateAttributeWithConfiguredValues_WhenAttributesAreProvided() {
        StatsBuilder statsBuilder = new StatsBuilderImpl();
        AttributeBuilder builder = new AttributeBuilderImpl();

        statsBuilder.strength(3);
        statsBuilder.dexterity(15);
        statsBuilder.defense(4);

        Attribute attribute = builder
                .set(attr -> attr.setName("Ring-bearer's Stealth"))
                .set(attr -> attr.setCategory(AttributeCategory.FINESSE))
                .set(attr -> attr.setDescription("Ultimate finesse mastery - near invisibility and perfect accuracy"))
                .set(attr -> attr.setRequiredLevel(10))
                .set(attr -> attr.setPointCost(5))
                .set(attr -> attr.setStatsBonus(statsBuilder.build()))
                .set(attr -> attr.setUnlocked(true))
                .build();

        assertAll(
                () -> assertEquals("Ring-bearer's Stealth", attribute.getName()),
                () -> assertEquals(AttributeCategory.FINESSE, attribute.getCategory()),
                () -> assertEquals("Ultimate finesse mastery - near invisibility and perfect accuracy", attribute.getDescription()),
                () -> assertEquals(10, attribute.getRequiredLevel()),
                () -> assertEquals(5, attribute.getPointCost()),
                () -> assertEquals(3, attribute.getStatsBonus().getStrength()),
                () -> assertEquals(15, attribute.getStatsBonus().getDexterity()),
                () -> assertEquals(4, attribute.getStatsBonus().getDefense()),
                () -> assertTrue(attribute.isUnlocked())
        );
    }

    @Test
    void reset_ShouldClearPreviousConfiguration_WhenCalled() {
        StatsBuilder statsBuilder = new StatsBuilderImpl();
        AttributeBuilder builder = new AttributeBuilderImpl();

        statsBuilder.strength(3);
        statsBuilder.dexterity(15);
        statsBuilder.defense(4);

        Attribute attribute = builder
                .set(attr -> attr.setName("Ring-bearer's Stealth"))
                .set(attr -> attr.setCategory(AttributeCategory.FINESSE))
                .set(attr -> attr.setDescription("Ultimate finesse mastery - near invisibility and perfect accuracy"))
                .set(attr -> attr.setRequiredLevel(10))
                .set(attr -> attr.setPointCost(5))
                .set(attr -> attr.setStatsBonus(statsBuilder.build()))
                .reset()
                .build();

        assertAll(
                () -> assertNull(attribute.getName()),
                () -> assertNull(attribute.getCategory()),
                () -> assertNull(attribute.getDescription()),
                () -> assertEquals(1, attribute.getRequiredLevel()),
                () -> assertEquals(1, attribute.getPointCost()),
                () -> assertEquals(0, attribute.getStatsBonus().getStrength()),
                () -> assertEquals(0, attribute.getStatsBonus().getDexterity()),
                () -> assertEquals(0, attribute.getStatsBonus().getDefense()),
                () -> assertFalse(attribute.isUnlocked())
        );
    }
}

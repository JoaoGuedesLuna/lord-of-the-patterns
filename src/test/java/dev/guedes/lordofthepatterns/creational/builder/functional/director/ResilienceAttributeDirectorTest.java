package dev.guedes.lordofthepatterns.creational.builder.functional.director;

import dev.guedes.lordofthepatterns.common.attribute.Attribute;
import dev.guedes.lordofthepatterns.common.attribute.enums.AttributeCategory;
import dev.guedes.lordofthepatterns.creational.builder.functional.builder.AttributeBuilder;
import dev.guedes.lordofthepatterns.creational.builder.functional.builder.AttributeBuilderImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link ResilienceAttributeDirector}.
 *
 * @author João Guedes
 */
class ResilienceAttributeDirectorTest {
    @Test
    void constructResilienceTier1_ShouldBuildCorrectAttribute_WhenDirectorConstructsObject() {
        ResilienceAttributeDirector director = new ResilienceAttributeDirector();
        AttributeBuilder builder = new AttributeBuilderImpl();

        director.constructResilienceTier1(builder);
        Attribute attribute = builder.build();

        assertAll(
                () -> assertEquals("Sturdy Defense", attribute.getName()),
                () -> assertEquals(AttributeCategory.RESILIENCE, attribute.getCategory()),
                () -> assertEquals("Increases defense by 2 points", attribute.getDescription()),
                () -> assertEquals(1, attribute.getRequiredLevel()),
                () -> assertEquals(1, attribute.getPointCost()),
                () -> assertEquals(2, attribute.getDefenseBonus())
        );
    }

    @Test
    void constructResilienceTier2_ShouldBuildCorrectAttribute_WhenDirectorConstructsObject() {
        ResilienceAttributeDirector director = new ResilienceAttributeDirector();
        AttributeBuilder builder = new AttributeBuilderImpl();

        director.constructResilienceTier2(builder);
        Attribute attribute = builder.build();

        assertAll(
                () -> assertEquals("Iron Skin", attribute.getName()),
                () -> assertEquals("Increases defense by 4 points and reduces physical damage", attribute.getDescription()),
                () -> assertEquals(3, attribute.getRequiredLevel()),
                () -> assertEquals(2, attribute.getPointCost()),
                () -> assertEquals(10, attribute.getHpBonus()),
                () -> assertEquals(4, attribute.getDefenseBonus())
        );
    }

    @Test
    void constructResilienceTier3_ShouldBuildCorrectAttribute_WhenDirectorConstructsObject() {
        ResilienceAttributeDirector director = new ResilienceAttributeDirector();
        AttributeBuilder builder = new AttributeBuilderImpl();

        director.constructResilienceTier3(builder);
        Attribute attribute = builder.build();

        assertAll(
                () -> assertEquals("Adamant Will", attribute.getName()),
                () -> assertEquals("Increases defense by 6 points and resistance to magical attacks", attribute.getDescription()),
                () -> assertEquals(5, attribute.getRequiredLevel()),
                () -> assertEquals(3, attribute.getPointCost()),
                () -> assertEquals(20, attribute.getHpBonus()),
                () -> assertEquals(10, attribute.getMpBonus()),
                () -> assertEquals(6, attribute.getDefenseBonus())
        );
    }

    @Test
    void constructResilienceTier4_ShouldBuildCorrectAttribute_WhenDirectorConstructsObject() {
        ResilienceAttributeDirector director = new ResilienceAttributeDirector();
        AttributeBuilder builder = new AttributeBuilderImpl();

        director.constructResilienceTier4(builder);
        Attribute attribute = builder.build();

        assertAll(
                () -> assertEquals("Dwarven Armor Mastery", attribute.getName()),
                () -> assertEquals("Expertise in heavy armor and damage mitigation", attribute.getDescription()),
                () -> assertEquals(7, attribute.getRequiredLevel()),
                () -> assertEquals(4, attribute.getPointCost()),
                () -> assertEquals(30, attribute.getHpBonus()),
                () -> assertEquals(2, attribute.getStrengthBonus()),
                () -> assertEquals(8, attribute.getDefenseBonus())
        );
    }

    @Test
    void constructResilienceTier5_ShouldBuildCorrectAttribute_WhenDirectorConstructsObject() {
        ResilienceAttributeDirector director = new ResilienceAttributeDirector();
        AttributeBuilder builder = new AttributeBuilderImpl();

        director.constructResilienceTier5(builder);
        Attribute attribute = builder.build();

        assertAll(
                () -> assertEquals("Unbreakable Guardian", attribute.getName()),
                () -> assertEquals("Ultimate resilience mastery - near invulnerability and damage reflection", attribute.getDescription()),
                () -> assertEquals(10, attribute.getRequiredLevel()),
                () -> assertEquals(5, attribute.getPointCost()),
                () -> assertEquals(40, attribute.getHpBonus()),
                () -> assertEquals(3, attribute.getStrengthBonus()),
                () -> assertEquals(10, attribute.getDefenseBonus())
        );
    }
}

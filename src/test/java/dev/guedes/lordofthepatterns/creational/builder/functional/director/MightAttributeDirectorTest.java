package dev.guedes.lordofthepatterns.creational.builder.functional.director;

import dev.guedes.lordofthepatterns.common.attribute.Attribute;
import dev.guedes.lordofthepatterns.common.attribute.enums.AttributeCategory;
import dev.guedes.lordofthepatterns.creational.builder.functional.builder.AttributeBuilder;
import dev.guedes.lordofthepatterns.creational.builder.functional.builder.AttributeBuilderImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link MightAttributeDirector}.
 *
 * @author João Guedes
 */
class MightAttributeDirectorTest {
    @Test
    void constructMightTier1_ShouldBuildCorrectAttribute_WhenDirectorConstructsObject() {
        MightAttributeDirector director = new MightAttributeDirector();
        AttributeBuilder builder = new AttributeBuilderImpl();

        director.constructMightTier1(builder);
        Attribute attribute = builder.build();

        assertAll(
                () -> assertEquals("Brute Force", attribute.getName()),
                () -> assertEquals(AttributeCategory.MIGHT, attribute.getCategory()),
                () -> assertEquals("Increases physical strength by 3 points", attribute.getDescription()),
                () -> assertEquals(1, attribute.getRequiredLevel()),
                () -> assertEquals(1, attribute.getPointCost()),
                () -> assertEquals(3, attribute.getStrengthBonus())
        );
    }

    @Test
    void constructMightTier2_ShouldBuildCorrectAttribute_WhenDirectorConstructsObject() {
        MightAttributeDirector director = new MightAttributeDirector();
        AttributeBuilder builder = new AttributeBuilderImpl();

        director.constructMightTier2(builder);
        Attribute attribute = builder.build();

        assertAll(
                () -> assertEquals("Power Strike", attribute.getName()),
                () -> assertEquals("Increases strength by 6 points and critical hit chance", attribute.getDescription()),
                () -> assertEquals(3, attribute.getRequiredLevel()),
                () -> assertEquals(2, attribute.getPointCost()),
                () -> assertEquals(6, attribute.getStrengthBonus()),
                () -> assertEquals(1, attribute.getDexterityBonus())
        );
    }

    @Test
    void constructMightTier3_ShouldBuildCorrectAttribute_WhenDirectorConstructsObject() {
        MightAttributeDirector director = new MightAttributeDirector();
        AttributeBuilder builder = new AttributeBuilderImpl();

        director.constructMightTier3(builder);
        Attribute attribute = builder.build();

        assertAll(
                () -> assertEquals("Titan's Grip", attribute.getName()),
                () -> assertEquals("Increases strength by 9 points and allows wielding two-handed weapons with one hand", attribute.getDescription()),
                () -> assertEquals(5, attribute.getRequiredLevel()),
                () -> assertEquals(3, attribute.getPointCost()),
                () -> assertEquals(9, attribute.getStrengthBonus()),
                () -> assertEquals(2, attribute.getDexterityBonus())
        );
    }

    @Test
    void constructMightTier4_ShouldBuildCorrectAttribute_WhenDirectorConstructsObject() {
        MightAttributeDirector director = new MightAttributeDirector();
        AttributeBuilder builder = new AttributeBuilderImpl();

        director.constructMightTier4(builder);
        Attribute attribute = builder.build();

        assertAll(
                () -> assertEquals("Berserker Rage", attribute.getName()),
                () -> assertEquals("Massive strength boost and temporary damage immunity when enraged", attribute.getDescription()),
                () -> assertEquals(7, attribute.getRequiredLevel()),
                () -> assertEquals(4, attribute.getPointCost()),
                () -> assertEquals(20, attribute.getHpBonus()),
                () -> assertEquals(12, attribute.getStrengthBonus()),
                () -> assertEquals(2, attribute.getDefenseBonus())
        );
    }

    @Test
    void constructMightTier5_ShouldBuildCorrectAttribute_WhenDirectorConstructsObject() {
        MightAttributeDirector director = new MightAttributeDirector();
        AttributeBuilder builder = new AttributeBuilderImpl();

        director.constructMightTier5(builder);
        Attribute attribute = builder.build();

        assertAll(
                () -> assertEquals("Balrog's Fury", attribute.getName()),
                () -> assertEquals("Ultimate might mastery - devastating attacks and area damage", attribute.getDescription()),
                () -> assertEquals(10, attribute.getRequiredLevel()),
                () -> assertEquals(5, attribute.getPointCost()),
                () -> assertEquals(30, attribute.getHpBonus()),
                () -> assertEquals(15, attribute.getStrengthBonus()),
                () -> assertEquals(3, attribute.getDefenseBonus())
        );
    }
}

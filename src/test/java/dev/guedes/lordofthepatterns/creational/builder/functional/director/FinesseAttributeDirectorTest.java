package dev.guedes.lordofthepatterns.creational.builder.functional.director;

import dev.guedes.lordofthepatterns.common.attribute.Attribute;
import dev.guedes.lordofthepatterns.common.attribute.enums.AttributeCategory;
import dev.guedes.lordofthepatterns.creational.builder.functional.builder.AttributeBuilder;
import dev.guedes.lordofthepatterns.creational.builder.functional.builder.AttributeBuilderImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link FinesseAttributeDirector}.
 *
 * @author João Guedes
 */
class FinesseAttributeDirectorTest {
    @Test
    void constructFinesseTier1_ShouldBuildCorrectAttribute_WhenDirectorConstructsObject() {
        FinesseAttributeDirector director = new FinesseAttributeDirector();
        AttributeBuilder builder = new AttributeBuilderImpl();

        director.constructFinesseTier1(builder);
        Attribute attribute = builder.build();

        assertAll(
                () -> assertEquals("Nimble Fingers", attribute.getName()),
                () -> assertEquals(AttributeCategory.FINESSE, attribute.getCategory()),
                () -> assertEquals("Increases dexterity by 3 points.", attribute.getDescription()),
                () -> assertEquals(1, attribute.getRequiredLevel()),
                () -> assertEquals(1, attribute.getPointCost()),
                () -> assertEquals(3, attribute.getDexterityBonus())
        );
    }

    @Test
    void constructFinesseTier2_ShouldBuildCorrectAttribute_WhenDirectorConstructsObject() {
        FinesseAttributeDirector director = new FinesseAttributeDirector();
        AttributeBuilder builder = new AttributeBuilderImpl();

        director.constructFinesseTier2(builder);
        Attribute attribute = builder.build();

        assertAll(
                () -> assertEquals("Lightfooted", attribute.getName()),
                () -> assertEquals(AttributeCategory.FINESSE, attribute.getCategory()),
                () -> assertEquals("Increases dexterity by 6 points and movement speed.", attribute.getDescription()),
                () -> assertEquals(3, attribute.getRequiredLevel()),
                () -> assertEquals(2, attribute.getPointCost()),
                () -> assertEquals(6, attribute.getDexterityBonus())
        );
    }

    @Test
    void constructFinesseTier3_ShouldBuildCorrectAttribute_WhenDirectorConstructsObject() {
        FinesseAttributeDirector director = new FinesseAttributeDirector();
        AttributeBuilder builder = new AttributeBuilderImpl();

        director.constructFinesseTier3(builder);
        Attribute attribute = builder.build();

        assertAll(
                () -> assertEquals("Shadow Walker", attribute.getName()),
                () -> assertEquals(AttributeCategory.FINESSE, attribute.getCategory()),
                () -> assertEquals("Increases dexterity by 9 points and stealth capabilities", attribute.getDescription()),
                () -> assertEquals(5, attribute.getRequiredLevel()),
                () -> assertEquals(3, attribute.getPointCost()),
                () -> assertEquals(9, attribute.getDexterityBonus()),
                () -> assertEquals(2, attribute.getDefenseBonus())
        );
    }

    @Test
    void constructFinesseTier4_ShouldBuildCorrectAttribute_WhenDirectorConstructsObject() {
        FinesseAttributeDirector director = new FinesseAttributeDirector();
        AttributeBuilder builder = new AttributeBuilderImpl();

        director.constructFinesseTier4(builder);
        Attribute attribute = builder.build();

        assertAll(
                () -> assertEquals("Elven Grace", attribute.getName()),
                () -> assertEquals(AttributeCategory.FINESSE, attribute.getCategory()),
                () -> assertEquals("Exceptional agility and precision in combat", attribute.getDescription()),
                () -> assertEquals(7, attribute.getRequiredLevel()),
                () -> assertEquals(4, attribute.getPointCost()),
                () -> assertEquals(2, attribute.getStrengthBonus()),
                () -> assertEquals(12, attribute.getDexterityBonus()),
                () -> assertEquals(3, attribute.getDefenseBonus())
        );
    }

    @Test
    void constructFinesseTier5_ShouldBuildCorrectAttribute_WhenDirectorConstructsObject() {
        FinesseAttributeDirector director = new FinesseAttributeDirector();
        AttributeBuilder builder = new AttributeBuilderImpl();

        director.constructFinesseTier5(builder);
        Attribute attribute = builder.build();

        assertAll(
                () -> assertEquals("Ring-bearer's Stealth", attribute.getName()),
                () -> assertEquals(AttributeCategory.FINESSE, attribute.getCategory()),
                () -> assertEquals("Ultimate finesse mastery - near invisibility and perfect accuracy", attribute.getDescription()),
                () -> assertEquals(10, attribute.getRequiredLevel()),
                () -> assertEquals(5, attribute.getPointCost()),
                () -> assertEquals(3, attribute.getStrengthBonus()),
                () -> assertEquals(15, attribute.getDexterityBonus()),
                () -> assertEquals(4, attribute.getDefenseBonus())
        );
    }
}

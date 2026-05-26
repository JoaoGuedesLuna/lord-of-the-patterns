package dev.guedes.lordofthepatterns.creational.builder.functional.director;

import dev.guedes.lordofthepatterns.common.attribute.Attribute;
import dev.guedes.lordofthepatterns.common.attribute.enums.AttributeCategory;
import dev.guedes.lordofthepatterns.creational.builder.functional.builder.AttributeBuilder;
import dev.guedes.lordofthepatterns.creational.builder.functional.builder.AttributeBuilderImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link SpiritAttributeDirector}.
 *
 * @author João Guedes
 */
class SpiritAttributeDirectorTest {
    @Test
    void constructSpiritTier1_ShouldBuildCorrectAttribute_WhenDirectorConstructsObject() {
        SpiritAttributeDirector director = new SpiritAttributeDirector();
        AttributeBuilder builder = new AttributeBuilderImpl();

        director.constructSpiritTier1(builder);
        Attribute attribute = builder.build();

        assertAll(
                () -> assertEquals("Mana Well", attribute.getName()),
                () -> assertEquals(AttributeCategory.SPIRIT, attribute.getCategory()),
                () -> assertEquals("Increases maximum mana by 15 points", attribute.getDescription()),
                () -> assertEquals(1, attribute.getRequiredLevel()),
                () -> assertEquals(1, attribute.getPointCost()),
                () -> assertEquals(15, attribute.getMpBonus())
        );
    }

    @Test
    void constructSpiritTier2_ShouldBuildCorrectAttribute_WhenDirectorConstructsObject() {
        SpiritAttributeDirector director = new SpiritAttributeDirector();
        AttributeBuilder builder = new AttributeBuilderImpl();

        director.constructSpiritTier2(builder);
        Attribute attribute = builder.build();

        assertAll(
                () -> assertEquals("Arcane Focus", attribute.getName()),
                () -> assertEquals("Increases maximum mana by 30 points and spell power", attribute.getDescription()),
                () -> assertEquals(3, attribute.getRequiredLevel()),
                () -> assertEquals(2, attribute.getPointCost()),
                () -> assertEquals(30, attribute.getMpBonus()),
                () -> assertEquals(1, attribute.getStrengthBonus())
        );
    }

    @Test
    void constructSpiritTier3_ShouldBuildCorrectAttribute_WhenDirectorConstructsObject() {
        SpiritAttributeDirector director = new SpiritAttributeDirector();
        AttributeBuilder builder = new AttributeBuilderImpl();

        director.constructSpiritTier3(builder);
        Attribute attribute = builder.build();

        assertAll(
                () -> assertEquals("Ethereal Connection", attribute.getName()),
                () -> assertEquals("Increases maximum mana by 45 points and mana regeneration", attribute.getDescription()),
                () -> assertEquals(5, attribute.getRequiredLevel()),
                () -> assertEquals(3, attribute.getPointCost()),
                () -> assertEquals(45, attribute.getMpBonus()),
                () -> assertEquals(2, attribute.getStrengthBonus())
        );
    }

    @Test
    void constructSpiritTier4_ShouldBuildCorrectAttribute_WhenDirectorConstructsObject() {
        SpiritAttributeDirector director = new SpiritAttributeDirector();
        AttributeBuilder builder = new AttributeBuilderImpl();

        director.constructSpiritTier4(builder);
        Attribute attribute = builder.build();

        assertAll(
                () -> assertEquals("Ancient Wisdom", attribute.getName()),
                () -> assertEquals("Grants deep magical knowledge and enhanced spell casting", attribute.getDescription()),
                () -> assertEquals(7, attribute.getRequiredLevel()),
                () -> assertEquals(4, attribute.getPointCost()),
                () -> assertEquals(60, attribute.getMpBonus()),
                () -> assertEquals(3, attribute.getStrengthBonus()),
                () -> assertEquals(2, attribute.getDefenseBonus())
        );
    }

    @Test
    void constructSpiritTier5_ShouldBuildCorrectAttribute_WhenDirectorConstructsObject() {
        SpiritAttributeDirector director = new SpiritAttributeDirector();
        AttributeBuilder builder = new AttributeBuilderImpl();

        director.constructSpiritTier5(builder);
        Attribute attribute = builder.build();

        assertAll(
                () -> assertEquals("Maiar's Essence", attribute.getName()),
                () -> assertEquals("Ultimate spiritual mastery - near limitless mana and powerful spells", attribute.getDescription()),
                () -> assertEquals(10, attribute.getRequiredLevel()),
                () -> assertEquals(5, attribute.getPointCost()),
                () -> assertEquals(80, attribute.getMpBonus()),
                () -> assertEquals(5, attribute.getStrengthBonus()),
                () -> assertEquals(3, attribute.getDefenseBonus())
        );
    }
}

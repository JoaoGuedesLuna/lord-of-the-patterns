package dev.guedes.lordofthepatterns.creational.builder.functional.director;

import dev.guedes.lordofthepatterns.common.attribute.Attribute;
import dev.guedes.lordofthepatterns.common.attribute.enums.AttributeCategory;
import dev.guedes.lordofthepatterns.creational.builder.functional.builder.AttributeBuilder;
import dev.guedes.lordofthepatterns.creational.builder.functional.builder.AttributeBuilderImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link VitalityAttributeDirector}.
 *
 * @author João Guedes
 */
class VitalityAttributeDirectorTest {
    @Test
    void constructVitalityTier1_ShouldBuildCorrectAttribute_WhenDirectorConstructsObject() {
        VitalityAttributeDirector director = new VitalityAttributeDirector();
        AttributeBuilder builder = new AttributeBuilderImpl();

        director.constructVitalityTier1(builder);
        Attribute attribute = builder.build();

        assertAll(
                () -> assertEquals("Robust Health", attribute.getName()),
                () -> assertEquals(AttributeCategory.VITALITY, attribute.getCategory()),
                () -> assertEquals("Increases maximum health by 20 points", attribute.getDescription()),
                () -> assertEquals(1, attribute.getRequiredLevel()),
                () -> assertEquals(1, attribute.getPointCost()),
                () -> assertEquals(20, attribute.getHpBonus())
        );
    }

    @Test
    void constructVitalityTier2_ShouldBuildCorrectAttribute_WhenDirectorConstructsObject() {
        VitalityAttributeDirector director = new VitalityAttributeDirector();
        AttributeBuilder builder = new AttributeBuilderImpl();

        director.constructVitalityTier2(builder);
        Attribute attribute = builder.build();

        assertAll(
                () -> assertEquals("Enduring Constitution", attribute.getName()),
                () -> assertEquals(AttributeCategory.VITALITY, attribute.getCategory()),
                () -> assertEquals("Increases maximum health by 40 points and defense by 2", attribute.getDescription()),
                () -> assertEquals(3, attribute.getRequiredLevel()),
                () -> assertEquals(2, attribute.getPointCost()),
                () -> assertEquals(40, attribute.getHpBonus()),
                () -> assertEquals(2, attribute.getDefenseBonus())
        );
    }

    @Test
    void constructVitalityTier3_ShouldBuildCorrectAttribute_WhenDirectorConstructsObject() {
        VitalityAttributeDirector director = new VitalityAttributeDirector();
        AttributeBuilder builder = new AttributeBuilderImpl();

        director.constructVitalityTier3(builder);
        Attribute attribute = builder.build();

        assertAll(
                () -> assertEquals("Unbreakable Will", attribute.getName()),
                () -> assertEquals(AttributeCategory.VITALITY, attribute.getCategory()),
                () -> assertEquals("Increases maximum health by 60 points and provides resistance to status effects", attribute.getDescription()),
                () -> assertEquals(5, attribute.getRequiredLevel()),
                () -> assertEquals(3, attribute.getPointCost()),
                () -> assertEquals(60, attribute.getHpBonus()),
                () -> assertEquals(3, attribute.getDefenseBonus())
        );
    }

    @Test
    void constructVitalityTier4_ShouldBuildCorrectAttribute_WhenDirectorConstructsObject() {
        VitalityAttributeDirector director = new VitalityAttributeDirector();
        AttributeBuilder builder = new AttributeBuilderImpl();

        director.constructVitalityTier4(builder);
        Attribute attribute = builder.build();

        assertAll(
                () -> assertEquals("Dwarven Fortitude", attribute.getName()),
                () -> assertEquals(AttributeCategory.VITALITY, attribute.getCategory()),
                () -> assertEquals("Grants massive health boost and damage reduction", attribute.getDescription()),
                () -> assertEquals(7, attribute.getRequiredLevel()),
                () -> assertEquals(4, attribute.getPointCost()),
                () -> assertEquals(80, attribute.getHpBonus()),
                () -> assertEquals(5, attribute.getDefenseBonus())
        );
    }

    @Test
    void constructVitalityTier5_ShouldBuildCorrectAttribute_WhenDirectorConstructsObject() {
        VitalityAttributeDirector director = new VitalityAttributeDirector();
        AttributeBuilder builder = new AttributeBuilderImpl();

        director.constructVitalityTier5(builder);
        Attribute attribute = builder.build();

        assertAll(
                () -> assertEquals("Ent's Vitality", attribute.getName()),
                () -> assertEquals(AttributeCategory.VITALITY, attribute.getCategory()),
                () -> assertEquals("Ultimate health mastery - doubles base health and grants regeneration", attribute.getDescription()),
                () -> assertEquals(10, attribute.getRequiredLevel()),
                () -> assertEquals(5, attribute.getPointCost()),
                () -> assertEquals(100, attribute.getHpBonus()),
                () -> assertEquals(8, attribute.getDefenseBonus())
        );
    }
}

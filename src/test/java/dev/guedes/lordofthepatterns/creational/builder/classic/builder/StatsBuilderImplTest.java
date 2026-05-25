package dev.guedes.lordofthepatterns.creational.builder.classic.builder;

import dev.guedes.lordofthepatterns.common.stats.Stats;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link StatsBuilderImpl}.
 *
 * @author João Guedes
 */
class StatsBuilderImplTest {
    @Test
    void build_ShouldCreateStatsWithConfiguredValues_WhenAttributesAreProvided() {
        StatsBuilder builder = new StatsBuilderImpl();

        builder.hp(100);
        builder.mp(50);
        builder.strength(20);
        builder.dexterity(15);
        builder.defense(10);

        Stats stats = builder.build();

        assertAll(
                () -> assertEquals(100, stats.getHp()),
                () -> assertEquals(50, stats.getMp()),
                () -> assertEquals(20, stats.getStrength()),
                () -> assertEquals(15, stats.getDexterity()),
                () -> assertEquals(10, stats.getDefense())
        );
    }

    @Test
    void reset_ShouldClearPreviousConfiguration_WhenCalled() {
        StatsBuilder builder = new StatsBuilderImpl();

        builder.hp(100);
        builder.mp(50);
        builder.strength(20);
        builder.dexterity(15);
        builder.defense(10);
        builder.reset();

        Stats stats = builder.build();

        assertAll(
                () -> assertEquals(0, stats.getHp()),
                () -> assertEquals(0, stats.getStrength()),
                () -> assertEquals(0, stats.getMp()),
                () -> assertEquals(0, stats.getDexterity()),
                () -> assertEquals(0, stats.getDefense())
        );
    }
}

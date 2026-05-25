package dev.guedes.lordofthepatterns.creational.builder.classic.director;

import dev.guedes.lordofthepatterns.common.stats.Stats;
import dev.guedes.lordofthepatterns.creational.builder.classic.builder.StatsBuilder;
import dev.guedes.lordofthepatterns.creational.builder.classic.builder.StatsBuilderImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link RelicStatsDirector}.
 *
 * @author João Guedes
 */
class RelicStatsDirectorTest {
    @Test
    void constructOneRingStats_ShouldBuildCorrectStats_WhenDirectorConstructsObject() {
        RelicStatsDirector director = new RelicStatsDirector();
        StatsBuilder builder = new StatsBuilderImpl();

        director.constructOneRingStats(builder);
        Stats stats = builder.build();

        assertAll(
                () -> assertEquals(40, stats.getHp()),
                () -> assertEquals(120, stats.getMp()),
                () -> assertEquals(25, stats.getStrength()),
                () -> assertEquals(30, stats.getDexterity()),
                () -> assertEquals(20, stats.getDefense())
        );
    }

    @Test
    void constructAndurilStats_ShouldBuildCorrectStats_WhenDirectorConstructsObject() {
        RelicStatsDirector director = new RelicStatsDirector();
        StatsBuilder builder = new StatsBuilderImpl();

        director.constructAndurilStats(builder);
        Stats stats = builder.build();

        assertAll(
                () -> assertEquals(60, stats.getHp()),
                () -> assertEquals(20, stats.getMp()),
                () -> assertEquals(70, stats.getStrength()),
                () -> assertEquals(40, stats.getDexterity()),
                () -> assertEquals(35, stats.getDefense())
        );
    }

    @Test
    void constructGlamdringStats_ShouldBuildCorrectStats_WhenDirectorConstructsObject() {
        RelicStatsDirector director = new RelicStatsDirector();
        StatsBuilder builder = new StatsBuilderImpl();

        director.constructGlamdringStats(builder);
        Stats stats = builder.build();

        assertAll(
                () -> assertEquals(30, stats.getHp()),
                () -> assertEquals(80, stats.getMp()),
                () -> assertEquals(60, stats.getStrength()),
                () -> assertEquals(45, stats.getDexterity()),
                () -> assertEquals(25, stats.getDefense())
        );
    }

    @Test
    void constructBelthrondingStats_ShouldBuildCorrectStats_WhenDirectorConstructsObject() {
        RelicStatsDirector director = new RelicStatsDirector();
        StatsBuilder builder = new StatsBuilderImpl();

        director.constructBelthrondingStats(builder);
        Stats stats = builder.build();

        assertAll(
                () -> assertEquals(20, stats.getHp()),
                () -> assertEquals(25, stats.getMp()),
                () -> assertEquals(35, stats.getStrength()),
                () -> assertEquals(90, stats.getDexterity()),
                () -> assertEquals(15, stats.getDefense())
        );
    }

    @Test
    void constructDurinsAxeStats_ShouldBuildCorrectStats_WhenDirectorConstructsObject() {
        RelicStatsDirector director = new RelicStatsDirector();
        StatsBuilder builder = new StatsBuilderImpl();

        director.constructDurinsAxeStats(builder);
        Stats stats = builder.build();

        assertAll(
                () -> assertEquals(80, stats.getHp()),
                () -> assertEquals(10, stats.getMp()),
                () -> assertEquals(85, stats.getStrength()),
                () -> assertEquals(15, stats.getDexterity()),
                () -> assertEquals(60, stats.getDefense())
        );
    }
}

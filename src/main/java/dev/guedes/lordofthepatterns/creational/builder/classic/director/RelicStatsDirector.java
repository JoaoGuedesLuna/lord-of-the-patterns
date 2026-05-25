package dev.guedes.lordofthepatterns.creational.builder.classic.director;

import dev.guedes.lordofthepatterns.creational.builder.classic.builder.StatsBuilder;

/**
 * Builder Pattern - Classic Director
 *
 * <p>
 * The Builder pattern separates object construction from representation,
 * enabling reusable and organized construction processes.
 * </p>
 *
 * <p>
 * This Director coordinates the creation of predefined relic and weapon
 * statistics using the Classic Builder approach.
 * </p>
 *
 * <h2>When to Use</h2>
 * <ul>
 *     <li>When predefined object configurations are required.</li>
 *     <li>When construction logic should remain centralized.</li>
 *     <li>When object creation involves multiple ordered steps.</li>
 * </ul>
 *
 * <h2>When Not to Use</h2>
 * <ul>
 *     <li>When object creation is straightforward.</li>
 *     <li>When predefined construction recipes are unnecessary.</li>
 * </ul>
 *
 * <h2>Advantages</h2>
 * <ul>
 *     <li>Encapsulates predefined construction sequences.</li>
 *     <li>Promotes consistency in object creation.</li>
 *     <li>Separates creation logic from client code.</li>
 * </ul>
 *
 * <h2>Disadvantages</h2>
 * <ul>
 *     <li>Introduces additional abstraction layers.</li>
 *     <li>May increase complexity in small systems.</li>
 * </ul>
 *
 * @author João Guedes
 */
public class RelicStatsDirector {
    public void constructOneRingStats(StatsBuilder builder) {
        builder.reset();
        builder.hp(40);
        builder.mp(120);
        builder.strength(25);
        builder.dexterity(30);
        builder.defense(20);
    }

    public void constructAndurilStats(StatsBuilder builder) {
        builder.reset();
        builder.hp(60);
        builder.mp(20);
        builder.strength(70);
        builder.dexterity(40);
        builder.defense(35);
    }

    public void constructGlamdringStats(StatsBuilder builder) {
        builder.reset();
        builder.hp(30);
        builder.mp(80);
        builder.strength(60);
        builder.dexterity(45);
        builder.defense(25);
    }

    public void constructBelthrondingStats(StatsBuilder builder) {
        builder.reset();
        builder.hp(20);
        builder.mp(25);
        builder.strength(35);
        builder.dexterity(90);
        builder.defense(15);
    }

    public void constructDurinsAxeStats(StatsBuilder builder) {
        builder.reset();
        builder.hp(80);
        builder.mp(10);
        builder.strength(85);
        builder.dexterity(15);
        builder.defense(60);
    }
}

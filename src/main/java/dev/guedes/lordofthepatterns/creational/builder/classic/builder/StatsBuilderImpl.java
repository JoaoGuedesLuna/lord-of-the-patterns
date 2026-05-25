package dev.guedes.lordofthepatterns.creational.builder.classic.builder;

import dev.guedes.lordofthepatterns.common.stats.Stats;

/**
 * Builder Pattern - Classic Concrete Builder
 *
 * <p>
 * The Builder pattern separates the construction of complex objects
 * from their representation, allowing the same construction process
 * to create different object configurations.
 * </p>
 *
 * <p>
 * This concrete builder implements the {@link StatsBuilder} interface
 * and is responsible for step-by-step construction of {@link Stats}
 * objects.
 * </p>
 *
 * <h2>When to Use</h2>
 * <ul>
 *     <li>When objects require multiple configuration steps.</li>
 *     <li>When object construction logic should be reusable.</li>
 *     <li>When separating creation logic from business logic.</li>
 * </ul>
 *
 * <h2>When Not to Use</h2>
 * <ul>
 *     <li>When objects are simple enough for direct instantiation.</li>
 *     <li>When construction logic does not justify additional abstraction.</li>
 * </ul>
 *
 * <h2>Advantages</h2>
 * <ul>
 *     <li>Encapsulates object construction logic.</li>
 *     <li>Improves readability and maintainability.</li>
 *     <li>Supports reusable and consistent object creation.</li>
 * </ul>
 *
 * <h2>Disadvantages</h2>
 * <ul>
 *     <li>Introduces additional classes and complexity.</li>
 *     <li>May increase boilerplate code.</li>
 * </ul>
 *
 * @author João Guedes
 */
public class StatsBuilderImpl implements StatsBuilder {
    private Stats stats;

    public StatsBuilderImpl() { reset(); }

    @Override public void reset() { stats = new Stats(); }
    @Override public void hp(int hp) { stats.setHp(hp); }
    @Override public void mp(int mp) { stats.setMp(mp); }
    @Override public void strength(int strength) { stats.setStrength(strength); }
    @Override public void dexterity(int dexterity) { stats.setDexterity(dexterity); }
    @Override public void defense(int defense) { stats.setDefense(defense); }
    @Override public Stats build() { return stats; }
}

package dev.guedes.lordofthepatterns.creational.builder.classic.builder;

import dev.guedes.lordofthepatterns.common.stats.Stats;

/**
 * Builder Pattern - Classic Builder Interface
 *
 * <p>
 * The Builder pattern separates the construction of a complex object
 * from its representation, allowing the same construction process
 * to create different object configurations.
 * </p>
 *
 * <p>
 * This interface defines the steps required to construct a {@link Stats}
 * object. Concrete builders implement these steps and control how the
 * final object is assembled.
 * </p>
 *
 * <h2>When to Use</h2>
 * <ul>
 *     <li>When an object requires multiple construction steps.</li>
 *     <li>When object creation should be independent from its representation.</li>
 *     <li>When the same construction process can produce different configurations.</li>
 * </ul>
 *
 * <h2>When Not to Use</h2>
 * <ul>
 *     <li>When objects are simple and do not require complex construction.</li>
 *     <li>When constructors or factory methods are sufficient.</li>
 * </ul>
 *
 * <h2>Advantages</h2>
 * <ul>
 *     <li>Improves readability of object creation.</li>
 *     <li>Encapsulates complex construction logic.</li>
 *     <li>Supports step-by-step object configuration.</li>
 * </ul>
 *
 * <h2>Disadvantages</h2>
 * <ul>
 *     <li>Introduces additional classes and complexity.</li>
 *     <li>May be unnecessary for small objects.</li>
 * </ul>
 *
 * @author João Guedes
 */
public interface StatsBuilder {
    void reset();
    void hp(int hp);
    void mp(int mp);
    void strength(int strength);
    void dexterity(int dexterity);
    void defense(int defense);
    Stats build();
}

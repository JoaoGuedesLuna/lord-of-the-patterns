package dev.guedes.lordofthepatterns.creational.singleton.lazy;

import dev.guedes.lordofthepatterns.common.item.Weapon;
import dev.guedes.lordofthepatterns.common.item.enums.ItemRarity;
import dev.guedes.lordofthepatterns.common.item.enums.WeaponType;
import dev.guedes.lordofthepatterns.creational.builder.classic.builder.StatsBuilder;
import dev.guedes.lordofthepatterns.creational.builder.classic.builder.StatsBuilderImpl;
import dev.guedes.lordofthepatterns.creational.builder.classic.director.RelicStatsDirector;

/**
 * Singleton Pattern - Lazy Initialization Implementation
 *
 * <p>
 * The Singleton pattern restricts object creation to a single instance
 * and provides a global access point to it.
 * </p>
 *
 * <p>
 * The lazy initialization approach creates the singleton instance only
 * when it is first requested. This can improve memory usage and startup
 * performance when the object may not always be needed.
 * </p>
 *
 * <h2>When to Use</h2>
 * <ul>
 *     <li>When object creation is expensive.</li>
 *     <li>When the singleton instance may not always be used.</li>
 *     <li>When delayed initialization improves application performance.</li>
 * </ul>
 *
 * <h2>When Not to Use</h2>
 * <ul>
 *     <li>In multithreaded environments without proper synchronization.</li>
 *     <li>When thread safety is required.</li>
 * </ul>
 *
 * <h2>Advantages</h2>
 * <ul>
 *     <li>Instance is created only when needed.</li>
 *     <li>Reduces unnecessary memory usage.</li>
 *     <li>Simple and easy to understand.</li>
 * </ul>
 *
 * <h2>Disadvantages</h2>
 * <ul>
 *     <li>Not thread-safe.</li>
 *     <li>Multiple instances may be created concurrently in multithreaded scenarios.</li>
 * </ul>
 *
 * @author João Guedes
 */
public class Glamdring extends Weapon {
    private static Glamdring instance;

    public Glamdring() {
        RelicStatsDirector relicStatsDirector = new RelicStatsDirector();
        StatsBuilder statsBuilder = new StatsBuilderImpl();

        relicStatsDirector.constructGlamdringStats(statsBuilder);

        super("Glamdring", ItemRarity.LEGENDARY, WeaponType.SWORD, statsBuilder.build());
    }

    public static Glamdring getInstance() {
        if (instance == null) instance = new Glamdring();
        return instance;
    }
}

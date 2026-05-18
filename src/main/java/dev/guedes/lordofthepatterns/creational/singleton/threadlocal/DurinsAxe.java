package dev.guedes.lordofthepatterns.creational.singleton.threadlocal;

import dev.guedes.lordofthepatterns.common.item.Weapon;
import dev.guedes.lordofthepatterns.common.item.enums.ItemRarity;
import dev.guedes.lordofthepatterns.common.item.enums.WeaponType;

/**
 * Singleton Pattern - ThreadLocal Singleton
 *
 * <p>
 * The ThreadLocal Singleton pattern provides a unique singleton instance
 * per thread instead of a single global instance shared across the application.
 * </p>
 *
 * <p>
 * Each thread accessing the singleton receives its own independent instance,
 * avoiding concurrency issues without requiring synchronization.
 * </p>
 *
 * <h2>When to Use</h2>
 * <ul>
 *     <li>When each thread must maintain its own isolated state.</li>
 *     <li>When avoiding shared mutable state between threads.</li>
 *     <li>When working with thread-confined resources such as sessions or transactions.</li>
 * </ul>
 *
 * <h2>When Not to Use</h2>
 * <ul>
 *     <li>When a true globally shared singleton is required.</li>
 *     <li>When excessive thread-local objects may increase memory usage.</li>
 * </ul>
 *
 * <h2>Advantages</h2>
 * <ul>
 *     <li>Thread-safe without synchronization.</li>
 *     <li>Eliminates shared state conflicts.</li>
 *     <li>Provides thread isolation.</li>
 * </ul>
 *
 * <h2>Disadvantages</h2>
 * <ul>
 *     <li>Not a traditional singleton because multiple instances exist.</li>
 *     <li>Can increase memory consumption in highly concurrent systems.</li>
 * </ul>
 *
 * @author João Guedes
 */
public class DurinsAxe extends Weapon {
    private static final ThreadLocal<DurinsAxe> threadLocalInstance
            = ThreadLocal.withInitial(DurinsAxe::new);

    private DurinsAxe() {
        super("Durin's Axe", ItemRarity.LEGENDARY, WeaponType.AXE);
    }

    public static DurinsAxe getInstance() { return threadLocalInstance.get(); }
}

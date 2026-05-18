package dev.guedes.lordofthepatterns.creational.singleton.lazythreadsafe;

import dev.guedes.lordofthepatterns.common.item.Weapon;
import dev.guedes.lordofthepatterns.common.item.enums.ItemRarity;
import dev.guedes.lordofthepatterns.common.item.enums.WeaponType;

/**
 * Singleton Pattern - Thread-Safe Lazy Initialization
 *
 * <p>
 * The Singleton pattern ensures a single shared instance while providing
 * a centralized access point to it.
 * </p>
 *
 * <p>
 * This implementation uses double-checked locking with the {@code volatile}
 * keyword to provide thread-safe lazy initialization while minimizing
 * synchronization overhead.
 * </p>
 *
 * <h2>When to Use</h2>
 * <ul>
 *     <li>When lazy initialization is required in multithreaded applications.</li>
 *     <li>When thread safety is critical.</li>
 *     <li>When synchronization performance cost should be minimized.</li>
 * </ul>
 *
 * <h2>When Not to Use</h2>
 * <ul>
 *     <li>When the added complexity is unnecessary.</li>
 *     <li>When simpler alternatives such as Bill Pugh implementation are sufficient.</li>
 * </ul>
 *
 * <h2>Advantages</h2>
 * <ul>
 *     <li>Thread-safe.</li>
 *     <li>Supports lazy initialization.</li>
 *     <li>Reduces synchronization overhead.</li>
 * </ul>
 *
 * <h2>Disadvantages</h2>
 * <ul>
 *     <li>More complex implementation.</li>
 *     <li>Harder to maintain and understand compared to simpler approaches.</li>
 * </ul>
 *
 * @author João Guedes
 */
public class Belthronding extends Weapon {
    private static volatile Belthronding instance;

    public Belthronding() {
        super("Belthronding", ItemRarity.EPIC, WeaponType.BOW);
    }

    public static Belthronding getInstance() {
        if (instance == null) {
            synchronized (Belthronding.class) {
                if (instance == null) instance = new Belthronding();
            }
        }
        return instance;
    }
}

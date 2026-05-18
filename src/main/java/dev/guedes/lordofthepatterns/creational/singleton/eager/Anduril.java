package dev.guedes.lordofthepatterns.creational.singleton.eager;

import dev.guedes.lordofthepatterns.common.item.Weapon;
import dev.guedes.lordofthepatterns.common.item.enums.ItemRarity;
import dev.guedes.lordofthepatterns.common.item.enums.WeaponType;

/**
 * Singleton Pattern - Eager Initialization Implementation
 *
 * <p>
 * The Singleton pattern guarantees that only one instance of a class
 * exists during the application's lifecycle.
 * </p>
 *
 * <p>
 * In the eager initialization approach, the singleton instance is created
 * immediately when the class is loaded into memory.
 * This implementation is simple and inherently thread-safe because the JVM
 * handles class initialization safely.
 * </p>
 *
 * <h2>When to Use</h2>
 * <ul>
 *     <li>When the singleton instance is lightweight and always required.</li>
 *     <li>When simplicity is preferred over lazy loading.</li>
 *     <li>When thread safety is necessary without explicit synchronization.</li>
 * </ul>
 *
 * <h2>When Not to Use</h2>
 * <ul>
 *     <li>When the object creation is expensive and may never be used.</li>
 *     <li>When lazy initialization is important for performance or memory optimization.</li>
 * </ul>
 *
 * <h2>Advantages</h2>
 * <ul>
 *     <li>Simple implementation.</li>
 *     <li>Thread-safe by default.</li>
 *     <li>No synchronization overhead.</li>
 * </ul>
 *
 * <h2>Disadvantages</h2>
 * <ul>
 *     <li>The instance is created even if it is never used.</li>
 *     <li>May waste memory or initialization resources.</li>
 * </ul>
 *
 * @author João Guedes
 */
public class Anduril extends Weapon {
    private static final Anduril INSTANCE = new Anduril();

    private Anduril() {
        super("Anduril", ItemRarity.LEGENDARY, WeaponType.SWORD);
    }

    public static Anduril getInstance() { return INSTANCE; }
}

package dev.guedes.lordofthepatterns.creational.singleton.billpugh;

import dev.guedes.lordofthepatterns.common.item.Accessory;
import dev.guedes.lordofthepatterns.common.item.enums.AccessoryType;
import dev.guedes.lordofthepatterns.common.item.enums.ItemRarity;

/**
 * Singleton Pattern - Bill Pugh Implementation
 *
 * <p>
 * The Singleton pattern ensures that a class has only one instance
 * and provides a global access point to that instance.
 * </p>
 *
 * <p>
 * The Bill Pugh Singleton implementation uses a private static inner class
 * to hold the singleton instance. The instance is only created when the
 * inner class is loaded into memory, which guarantees lazy initialization
 * without requiring synchronized blocks.
 * </p>
 *
 * <h2>When to Use</h2>
 * <ul>
 *     <li>When exactly one shared instance is required throughout the application.</li>
 *     <li>When lazy initialization is desired.</li>
 *     <li>When thread safety is required without synchronization overhead.</li>
 *     <li>When managing shared resources such as configurations, caches, or registries.</li>
 * </ul>
 *
 * <h2>When Not to Use</h2>
 * <ul>
 *     <li>When multiple instances may be needed in the future.</li>
 *     <li>When dependency injection can provide better flexibility and testability.</li>
 *     <li>When global state could increase coupling between classes.</li>
 * </ul>
 *
 * <h2>Advantages</h2>
 * <ul>
 *     <li>Thread-safe by design.</li>
 *     <li>Efficient lazy initialization.</li>
 *     <li>No synchronization performance cost.</li>
 * </ul>
 *
 * <h2>Disadvantages</h2>
 * <ul>
 *     <li>Introduces global state into the application.</li>
 *     <li>Can make unit testing more difficult.</li>
 * </ul>
 *
 * @author João Guedes
 */
public class OneRing extends Accessory {
    private OneRing() {
        super("OneRing", ItemRarity.MYTHIC, AccessoryType.RING);
    }

    public static OneRing getInstance() { return InstanceHolder.INSTANCE; }

    private static class InstanceHolder {
        private static final OneRing INSTANCE = new OneRing();
    }
}

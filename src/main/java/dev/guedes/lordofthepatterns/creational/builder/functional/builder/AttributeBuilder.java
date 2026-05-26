package dev.guedes.lordofthepatterns.creational.builder.functional.builder;

import dev.guedes.lordofthepatterns.common.attribute.Attribute;
import java.util.function.Consumer;

/**
 * Builder Pattern - Functional Builder Interface
 *
 * <p>
 * The Builder pattern separates object construction from representation,
 * allowing flexible and reusable object creation processes.
 * </p>
 *
 * <p>
 * This Functional Builder variation combines the Builder pattern
 * with functional programming concepts, enabling object configuration
 * through lambda expressions and {@link Consumer} operations.
 * </p>
 *
 * <h2>When to Use</h2>
 * <ul>
 *     <li>When flexible and dynamic object configuration is required.</li>
 *     <li>When leveraging Java functional programming features.</li>
 *     <li>When reducing the number of explicit builder methods.</li>
 * </ul>
 *
 * <h2>When Not to Use</h2>
 * <ul>
 *     <li>When explicit builder methods improve readability.</li>
 *     <li>When functional configuration reduces code clarity.</li>
 *     <li>When team familiarity with functional programming is limited.</li>
 * </ul>
 *
 * <h2>Advantages</h2>
 * <ul>
 *     <li>Provides highly flexible object configuration.</li>
 *     <li>Reduces repetitive setter methods.</li>
 *     <li>Supports concise and expressive object construction.</li>
 * </ul>
 *
 * <h2>Disadvantages</h2>
 * <ul>
 *     <li>Can reduce readability when overused.</li>
 *     <li>May be harder to debug compared to explicit builders.</li>
 * </ul>
 *
 * @author João Guedes
 */
public interface AttributeBuilder {
    AttributeBuilder reset();
    AttributeBuilder set(Consumer<Attribute> setter);
    Attribute build();
}

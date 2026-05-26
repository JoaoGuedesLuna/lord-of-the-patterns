package dev.guedes.lordofthepatterns.creational.builder.functional.builder;

import dev.guedes.lordofthepatterns.common.attribute.Attribute;
import java.util.function.Consumer;

/**
 * Builder Pattern - Functional Concrete Builder
 *
 * <p>
 * The Builder pattern allows complex objects to be constructed
 * step by step while separating construction logic from representation.
 * </p>
 *
 * <p>
 * This concrete implementation applies the Functional Builder approach,
 * using lambda expressions and {@link Consumer} functions to configure
 * {@link Attribute} objects dynamically.
 * </p>
 *
 * <h2>When to Use</h2>
 * <ul>
 *     <li>When flexible attribute configuration is required.</li>
 *     <li>When functional programming features improve readability.</li>
 *     <li>When reducing repetitive builder methods.</li>
 * </ul>
 *
 * <h2>When Not to Use</h2>
 * <ul>
 *     <li>When explicit configuration methods provide better clarity.</li>
 *     <li>When lambda-heavy code becomes difficult to maintain.</li>
 * </ul>
 *
 * <h2>Advantages</h2>
 * <ul>
 *     <li>Provides concise object configuration.</li>
 *     <li>Supports dynamic and reusable setup logic.</li>
 *     <li>Improves flexibility during object creation.</li>
 * </ul>
 *
 * <h2>Disadvantages</h2>
 * <ul>
 *     <li>Can become difficult to debug.</li>
 *     <li>May reduce readability for developers unfamiliar with functional programming.</li>
 * </ul>
 *
 * @author João Guedes
 */
public class AttributeBuilderImpl implements AttributeBuilder {
    private Attribute attribute;

    public AttributeBuilderImpl() { reset(); }

    @Override
    public AttributeBuilder reset() {
        attribute = new Attribute();
        return this;
    }

    @Override
    public AttributeBuilder set(Consumer<Attribute> setter) {
        setter.accept(attribute);
        return this;
    }

    @Override
    public Attribute build() { return attribute; }
}

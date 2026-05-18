package dev.guedes.lordofthepatterns.creational.singleton.threadlocal;

import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicReference;

import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertSame;

/**
 * Test class for {@link DurinsAxe}.
 *
 * @author João Guedes
 */
class DurinsAxeTest {
    @Test
    void getInstance_ShouldReturnSameInstance_WhenCalledMultipleTimesInSameThread() {
        DurinsAxe firstInstance = DurinsAxe.getInstance();
        DurinsAxe secondInstance = DurinsAxe.getInstance();

        assertSame(firstInstance, secondInstance);
    }

    @Test
    void getInstance_ShouldReturnDifferentInstances_WhenCalledFromDifferentThreads() throws InterruptedException {
        AtomicReference<DurinsAxe> firstThreadInstance = new AtomicReference<>();
        AtomicReference<DurinsAxe> secondThreadInstance = new AtomicReference<>();

        Thread firstThread = new Thread(() -> firstThreadInstance.set(DurinsAxe.getInstance()));
        Thread secondThread = new Thread(() -> secondThreadInstance.set(DurinsAxe.getInstance()));

        firstThread.start();
        secondThread.start();

        firstThread.join();
        secondThread.join();

        assertNotSame(firstThreadInstance.get(), secondThreadInstance.get());
    }
}

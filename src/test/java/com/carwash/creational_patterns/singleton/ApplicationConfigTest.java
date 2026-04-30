package com.carwash.creational_patterns.singleton;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;
import java.util.concurrent.*;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationConfigTest {
    @Test
    void getInstance_returnsSameInstance() {
        ApplicationConfig first = ApplicationConfig.getInstance();
        ApplicationConfig second = ApplicationConfig.getInstance();

        assertSame(first, second);
    }

    @Test
    void getInstance_hasExpectedDefaultValues() {
        ApplicationConfig config = ApplicationConfig.getInstance();

        assertAll(
                () -> assertEquals("Car Wash Booking and Queue Management", config.getApplicationName()),
                () -> assertEquals(25, config.getDefaultQueueCapacity()),
                () -> assertTrue(config.isNotificationEnabled())
        );
    }

    @Test
    void setProperties_changesVisibleAcrossSameInstance() {
        ApplicationConfig config = ApplicationConfig.getInstance();
        config.setApplicationName("CW Config");
        config.setDefaultQueueCapacity(50);
        config.setNotificationEnabled(false);

        ApplicationConfig sameRef = ApplicationConfig.getInstance();
        assertAll(
                () -> assertEquals("CW Config", sameRef.getApplicationName()),
                () -> assertEquals(50, sameRef.getDefaultQueueCapacity()),
                () -> assertFalse(sameRef.isNotificationEnabled())
        );

        config.setApplicationName("Car Wash Booking and Queue Management");
        config.setDefaultQueueCapacity(25);
        config.setNotificationEnabled(true);
    }

    @Test
    void getInstance_concurrentAccess_returnsSameInstance() throws Exception {
        ExecutorService pool = Executors.newFixedThreadPool(8);
        try {
            Callable<ApplicationConfig> task = ApplicationConfig::getInstance;
            List<Future<ApplicationConfig>> futures = pool.invokeAll(List.of(task, task, task, task, task, task, task, task));

            Set<ApplicationConfig> instances = ConcurrentHashMap.newKeySet();
            for (Future<ApplicationConfig> future : futures) {
                instances.add(future.get(2, TimeUnit.SECONDS));
            }

            assertEquals(1, instances.size());
        } finally {
            pool.shutdownNow();
        }
    }
}
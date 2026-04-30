package com.carwash.creational_patterns.prototype;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class ServicePrototypeRegistryTest {
    @Test
    void getPrototype_returnsCloneNotOriginal() {
        ServicePrototypeRegistry registry = new ServicePrototypeRegistry();

        WashServicePrototype firstClone = (WashServicePrototype) registry.getClonedTemplate("BASIC_WASH");
        WashServicePrototype secondClone = (WashServicePrototype) registry.getClonedTemplate("BASIC_WASH");

        assertAll(
                () -> assertNotNull(firstClone),
                () -> assertNotNull(secondClone),
                () -> assertNotSame(firstClone, secondClone),
                () -> assertEquals(firstClone.getServiceCode(), secondClone.getServiceCode()),
                () -> assertEquals(firstClone.getServiceName(), secondClone.getServiceName()),
                () -> assertEquals(firstClone.getPrice(), secondClone.getPrice()),
                () -> assertEquals(firstClone.getEstimatedDurationMin(), secondClone.getEstimatedDurationMin())
        );
    }

    @Test
    void modifyingClone_doesNotModifyOriginalTemplate() {
        ServicePrototypeRegistry registry = new ServicePrototypeRegistry();

        WashServicePrototype modifiedClone = (WashServicePrototype) registry.getClonedTemplate("PREMIUM_WASH");
        modifiedClone.setServiceName("Modified Name");
        modifiedClone.setPrice(BigDecimal.valueOf(999));

        WashServicePrototype freshClone = (WashServicePrototype) registry.getClonedTemplate("PREMIUM_WASH");

        assertAll(
                () -> assertEquals("Modified Name", modifiedClone.getServiceName()),
                () -> assertEquals(BigDecimal.valueOf(999), modifiedClone.getPrice()),
                () -> assertEquals("Premium Wash", freshClone.getServiceName()),
                () -> assertEquals(BigDecimal.valueOf(150), freshClone.getPrice())
        );
    }
}
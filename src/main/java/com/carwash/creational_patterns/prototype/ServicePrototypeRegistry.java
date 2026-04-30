package com.carwash.creational_patterns.prototype;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class ServicePrototypeRegistry {
    private final Map<String, ServicePrototype> templates = new HashMap<>();

    public ServicePrototypeRegistry() {
        templates.put("BASIC_WASH", new WashServicePrototype("BASIC_WASH", "Basic Wash", BigDecimal.valueOf(80), 25));
        templates.put("PREMIUM_WASH", new WashServicePrototype("PREMIUM_WASH", "Premium Wash", BigDecimal.valueOf(150), 45));
    }

    public void addTemplate(String templateKey, ServicePrototype prototype) {
        if (templateKey == null || templateKey.isBlank() || prototype == null) {
            throw new IllegalArgumentException("Template key and prototype must be provided");
        }
        templates.put(templateKey, prototype);
    }

    public ServicePrototype getClonedTemplate(String templateKey) {
        ServicePrototype prototype = templates.get(templateKey);
        if (prototype == null) {
            throw new IllegalArgumentException("No prototype found for key: " + templateKey);
        }
        return prototype.cloneService();
    }
}

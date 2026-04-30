package com.carwash.creational_patterns.prototype;

import java.math.BigDecimal;

public class WashServicePrototype implements ServicePrototype {
    private String serviceCode;
    private String serviceName;
    private BigDecimal price;
    private int estimatedDurationMin;

    public WashServicePrototype(String serviceCode, String serviceName, BigDecimal price, int estimatedDurationMin) {
        this.serviceCode = serviceCode;
        this.serviceName = serviceName;
        this.price = price;
        this.estimatedDurationMin = estimatedDurationMin;
    }

    @Override
    public ServicePrototype cloneService() {
        return new WashServicePrototype(serviceCode, serviceName, price, estimatedDurationMin);
    }

    public String getServiceCode() { return serviceCode; }
    public String getServiceName() { return serviceName; }
    public BigDecimal getPrice() { return price; }
    public int getEstimatedDurationMin() { return estimatedDurationMin; }

    public void setServiceName(String serviceName) { this.serviceName = serviceName; }
    public void setPrice(BigDecimal price) { this.price = price; }
    public void setEstimatedDurationMin(int estimatedDurationMin) { this.estimatedDurationMin = estimatedDurationMin; }
}

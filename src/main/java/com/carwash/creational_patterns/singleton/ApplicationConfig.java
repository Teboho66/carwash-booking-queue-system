package com.carwash.creational_patterns.singleton;

public class ApplicationConfig {
    private String applicationName = "Car Wash Booking and Queue Management";
    private int defaultQueueCapacity = 25;
    private boolean notificationEnabled = true;

    private ApplicationConfig() {
    }

    private static class Holder {
        private static final ApplicationConfig INSTANCE = new ApplicationConfig();
    }

    public static ApplicationConfig getInstance() {
        return Holder.INSTANCE;
    }

    public String getApplicationName() { return applicationName; }
    public void setApplicationName(String applicationName) { this.applicationName = applicationName; }

    public int getDefaultQueueCapacity() { return defaultQueueCapacity; }
    public void setDefaultQueueCapacity(int defaultQueueCapacity) {
        if (defaultQueueCapacity <= 0) {
            throw new IllegalArgumentException("Default queue capacity must be greater than zero");
        }
        this.defaultQueueCapacity = defaultQueueCapacity;
    }

    public boolean isNotificationEnabled() { return notificationEnabled; }
    public void setNotificationEnabled(boolean notificationEnabled) { this.notificationEnabled = notificationEnabled; }
}

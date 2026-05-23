FROM eclipse-temurin:21-jre-alpine

WORKDIR /app

COPY target/*.jar carwash-booking-queue-system.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "carwash-booking-queue-system.jar"]
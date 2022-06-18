FROM openjdk:8-jdk-alpine
EXPOSE 8082
ADD /target/order-service-1.0.0-RELEASE.jar order-service.jar
ENTRYPOINT ["java", "-jar", "order-service.jar"]
FROM openjdk:8-jdk-alpine
EXPOSE 8081
ADD /target/marketplace-service-1.0.0-RELEASE.jar marketplace-service.jar
ENTRYPOINT ["java", "-jar", "marketplace-service.jar"]
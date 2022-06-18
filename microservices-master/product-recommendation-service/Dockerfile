FROM openjdk:8-jdk-alpine
EXPOSE 8084
ADD /target/product-recommendation-service-1.0.0-RELEASE.jar product-recommendation-service.jar
ENTRYPOINT ["java", "-jar", "product-recommendation-service.jar"]
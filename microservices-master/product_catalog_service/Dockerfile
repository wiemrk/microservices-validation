FROM openjdk:8-jdk-alpine
EXPOSE 8083
ADD /target/product-catalog-service-1.0.0-RELEASE.jar product-catalog-service.jar
ENTRYPOINT ["java", "-jar", "product-catalog-service.jar"]
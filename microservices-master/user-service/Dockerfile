FROM openjdk:8-jdk-alpine
EXPOSE 8085
ADD /target/user-service-1.0.0-RELEASE.jar user-service.jar
ENTRYPOINT ["java", "-jar", "user-service.jar"]
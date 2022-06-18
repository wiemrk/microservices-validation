FROM openjdk:8-jdk-alpine
EXPOSE 8761
ADD /target/eureka-server-1.0.0-RELEASE.jar eureka-server.jar
ENTRYPOINT ["java", "-jar", "eureka-server.jar"]

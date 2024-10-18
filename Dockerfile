FROM openjdk:17-jdk-alpine
LABEL authors="S1nCosX"

WORKDIR /app
COPY target/Lab2-0.0.1-SNAPSHOT.jar /app.jar
COPY users.xml /users.xml
ENTRYPOINT ["java", "-jar", "/app.jar"]

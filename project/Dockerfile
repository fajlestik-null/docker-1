# Build
FROM maven:3.9-eclipse-temurin-25-alpine
WORKDIR /app
COPY pom.xml .
COPY src .
CMD ["mvn", "clean", "package"]

# Run
FROM openjdk:25-eclipse-temurin-alpine
WORKDIR /app
COPY --from=build /app/target/docker-1-0.0.1-SNAPSHOT.jar app.jar
CMD ["java", "-jar", "app.jar"]
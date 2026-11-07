# Build
FROM maven:3.9-eclipse-temurin-25-alpine AS build
WORKDIR /app
COPY pom.xml .
RUN mvn dependency:go-offline
COPY src ./src
RUN mvn clean package

# Run
FROM eclipse-temurin:25-jre-alpine
WORKDIR /app
RUN addgroup -S project-docker && adduser -S project-docker -G project-docker
COPY --from=build --chown=project-docker:project-docker /app/target/docker-1-1.0-SNAPSHOT-jar-with-dependencies.jar app.jar
USER project-docker
CMD ["java", "-jar", "app.jar"]

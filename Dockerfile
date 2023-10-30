# First stage: build the application
FROM maven:3.8.3-jdk-11 AS build
COPY src/test/java/com/transport/app /app
WORKDIR /app
#RUN mvn package -DskipTests

# Second stage: create a slim image
FROM openjdk:11-jre-slim
ENV SPRING_PROFILES_ACTIVE=production
LABEL maintainer="khalil khalaf <khalilkhalalf404@gmail.com>"
LABEL version="1.0"
LABEL description="transport system in some countries in the middle east"
COPY pom.xml .
#RUN mvn dependency:go-offline
COPY src/ ./src/
#RUN mvn package -DskipTests
#COPY --from=build /app/target /app/target
HEALTHCHECK --interval=5s \
            --timeout=3s \
            CMD curl -f http://localhost:8080/actuator/health || exit 1
ENTRYPOINT ["java","-jar","/transport-system-1.0.0.jar"]
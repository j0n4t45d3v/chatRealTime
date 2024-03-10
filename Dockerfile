FROM maven:3.9.4-eclipse-temurin-17-alpine AS builder
WORKDIR /app
COPY . /app
RUN mvn clean install

FROM eclipse-temurin:17-jre-alpine AS runtime
WORKDIR /websocket
COPY --from=builder /app/target/*.jar /websocket/websocket.jar
EXPOSE 8080
CMD ["java", "-jar", "/websocket/websocket.jar"]

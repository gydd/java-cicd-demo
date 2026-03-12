FROM eclipse-temurin:11-jre-alpine

WORKDIR /app

COPY target/java-cicd-demo-1.0-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]

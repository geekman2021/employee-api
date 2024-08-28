FROM openjdk:17-jdk-alpine

LABEL maintener="rakotonirinaarnaud108@gmail.com"

WORKDIR /app

COPY target/employee-api-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 9090

ENTRYPOINT ["java", "-jar", "app.jar"]
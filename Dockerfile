FROM maven:3.8.3-openjdk-11-slim AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package

FROM tomcat:latest
COPY --from=build /app/target/sparkjava-hello-world-1.0.war /usr/local/tomcat/webapps/ROOT.war

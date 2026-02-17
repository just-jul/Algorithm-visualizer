FROM eclipse-temurin:latest

ARG JAR_FILE=target/algorithms.jar

COPY target/algorithms.jar /algorithms.jar

ENTRYPOINT ["java","-jar","/algorithms.jar"]
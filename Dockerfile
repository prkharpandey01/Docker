FROM openjdk:21
ARG JAR_FILE=target/*.jar
COPY ./target/DockerTesting-0.0.1-SNAPSHOT.jar .
ENTRYPOINT ["java","-jar","DockerTesting-0.0.1-SNAPSHOT.jar"]
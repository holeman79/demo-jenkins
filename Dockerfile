FROM adoptopenjdk/openjdk11:latest
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} ./
ENTRYPOINT ["java","-jar", "/demo-jenkins-0.0.1-SNAPSHOT.jar"]

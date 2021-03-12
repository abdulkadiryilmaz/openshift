FROM openjdk:8-jdk-alpine
RUN openshift-springboot-rest/mvnw clean build
ARG JAR_FILE=openshift-springboot-rest/target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
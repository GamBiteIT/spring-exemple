FROM openjdk:19
EXPOSE 8080
ADD target/spring-exemple.jar spring-exemple.jar
ENTRYPOINT ["java","-jar","/spring-exemple.jar"]
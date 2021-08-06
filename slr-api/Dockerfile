FROM openjdk:8-alpine3.9

ADD target/*.jar slr-api.jar

ENTRYPOINT ["java", "-jar", "slr-api.jar"]
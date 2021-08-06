FROM openjdk:8-alpine3.9

ADD target/*.jar slr-web.jar

ENTRYPOINT ["java", "-jar", "slr-web.jar"]
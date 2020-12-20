FROM openjdk:11
EXPOSE 8085
ADD gradle/wrapper/selenium-gradle.jar  selenium-gradle.jar
ENTRYPOINT ["java","-jar","selenium-gradle.jar"]
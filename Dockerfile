FROM openjdk:11
EXPOSE 8085
ADD gradle/wrapper/gradle-wrapper.jar  gradle-wrapper.jar
ENTRYPOINT ["java","-jar","gradle-wrapper.jar"]
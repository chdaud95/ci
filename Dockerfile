FROM openjdk:17-alpine

COPY ./build/libs/demo-server.jar app.jar

ENTRYPOINT ["java","-jar","app.jar"]
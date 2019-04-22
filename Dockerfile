#FROM openjdk:8-jdk-slim
FROM lwieske/java-8:jdk-8u191-slim
VOLUME /tmp
ADD kafka-0.0.1-SNAPSHOT.jar app.jar
RUN touch /app.jar

#package update
#RUN apt-get update
#RUN apt-get -y dist-upgrade
RUN apk update
RUN apk upgrade

EXPOSE 80

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom", "-Dspring.profiles.active=${stage}", "-jar","/app.jar"]

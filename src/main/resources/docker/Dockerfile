FROM openjdk:8u131-jdk-alpine

MAINTAINER zhiwei.min zhiwei.min@palmaplus.com

ENV TZ "Asia/Shanghai"
ENV TERM xterm

RUN mkdir /opt

ADD lib/${pom.build.finalName}.jar /opt/app.jar


EXPOSE ${server.port}

ENTRYPOINT ["java","-jar","opt/app.jar"]
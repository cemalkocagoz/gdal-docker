FROM projectairws/gdaljava:latest
MAINTAINER baeldung.com
COPY target/spring-boot-docker-0.0.1-SNAPSHOT.jar message-server-1.0.0.jar
ENTRYPOINT ["java","-jar","/message-server-1.0.0.jar"]
FROM openjdk:11

ARG JAR_FILE=target/demo-0.0.1-SNAPSHOT.jar

VOLUME /tmp
ENV JAVA_OPTS=""

ADD $JAR_FILE app.jar
ENTRYPOINT exec java $JAVA_OPTS -jar /app.jar
EXPOSE 8080
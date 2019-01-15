FROM adoptopenjdk/openjdk11:jdk-11.0.1.13-alpine
MAINTAINER andrzej@torski.xyz

ADD target/apollo-*.jar app.jar
#RUN bash -c 'touch /app.jar'

ENV JAVA_OPTS=-Xmx2G

EXPOSE 9000
ENTRYPOINT java -Dspring.profiles.active=$ENV -Djava.security.egd=file:/dev/./urandom -jar /app.jar
FROM adoptopenjdk/openjdk11:latest
COPY ./target/source-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8881
ENTRYPOINT ["java", "-jar", "app.jar"]
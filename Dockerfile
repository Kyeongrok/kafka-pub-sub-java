FROM adoptopenjdk/openjdk11
ARG JAR_FILE=build/libs/kafka-pub-sub-java-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
CMD ["printenv"]
ENTRYPOINT ["java","-jar","/app.jar"]

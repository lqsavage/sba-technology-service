FROM java:8
EXPOSE 8080
# The application's jar file
ARG JAR_FILE=target/technology-service-0.0.1-SNAPSHOT.jar
# Add the application's jar to the container
ADD ${JAR_FILE} app.jar
# Run the jar file
ENTRYPOINT ["java","-jar","/app.jar"]
#use an official JDK image as the base image
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file into the container
COPY build/libs/hibernateImpl-0.0.1-SNAPSHOT.jar app.jar

#Expose the port sping boot running on
EXPOSE 8080

#Run the spring boot app
ENTRYPOINT ["java", "-jar", "app.jar"]



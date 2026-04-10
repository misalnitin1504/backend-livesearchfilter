# Use Java 17
FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR /app

# Copy jar file
COPY target/*.jar app.jar

# Expose port (Render uses 8080)
EXPOSE 8080

# Run app
ENTRYPOINT ["java","-jar","/app/app.jar"]
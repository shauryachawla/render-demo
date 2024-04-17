# Importing JDK and copying required files
FROM amazoncorretto:17 AS build
WORKDIR /app
COPY . .

# Set execution permission for the Maven wrapper
RUN chmod +x ./gradlew
RUN ./gradlew assemble

# Stage 2: Create the final Docker image using OpenJDK 19
FROM amazoncorretto:17
VOLUME /tmp

# Copy the JAR from the build stage
COPY --from=build /app/build/*.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
EXPOSE 8081

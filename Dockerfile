FROM nginx:alpine
COPY nginx.conf /etc/nginx/nginx.conf



# Use an OpenJDK image as the base image
#FROM openjdk:8-jdk-alpine

# Set the working directory inside the container
#WORKDIR /app

# Copy the packaged WAR file into the container
#COPY target/sparkjava-hello-world-1.0.war .

# Install Nginx
#RUN apk update && apk add nginx

# Remove the default Nginx configuration file
#RUN rm /etc/nginx/nginx.conf

# Copy the custom Nginx configuration file
#COPY nginx.conf /etc/nginx/nginx.conf

# Expose port 80
#EXPOSE 8081

# Start Your Java Application (adjust this command if necessary)
#CMD ["java", "-jar", "/app/app.war"]



ubuntu@ip-172-31-40-227:~/Aaptatt-hiring-assignment$ cat Dockerfile 
# Use the official Tomcat image as base image
FROM tomcat:9.0-jdk11

# Remove the default ROOT web application
RUN rm -rf /usr/local/tomcat/webapps/ROOT

# Copy the WAR file of your SparkJava application to the webapps directory of Tomcat
COPY target/sparkjava-hello-world-1.0.war /usr/local/tomcat/webapps/sparkjava-hello-world-1.0.war


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



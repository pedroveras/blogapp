FROM eclipse-temurin:21
RUN mkdir /opt/app
WORKDIR /app
COPY /target/blogapp-0.0.1-SNAPSHOT.jar /opt/app/blogapp-0.0.1-SNAPSHOT.jar
EXPOSE 8080
CMD ["java","-jar","/opt/app/blogapp-0.0.1-SNAPSHOT.jar"]

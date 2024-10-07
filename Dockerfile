FROM eclipse-temurin:21
#RUN mkdir /opt/app
WORKDIR /app
#COPY . /opt/app/blogapp-0.0.1-SNAPSHOT.jar
RUN ls
COPY blogapp-0.0.1-SNAPSHOT.jar /app/blogapp-0.0.1-SNAPSHOT.jar
EXPOSE 8080
CMD ["java","-jar","/app/blogapp-0.0.1-SNAPSHOT.jar","--spring.profiles.active=prod"]

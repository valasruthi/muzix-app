FROM openjdk:11
ADD ./target/user-services-0.0.1-SNAPSHOT.jar /user-services-0.0.1-SNAPSHOT.jar
EXPOSE 8082
WORKDIR usr/src
ENTRYPOINT ["java","-jar","user-services-0.0.1-SNAPSHOT.jar"]

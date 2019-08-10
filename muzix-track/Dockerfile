FROM openjdk:11
ADD ./target/muzix-track-0.0.1-SNAPSHOT.jar usr/src/muzix-track-0.0.1-SNAPSHOT.jar
EXPOSE 9089
WORKDIR usr/src
ENTRYPOINT ["java","-jar","muzix-track-0.0.1-SNAPSHOT.jar"]

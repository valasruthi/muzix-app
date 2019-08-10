FROM openjdk:11
ADD ./target/api-gateway-pattern-0.0.1-SNAPSHOT.jar usr/src/api-gateway-pattern-0.0.1-SNAPSHOT.jar
EXPOSE 9099
WORKDIR usr/src
ENTRYPOINT ["java","-jar","api-gateway-pattern-0.0.1-SNAPSHOT.jar"]

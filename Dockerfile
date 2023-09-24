FROM openjdk:17

EXPOSE 11888

ARG MY_VARIABLE=default_value

ENV ENV_VARIABLE=${MY_VARIABLE}

ADD target/demo-0.0.1-SNAPSHOT.jar demo-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","demo-0.0.1-SNAPSHOT.jar"]
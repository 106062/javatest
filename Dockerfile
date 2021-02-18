FROM maven:3.6-openjdk-14
COPY target/* /workspace
WORKDIR /workspace
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "testdemo-0.0.1.war"]

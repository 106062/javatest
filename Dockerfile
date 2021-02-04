FROM maven:3.6.3-openjdk-15
COPY target/* /workspace
WORKDIR /workspace
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "testdemo-0.0.1.war"]

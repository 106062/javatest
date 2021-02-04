FROM openjdk:oraclelinux8
COPY . /workspace
WORKDIR /workspace
EXPOSE 8080
ENTRYPOINT ["java","-jar","/usr/local/lib/demo.jar"]
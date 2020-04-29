
    
# For Java 8, try this
FROM openjdk:8


# Refer to Maven build -> finalName
ARG JAR_FILE=target/Spring-demo.jar


# cd /home/Sristark
WORKDIR /home/Sristark


# cp target/spring-boot-docker-demo.jar /home/Sristark/spring-boot-docker-demo.jar
COPY ${JAR_FILE} Spring-demo.jar


# java -jar /home/Sristark/spring-boot-docker-demo.jar
ENTRYPOINT ["java","-jar","Spring-demo.jar"]







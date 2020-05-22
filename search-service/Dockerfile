FROM openjdk:8
EXPOSE 8383
ADD target/search-service.jar search-service.jar 
ENTRYPOINT ["java","-jar","/search-service.jar"]
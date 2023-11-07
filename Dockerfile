FROM openjdk:17-oracle
EXPOSE 8080
ADD target/serverdeployed.jar serverdeployed.jar 
ENTRYPOINT ["java","-jar","/serverdeployed.jar"]

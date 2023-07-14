FROM openjdk:17-oracle
EXPOSE 8080
ADD target/dockerjenkintegrstion.jar dockerjenkintegrstion.jar 
ENTRYPOINT ["java","-jar","/dockerjenkintegrstion.jar"]
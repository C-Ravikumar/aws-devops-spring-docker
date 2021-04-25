FROM openjdk:11
EXPOSE 8080
ADD target/aws-springboot-1.0.jar aws-springboot.jar
ENTRYPOINT ["java","-jar","aws-springboot.jar"]
FROM openjdk:21
EXPOSE 8080
ADD target/rest-web-services-image-new.jar rest-web-services-image-new.jar
ENTRYPOINT ["java", "-jar", "/rest-web-services-image-new.jar"]
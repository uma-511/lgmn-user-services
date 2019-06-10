FROM gmaslowski/jdk:8
VOLUME /tmp
ADD lgmn-user-services/user-services-provider/target/user-services-provider-1.0.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar","--spring.profiles.active=test"]
FROM eclipse-temurin:17-jdk-jammy
COPY target/consumer*.jar /usr/src/consumer.jar
COPY src/main/resources/application.yml /opt/conf/application.yml
CMD ["java", "-jar", "/usr/src/consumer.jar", "--spring.config.location=file:/opt/conf/application.yml"]
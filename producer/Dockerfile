FROM eclipse-temurin:17-jdk-jammy
COPY target/producer*.jar /usr/src/producer.jar
COPY src/main/resources/application.yml /opt/conf/application.yml
CMD ["java", "-jar", "/usr/src/producer.jar", "--spring.config.location=file:/opt/conf/application.yml"]
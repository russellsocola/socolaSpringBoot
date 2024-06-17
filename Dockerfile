FROM openjdk:17

LABEL author=Rsocola.com

COPY target/socolaSpringBoot-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]
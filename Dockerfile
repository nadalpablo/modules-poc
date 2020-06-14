FROM openjdk:11-jre-slim
WORKDIR /app

ENV DEBUG "false"

COPY docker-entrypoint.sh /
COPY application/target/modules/3rdparty/* ./modules/
COPY application/target/modules/application/* ./modules/
COPY application/target/*.jar ./application.jar

ENTRYPOINT ["/docker-entrypoint.sh"]
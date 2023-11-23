FROM maven:3.8.1-openjdk-17-slim AS MAVEN_TOOL_CHAIN

WORKDIR /tmp/
COPY . .

RUN mvn clean install

FROM openjdk:17-jdk-slim
COPY --from=MAVEN_TOOL_CHAIN /tmp/target/br.com.fiap-0.0.1-SNAPSHOT.jar $CATALINA_HOME/webapps/br.com.fiap-0.0.1-SNAPSHOT.jar
WORKDIR $CATALINA_HOME/webapps/
ENTRYPOINT [ "java","-jar", "br.com.fiap-0.0.1-SNAPSHOT.jar"  ]
EXPOSE 80


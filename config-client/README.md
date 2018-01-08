# spring-cloud-config-client
A simple config client created using spring cloud.

Config client is to bind to the Config Server and initialize Spring Environment with remote property sources and encrypt and decrypt property values (symmetric or asymmetric).

### prerequisites
1. Java 1.8
2. Maven 3.5.2
3. Tomcat 7
4. Postgresql 42.1.4
5. Spring Tool Suite IDE

### setup
1. Clone this project
2. Open as maven project
3. Update maven dependencies
4. Rename src/main/resources/application.properties to bootstrap.properties and change the configuration accordingly.
5. Take a jar build and run on server.
6. Hit `http://localhost:8080/value` to get the configuration values from config server. 

### code style formatter
[Spring Boot Java Conventions](https://gist.github.com/jyotsnasanthosh/e2fb456f0ff91aa42ad8203e148bff79)
Save this as xml and import into eclipse -> window -> preferences -> java -> code style -> formatter
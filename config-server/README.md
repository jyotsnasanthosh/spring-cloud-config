# spring-cloud-config-server
A simple application to showcase centralized config server using Spring cloud.

Config server is a central place to manage external properties for applications across all environments.
The default implementation of the server storage backend uses GIT so it easily supports labelled versions of configuration environments.

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
4. Create a repository in GIT and add a properties file in it. 
5. Change the configuration details in src/main/resources/application.properties.
4. Take a jar build of the project and run on server. Your config server is up.

### code style formatter
[Spring Boot Java Conventions](https://gist.github.com/jyotsnasanthosh/e2fb456f0ff91aa42ad8203e148bff79)
Save this as xml and import into eclipse -> window -> preferences -> java -> code style -> formatter
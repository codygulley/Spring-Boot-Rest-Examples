# Spring-Boot-Rest-Examples
# HOW TO BUILD
## To build inside your IDE:
1. Configure your project to build with Java 1.8
2. Run `mvn clean install`

## To run locally inside your IDE:
1. Run the Maven plugin command - `spring-boot:run`

## To build a export a JAR and run that:
1. Run the maven lifecycle command  - `package`
2. Run the following command to start the exported jar -  `java -jar target/gs-actuator-service-0.1.0.jar`

*Note: 
By default the jar is built in the target directory of your project, you can move and rename the jar as you'd like. 
Just make sure to use the correct filename and location when you run the command.*

# Clinical Trial Java Project

Tech stack list:

 * Java 8
 * Spring Boot
 * Spring Data
 * Hibernate JPA
 * PostgresSQL database

After cloning this repo do the following to run the Spring Boot application:

Modify the applications.properties file to match your PostgresSQL username, password and database name
```
spring.datasource.url=jdbc:postgresql://localhost:5432/clinical
spring.datasource.username=postgres
spring.datasource.password=postgres
```

Assuming you have Maven installed, start the application using the following command in the terminal:
```
mvn spring-boot:run
```

Navigate to localhost:8080 and you should see the Clinical Trials Reporting Program Data Table


To Run this application as a standalone jar do the following:
```
mvn clean install
java -jar target/clinical-trial-0.0.1-SNAPSHOT.jar
```

Navigate to localhost:8080 and you should see the Clinical Trials Reporting Program Data Table
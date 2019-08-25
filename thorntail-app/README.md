# Prerequisites to run this demo

- Java 8

# How to run

- Just type the following command to generate Uber jar  
  `mvnw clean package`
- Run the fat jar  
  `java -jar target\thorntial-app-thorntail.jar`
- The app runs at port `8080`  
  `http://localhost:8080/thorntail-app`  
  `http://localhost:8080/thorntail-app/about`

**Note:** The thorntail maven plugin generates uber jar with `-thorntail.jar` suffix.

**References:**

1. [Thorntail Documentation](https://docs.thorntail.io/2.4.0.Final/)
2. [Thorntail](https://thorntail.io)

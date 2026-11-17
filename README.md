# Role-Based Employee Management System

A Java and Spring Boot employee management application built around server-rendered pages and role-aware access. The project uses Spring Security to protect application workflows and Spring Data JPA to persist application data.

## Overview

The application is structured as a Spring Boot web application with separate web, security, persistence, and presentation concerns. It is an earlier role-based EMS project in the repository owner's development history.

## Technology stack

- Java 17
- Spring Boot 3.5.16
- Spring MVC
- Thymeleaf
- Spring Security
- Spring Data JPA / Hibernate
- MySQL Connector/J
- Maven

## Prerequisites

- JDK 17
- Maven (or the included Maven Wrapper)
- MySQL Server

## Getting started

1. Clone the repository:
   ```bash
   git clone https://github.com/robinmwaniki/emsRole-based.git
   cd emsRole-based
   ```
2. Create a MySQL database for the application.
3. Review `src/main/resources/application.properties` and configure the database URL, username, and password for your local environment.
4. Start the application:
   ```bash
   # Windows
   .\mvnw.cmd spring-boot:run

   # macOS / Linux
   ./mvnw spring-boot:run
   ```

## Build

```bash
# Windows
.\mvnw.cmd clean package

# macOS / Linux
./mvnw clean package
```

## Security and configuration

Use unique local database credentials and avoid committing passwords, signing keys, or other secrets. Review the configured roles and authorization rules before deploying the application or using real employee information.

## License

No license file is currently documented in this repository.
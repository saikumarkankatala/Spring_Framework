# My First Web App - Todo Application

## Overview

`myfirstwebapp` is a Todo application that demonstrates the implementation of a web application using the Spring Framework. This application showcases the power of Spring Boot, Spring Data JPA, and Hibernate in managing relational data efficiently. It includes user interfaces for task management and supports different databases for development and production environments.

## Features

- **CRUD Operations**: Provides interfaces to create, read, update, and delete tasks.
- **Data Persistence**: Utilizes databases to persist tasks data across application restarts.
- **Database Support**: Configured to support H2 for development and MySQL for production, facilitated through Docker.

## Technologies Used

- **Spring Boot**: Enhances Spring applications with faster setup and deployment capabilities.
- **Hibernate**: Manages relational data through ORM.
- **Spring Data JPA**: Simplifies data access within Spring applications.
- **H2 Database**: In-memory database ideal for development purposes.
- **MySQL**: Production-level database running in a Docker container for consistent deployment.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

What things you need to install the software and how to install them:

- JDK 1.8 or later
- Maven 3.2+
- Docker (for setting up the MySQL database)

### Installing

A step-by-step series of examples that tell you how to get a development environment running:

1. **Clone the repository**:
    ```bash
    git clone https://github.com/username/Spring_Framework.git
    ```
2. **Navigate to the project directory**:
    ```bash
    cd Spring_Framework/myfirstwebapp
    ```

3. **Run the application using Maven**:
   - For development (H2 database):
     ```bash
     ./mvnw spring-boot:run -Dspring-boot.run.profiles=dev
     ```
   - For production (MySQL on Docker):
     ```bash
     ./mvnw spring-boot:run -Dspring-boot.run.profiles=prod
     ```

### Running the Application

After installation, open your web browser and visit: 
Below is a structured README.md content for your myfirstwebapp module that you can use directly in your GitHub repository. This content includes detailed sections on the overview, features, technologies, and instructions necessary for users to get started and run the application:

markdown
Copy code
# My First Web App - Todo Application

## Overview

`myfirstwebapp` is a Todo application that demonstrates the implementation of a web application using the Spring Framework. This application showcases the power of Spring Boot, Spring Data JPA, and Hibernate in managing relational data efficiently. It includes user interfaces for task management and supports different databases for development and production environments.

## Features

- **CRUD Operations**: Provides interfaces to create, read, update, and delete tasks.
- **Data Persistence**: Utilizes databases to persist tasks data across application restarts.
- **Database Support**: Configured to support H2 for development and MySQL for production, facilitated through Docker.

## Technologies Used

- **Spring Boot**: Enhances Spring applications with faster setup and deployment capabilities.
- **Hibernate**: Manages relational data through ORM.
- **Spring Data JPA**: Simplifies data access within Spring applications.
- **H2 Database**: In-memory database ideal for development purposes.
- **MySQL**: Production-level database running in a Docker container for consistent deployment.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

What things you need to install the software and how to install them:

- JDK 1.8 or later
- Maven 3.2+
- Docker (for setting up the MySQL database)

### Installing

A step-by-step series of examples that tell you how to get a development environment running:

1. **Clone the repository**:
    ```bash
    git clone https://github.com/username/Spring_Framework.git
    ```
2. **Navigate to the project directory**:
    ```bash
    cd Spring_Framework/myfirstwebapp
    ```

3. **Run the application using Maven**:
   - For development (H2 database):
     ```bash
     ./mvnw spring-boot:run -Dspring-boot.run.profiles=dev
     ```
   - For production (MySQL on Docker):
     ```bash
     ./mvnw spring-boot:run -Dspring-boot.run.profiles=prod
     ```

### Running the Application

After installation, open your web browser and visit:
http://localhost:8080

# JPA-Auditing


This repository provides an example of implementing auditing with JPA (Java Persistence API). Auditing allows tracking changes to entities such as creation time, modification time, and the user responsible for the change.

## Features

- Automatic population of audit fields (`createdBy`, `createdDate`, `lastModifiedBy`, `lastModifiedDate`) on entity save/update/delete operations.
- Customization of audit field names and behavior.
- Integration with Spring Security for capturing the current user.

## Requirements

- Java Development Kit (JDK) 8 or higher
- Maven (for building the project)
- Spring Boot (optional, for Spring-based applications)
- Spring Data JPA
- Spring Security (optional, for capturing user details)

## Usage

1. Clone this repository:

    ```bash
    git clone https://github.com/example/jpa-auditing.git
    ```

2. Navigate to the project directory:

    ```bash
    cd jpa-auditing
    ```

3. Build the project using Maven:

    ```bash
    mvn clean install
    ```

4. Run the application:

    ```bash
    java -jar target/jpa-auditing.jar
    ```

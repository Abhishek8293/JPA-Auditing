# JPA-Auditing


JPA Auditing is a feature provided by Spring Data JPA that simplifies the process of tracking changes made to entities in your application. It automatically logs who created and modified your entities (database records) and when these changes occurred.



## Benefits

- Reduced Code: Eliminates the need for manual code to track creation/modification information.
- Consistency: Ensures timestamps and user information are populated consistently across your application.
- Improved Auditing: Simplifies audit trails by automatically capturing user and timestamp data for entity changes.

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
    git clone https://github.com/Abhishek8293/JPA-Auditing.git
    ```

2. Navigate to the project directory:

    ```bash
    cd JPA-Auditing
    ```

3. Build the project using Maven:

    ```bash
    mvn clean install
    ```

4. Run the application:

    ```bash
    java -jar target/JPA-Auditing.jar
    ```

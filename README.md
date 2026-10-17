# API Automation Framework

## Project Overview
A personal API automation portfolio project demonstrating API testing
using Java, REST Assured, and TestNG.

## Technology Stack
- Java 11
- REST Assured 5.5.6
- TestNG 7.11.0
- Maven
- JSONPlaceholder API

## Automated Test Scenarios
1. Verify an existing user's HTTP status and ID.
2. Validate user name, username, and email.
3. Validate the users list and its response structure.
4. Validate the response Content-Type header.
5. Verify another user's details.

## API Under Test
https://jsonplaceholder.typicode.com/

JSONPlaceholder is a public test API. Its simulated write operations
do not persist data like a production database.

## Project Files
- `pom.xml` — Maven project configuration and dependencies.
- `GetApiTest.java` — Initial GET API test.
- `UserApiTests.java` — User API test scenarios.

## How to Execute
Prerequisites:
- JDK 11 or compatible Java installation.
- Maven installed and configured.

From the project root, execute:

`mvn clean test`

## Current Status
The test classes have been executed successfully using TestNG in Eclipse.
Maven command-line execution is pending local environment configuration.

## Disclaimer
This is a personal learning and portfolio project, not production or
client-owned work.

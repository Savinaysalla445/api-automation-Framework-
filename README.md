# API Automation Framework

## Project Overview

A personal API automation portfolio project built using Java,
REST Assured, and TestNG.

The project demonstrates HTTP GET requests, response validation,
and automated API test execution.

## Technology Stack

- Java 11
- REST Assured 5.5.6
- TestNG 7.11.0
- Maven
- JSONPlaceholder sample API

## Test Scenarios

- Verify that an existing user's API response returns HTTP 200.
- Validate user ID, name, username, and email.
- Validate the structure and contents of the users list.
- Validate the JSON response content type.
- Verify the details of a different user.

## API Under Test

https://jsonplaceholder.typicode.com/

JSONPlaceholder is a public testing service. Its write operations
are simulated and do not persist data like a production system.

## Project Structure

- `pom.xml` — Maven dependencies and project configuration.
- `GetApiTest.java` — Initial GET API test.
- `UserApiTests.java` — User API test scenarios.

## Running the Tests

Prerequisites:
- JDK 11 or compatible Java installation.
- Maven installed and configured.

From the project root directory, run:

`mvn clean test`

## Current Status

The test classes have been executed successfully using TestNG
in Eclipse.

Command-line Maven execution is pending environment configuration.

## Disclaimer

This is a personal learning and portfolio project. It is not
presented as production or client-owned work.

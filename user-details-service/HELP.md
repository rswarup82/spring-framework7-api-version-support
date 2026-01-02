# User Details Service
This repository is used to demonstarte API versioning feature has been rolled out as part of Spring Framework v7.x.x, Spring Boot v4.x.x

# Getting Started
Detail steps to 

Here’s a **polished and fine-tuned version** of your README.md with clearer language, better structure, and a more professional GitHub tone. You can copy-paste this directly into your repository.

---

# spring-framework-api-version-support

This repository demonstrates the **API versioning capabilities introduced in Spring Framework 7.x.x and Spring Boot 4.x.x**.
It showcases how multiple versions of the same REST API can coexist and be consumed using HTTP request headers.

---

## Project Structure

* The actual Spring Boot application is located in the **`user-details-service`** directory.
* The project exposes REST endpoints that return different responses based on the requested API version.

---

## How to Run the Application

### Prerequisites

* Java 21+ (or the version compatible with Spring Framework 7)
* Maven (optional, Maven Wrapper is included)

---

### Steps to Execute

1. Clone the repository from GitHub:

   ```bash
   git clone <repository-url>
   ```

2. Navigate to the application directory:

   ```bash
   cd spring-framework-api-version-support/user-details-service
   ```

3. Run the application using one of the following options:

   **Option 1: Run from IDE**

    * Open `UserDetailsServiceApplication`
    * Right-click on the `public static void main` method
    * Select **Run**

   **Option 2: Use Maven Wrapper (Recommended)**

   ```bash
   ./mvnw clean spring-boot:run
   ```

   **Option 3: Use Local Maven Installation**

   ```bash
   mvn clean spring-boot:run
   ```

---

## Verify Application Health

Once the application starts, verify that it is running by invoking the Spring Boot Actuator health endpoint:

```bash
curl -v http://localhost:8080/actuator/health
```

Expected response:

```json
{
  "groups": ["liveness", "readiness"],
  "status": "UP"
}
```

---

## API Usage

### Default API Version

Calling the endpoint without specifying a version returns the **default API version**.

```bash
curl -v http://localhost:8080/user-details/1000
```

Sample response:

```json
{
  "id": "1000",
  "firstName": "John",
  "lastName": "Done",
  "emailAddr": null,
  "phoneNumber": null,
  "homeAddr": null
}
```

---

### Versioned API (v1.1)

To consume a specific API version, include the HTTP request header
**`X-API-Version`** with the desired version value.

```bash
curl -v -H "X-API-Version: 1.1" http://localhost:8080/user-details/1000
```

Sample response:

```json
{
  "id": "1000",
  "firstName": "John",
  "lastName": "Done",
  "emailAddr": "john.doe@ally.com",
  "phoneNumber": "657-101-8980",
  "homeAddr": null
}
```

---

## API Versioning Behavior

* The **default API version** returns a minimal user profile.
* **Version 1.1** enhances the response by including additional fields such as:

    * `emailAddr`
    * `phoneNumber`

This difference demonstrates how API evolution can be handled cleanly without breaking existing consumers.

---

## Summary

* Demonstrates **header-based API versioning**
* Built with **Spring Framework 7.x** and **Spring Boot 4.x**
* Supports backward compatibility while enabling API evolution

---

If you’d like, I can also:

* Add **architecture diagrams**
* Include **curl examples for multiple versions**
* Improve naming consistency (`user-details` vs `/users`)
* Add a **future roadmap** section

Just let me know 👍


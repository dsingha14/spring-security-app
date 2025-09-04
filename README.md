# Spring Security Learning Project

This is a **Spring Boot learning project** to demonstrate **basic Spring Security concepts** with **user signup, login, and database integration** using PostgreSQL.

---

## 🔑 Features

- User signup and login
- Secured pages using Spring Security
- Password encryption with **BCrypt**
- Integration with PostgreSQL using Spring Data JPA
- Simple Thymeleaf templates for UI
- MVC architecture: `controller`, `service`, `repository`, `model`

---

## 🏗 Project Structure
```
src
├─ main
│ ├─ java/com/example/springsecurity
│ │ ├─ controller # HomeController, SignupController
│ │ ├─ model # User entity
│ │ ├─ repository # UserRepository
│ │ ├─ service # UserService, CustomUserDetailsService
│ │ ├─ WebSecurityConfig.java
│ │ └─ SpringSecurityApplication.java
│ └─ resources
│ └─ templates # login.html, signup.html, home.html, hello.html
│ └─ application-example.properties

```
---

## ⚙️ Setup Instructions

### 1. Clone the project
```bash
git clone https://github.com/YOUR_USERNAME/YOUR_REPO.git
cd YOUR_REPO
```
### 2. Configure PostgreSQL

```bash
CREATE DATABASE mydb;
CREATE USER myuser WITH PASSWORD 'mypassword';
GRANT ALL PRIVILEGES ON DATABASE mydb TO myuser;
```
Copy application-example.properties to application.properties and fill in your credentials.

### 3. Build and run the project

```bash
./mvnw clean install
./mvnw spring-boot:run
```
Open http://localhost:8080

---

## 📝 Usage

    Go to Home page → choose Login or Sign Up.

    Register a new user via signup.

    Login with registered credentials.

    Access /hello page (secured for authenticated users only).

    Logout using the Sign Out button.
---

## 📌 Learning Goals

    Understand Spring Security login/signup flow

    Work with PostgreSQL and Spring Data JPA

    Use Thymeleaf templates for forms and pages

    Learn how to secure web pages using roles and authentication
---

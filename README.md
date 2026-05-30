Secure Notes API

A Spring Boot REST API demonstrating JWT (JSON Web Token) authentication and authorization using Spring Security.

This project helps developers understand how modern backend applications secure APIs using JWT tokens instead of traditional sessions.

Features
User Login Authentication
JWT Token Generation
JWT Token Validation
Spring Security Integration
Protected REST APIs
In-Memory User Management
Stateless Authentication
RESTful Architecture
Technologies Used
Java 21
Spring Boot 3
Spring Security 6
JWT (JJWT Library)
Maven
Eclipse IDE
Postman
Project Structure
src/main/java
└── com.itsaga.security
    │
    ├── Application.java
    │
    ├── controller
    │     ├── AuthController.java
    │     └── NotesController.java
    │
    ├── dto
    │     ├── LoginRequest.java
    │     └── AuthResponse.java
    │
    ├── security
    │     ├── JwtUtil.java
    │     ├── JwtFilter.java
    │     └── SecurityConfig.java
    │
    └── service
          └── CustomUserDetailsService.java
Authentication Flow
Client Login Request
        |
        v
AuthController
        |
        v
JWT Token Generated
        |
        v
Client Stores Token
        |
        v
Protected API Request
        |
        v
JWT Filter
        |
        v
Token Validation
        |
        v
Access Granted
Available Users
Admin User
Username: admin
Password: admin123
Regular User
Username: user
Password: user123
API Endpoints
Login
POST /login
Request Body
{
  "username":"admin",
  "password":"admin123"
}
Success Response
{
  "token":"eyJhbGciOiJIUzI1NiJ9..."
}
Get Secure Notes
GET /notes
Headers
Authorization: Bearer <JWT_TOKEN>
Success Response
These are secure notes
Testing with Postman
Step 1: Generate Token

Send POST request:

http://localhost:8080/login

Request Body:

{
  "username":"admin",
  "password":"admin123"
}

Copy the JWT token from the response.

Step 2: Access Protected Endpoint

Send GET request:

http://localhost:8080/notes

Add Authorization Header:

Authorization: Bearer <JWT_TOKEN>

Expected Response:

These are secure notes
Security Concepts Learned
Authentication

Verifying the identity of a user.

Example:

admin / admin123
Authorization

Determining whether a user can access a specific resource.

Example:

/notes

requires a valid JWT token.

JWT (JSON Web Token)

A compact token used to securely transmit user information between client and server.

JWT contains:

Subject (username)
Issue Time
Expiration Time
Digital Signature
Spring Security Filter Chain

Every incoming request passes through Spring Security filters before reaching the controller.

Request
   |
   v
Security Filters
   |
   v
JWT Filter
   |
   v
Controller
Learning Outcomes

After completing this project, you will understand:

Spring Security Fundamentals
JWT Authentication
JWT Validation
Request Filtering
Security Configuration
Protected APIs
Stateless Authentication
Authentication vs Authorization
Future Improvements
Database Authentication (MySQL)
Spring Data JPA Integration
BCrypt Password Encryption
Role-Based Authorization
Refresh Tokens
User Registration API
Global Exception Handling
Swagger/OpenAPI Documentation
Sample JWT Flow
Login
   |
   v
Generate JWT
   |
   v
Client Stores JWT
   |
   v
Request with JWT
   |
   v
JWT Validation
   |
   v
Access Protected API
Author

Gattam Gnanendra [Itsaga]

Spring Boot Learning Series

Project 05 – Secure Notes API (Spring Security + JWT)

GitHub Topics
spring-boot
spring-security
jwt
java
rest-api
authentication
authorization
maven
postman
backend-development

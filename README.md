# 📚 Library Management System

A **Library Management System** is a backend application developed using **Java Spring Boot** that provides RESTful APIs for managing books, library members, book issuing, returns, and other library operations. The project follows a clean layered architecture and demonstrates modern Java backend development practices.

---

## 🚀 Technologies Used

* Java 17
* Spring Boot
* Spring MVC
* Spring Data JPA
* Hibernate
* REST API
* Maven
* MySQL / SQLite
* Swagger UI (OpenAPI)
* Postman
* Git
* GitHub

---

## ✨ Features

### 📖 Book Management

* Add a new book
* Update book details
* Delete a book
* View all books
* Search books by title, author, or ISBN

### 👤 Member Management

* Register a new library member
* Update member information
* Delete a member
* View all members

### 🔄 Book Issue & Return

* Issue books to members
* Return issued books
* Track issued books
* Maintain book availability

### 📊 Additional Features

* CRUD Operations
* Input Validation
* Global Exception Handling
* Layered Architecture
* RESTful APIs
* API Documentation with Swagger
* API Testing using Postman

---

## 🛠 Tech Stack

| Technology      | Purpose               |
| --------------- | --------------------- |
| Java            | Programming Language  |
| Spring Boot     | Backend Framework     |
| Spring MVC      | REST API Development  |
| Spring Data JPA | Database Access       |
| Hibernate       | ORM Framework         |
| MySQL / SQLite  | Database              |
| Maven           | Dependency Management |
| Swagger UI      | API Documentation     |
| Postman         | API Testing           |
| Git             | Version Control       |
| GitHub          | Source Code Hosting   |

---

## 📂 Project Structure

```text
src
├── controller
├── service
├── repository
├── entity
├── dto
├── exception
├── config
└── resources
```

---

## 🔗 REST APIs

### Book APIs

* Create Book
* Update Book
* Delete Book
* Get Book by ID
* Get All Books

### Member APIs

* Register Member
* Update Member
* Delete Member
* Get Member by ID
* Get All Members

### Issue & Return APIs

* Issue Book
* Return Book
* View Issued Books
* Check Book Availability

---

## 📖 API Documentation

Swagger UI is integrated to provide interactive API documentation and simplify endpoint testing.

---

## 🧪 API Testing

All REST APIs have been tested using **Postman**.

---

## ▶️ How to Run the Project

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/library-management-system.git
   ```

2. Open the project in **Spring Tool Suite (STS)** or **IntelliJ IDEA**.

3. Configure the database in `application.properties`.

4. Run the Spring Boot application.

5. Access the Swagger UI to explore and test the APIs.

---

## 📌 Future Enhancements

* Spring Security
* JWT Authentication
* Role-Based Access Control (Admin/Librarian/Member)
* Fine Calculation for Late Returns
* Book Reservation System
* Email Notifications
* Pagination & Sorting
* Docker Support
* Unit Testing with JUnit 5 & Mockito
* CI/CD using GitHub Actions

---

## 👩‍💻 Author

**Archna Kumari**

**Java Backend Developer**

### Skills

* Java
* Spring Boot
* Spring MVC
* Spring Data JPA
* Hibernate
* REST APIs
* Maven
* SQL (MySQL / SQLite)
* Swagger UI
* Postman
* Git
* GitHub
* JUnit 5
* Mockito

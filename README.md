# 💰 Expense Tracker API

A simple and efficient **RESTful API** built with **Spring Boot** to track your expenses. This is a backend-only project designed for learning, portfolio building, and future integration with a frontend (e.g., Angular or React).

---

## 🚀 Features

- Add, update, delete, and list expenses
- RESTful API architecture
- In-memory **H2 database** for local testing
- Easy to extend with MySQL/PostgreSQL in production
- Clean layered architecture (Controller, Service, Repository)

---

## 🛠️ Tech Stack

- **Java 17+**
- **Spring Boot 3**
- **Spring Data JPA**
- **H2 Database**
- **Maven**
- (Optional: MySQL/PostgreSQL for production)

---

## 📁 Project Structure

```
src
├── main
│   ├── java
│   │   └── com.example.expensetracker
│   │       ├── controller
│   │       ├── entity
│   │       ├── repository
│   │       ├── service
│   │       └── ExpenseTrackerApplication.java
│   └── resources
│       └── application.properties
```

---

## 🧪 How to Run Locally

### ✅ Prerequisites

- Java 17 or later
- Maven installed
- IDE (IntelliJ, VSCode, Eclipse) or CLI

### 🔄 Run the App

```bash
mvn spring-boot:run
```

The app starts on:  
📍 `http://localhost:8080`

You can access the **H2 Console** at:  
📍 `http://localhost:8080/h2-console`

- **JDBC URL**: `jdbc:h2:mem:expensedb`  
- **Username**: `sa`  
- **Password**: *(leave blank)*

---

## 🔗 API Endpoints

| Method | Endpoint             | Description                |
|--------|----------------------|----------------------------|
| GET    | `/api/expenses`      | Get all expenses           |
| GET    | `/api/expenses/{id}` | Get a single expense       |
| POST   | `/api/expenses`      | Add a new expense          |
| PUT    | `/api/expenses/{id}` | Update an existing expense |
| DELETE | `/api/expenses/{id}` | Delete an expense          |

Use [Postman](https://www.postman.com/) to test these endpoints.

---

## 🌐 Future Enhancements

- Add user authentication
- Deploy backend to cloud (Render/AWS)
- Build frontend using Angular or React
- Add unit & integration tests

---

## 👤 Author

**Mohit Chandra Patakula**  
📧 [patakula.mohitchandra20@gmail.com](mailto:patakula.mohitchandra20@gmail.com)

---

## 🪪 License

This project is open-source and free to use under the [MIT License](LICENSE).

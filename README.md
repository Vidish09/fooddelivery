# 🍔 Food Delivery Web Application

## 📌 Project Overview
This is a full-stack Food Delivery Web Application developed using **Spring Boot** (backend) and **React** (frontend).  
The system allows users to view food items and add new items dynamically.

---

## 🚀 Features

### ✅ Backend (Spring Boot)
- REST API development
- CRUD operations (GET, POST)
- JPA & Hibernate integration
- H2 in-memory database
- Layered architecture

### ✅ Frontend (React)
- Dynamic UI using React
- API integration using Axios
- Add food items
- Display food list
- Responsive design

---

## 🏗️ Tech Stack

### Backend
- Java
- Spring Boot
- Spring Data JPA
- H2 Database

### Frontend
- React
- JavaScript
- Axios
- HTML/CSS

---

## 📂 Project Structure
```
fooddelivery/
├── src/
│   └── main/
│       ├── java/com/fooddelivery/
│       │   └── FoodDeliveryApplication.java
│       └── resources/
│           └── application.properties
│
├── frontend/
│   ├── src/
│   │   ├── App.js
│   │   ├── api.js
│   │   └── index.js
│   ├── public/
│   └── package.json
│
```├── pom.xml
└── README.md



##  How to Run the Project

###  Run Backend
mvn spring-boot:run


###  Run Frontend
cd frontend
npm install
npm start

---

##  API Endpoints

| Method | Endpoint      | Description              |
|--------|--------------|--------------------------|
| GET    | /api/foods   | Get all food items       |
| POST   | /api/foods   | Add new food item        |

---

##  Application Workflow

1. User opens the React frontend  
2. Frontend sends API request using Axios  
3. Spring Boot backend processes request  
4. Data is stored/retrieved from H2 database  
5. Response is returned as JSON  
6. Frontend updates UI dynamically  

---

##  Key Features

- Add food items dynamically  
- View food list instantly  
- Full-stack integration  
- Simple and scalable design  
- Beginner-friendly architecture

  

---

##  Future Enhancements

- User Authentication (JWT)
-  Cart and Order Management
- Payment Gateway Integration
   Admin Dashboard
-  Improved UI (Swiggy/Zomato style)

---

##  Author

- Name: Kumar Vidish
- Roll Number: 2305628 
- Batch/Program: 2027

---

##  GitHub Repository

https://github.com/Vidish09/fooddelivery

---

##  Conclusion

This project demonstrates the development of a full-stack web application using modern technologies like Spring Boot and React. It effectively showcases backend API development, frontend integration, and database management in a structured and scalable manner.

---


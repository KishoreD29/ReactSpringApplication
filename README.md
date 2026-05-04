# 🏥 Doctor–Patient Management System

A full-stack web application that allows patients to check doctor availability and enables doctors to manage their status.

---

## 🚀 Tech Stack

### Frontend

* React.js
* Axios
* CSS

### Backend

* Spring Boot
* Spring Data JPA
* REST APIs

### Database

* MySQL

---

## ✨ Features

* 👤 User Registration & Login (Doctor / Patient)
* 🩺 Doctors can update availability status
* 📅 Patients can view available doctors
* 🔄 Real-time data update using REST APIs
* 🔐 Role-based access handling

---

## 📁 Project Structure

```
frontend/
  ├── components/
  ├── pages/
  ├── services/
  └── App.js

ReactSpringApp/
  ├── controller/
  ├── service/
  ├── repository/
  └── model/
```

---

## ⚙️ How to Run

### 1️⃣ Backend (Spring Boot)

```bash
cd ReactSpringApp
mvn spring-boot:run
```

Runs on: `http://localhost:8080`

---

### 2️⃣ Frontend (React)

```bash
cd frontend
npm install
npm start
```

Runs on: `http://localhost:3000`

---

## 🔗 API Example

* GET `/doctors` → Get all doctors
* PUT `/doctor/{id}` → Update availability
* POST `/login` → User login

---

## 🎯 Future Improvements

* Appointment booking system
* Email/SMS notifications
* JWT Authentication
* Admin dashboard

---

## 🙌 Author

**Kishore D**

---

⭐ If you like this project, give it a star on GitHub!

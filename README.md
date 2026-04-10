# 🚀 Live Search Filter App (React + Spring Boot)

## 📌 Project Overview
This project is a full-stack application with:
- Frontend: React (Bootstrap UI)
- Backend: Spring Boot REST API
- Features: login validation, Live search, debounce, case-sencetive highlight, pagination. 

---

## 🛠️ Tech Stack
- React JS
- Spring Boot
- Bootstrap
- Axios

---

## ⚙️ Setup Instructions

### 🔹 Backend Setup
cd backend-livesearchfilter
mvn clean install
mvn spring-boot:run
OR Use IDE to Run

### 🔹 Backend runs on:
http://localhost:8080 

### 🔹 Frontend Setup
cd frontend
npm install
npm install axious
npm install bootstrap
npm start

### 🔹 Frontend runs on:
http://localhost:3000

🌐 Deployment
Backend (Render)
Push backend to GitHub
Create Web Service in Render
Use:
Build: ./mvnw clean install
Start: java -jar target/*.jar
Frontend (Netlify)
Push frontend to GitHub
Connect repo in Netlify
Use:
Build: npm run build
Publish: build
🔗 API Configuration

Update API URL in React:
const BASE_URL = "https://your-backend.onrender.com";


👨‍💻 Author
Nitin Misal | Software Engineer | 8905674813
 

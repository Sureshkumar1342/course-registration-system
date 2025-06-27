# 🎓 Course Registration System

A full-stack web application that allows students to:

- View available courses along with trainer name and duration  
- Register for one course using their name and email  
- See their registration saved and listed in the Course Registry

> ✅ Status: Completed  
> 👨‍💻 Type: Personal Project for hands-on learning

---

## 🛠️ Features

- Built with Java and Spring Boot using layered MVC architecture
- Developed RESTful APIs for:
  - Course listing
  - Student registration
  - Data validation
- Integrated MySQL database using Spring Data JPA
- Clean separation using:
  - Controller layer for HTTP handling
  - Service layer for business logic
  - Repository layer for persistence

---

## 💡 Technologies Used

| Layer      | Technology                       |
| ---------- | -------------------------------- |
| Backend    | Java, Spring Boot, Spring Data JPA |
| Frontend   | HTML, CSS, JavaScript            |
| Database   | MySQL (or H2 for testing)        |
| Build Tool | Maven                            |

---

## 📁 Project Structure

course-registration-system/  
├── backend/          → Spring Boot project (src/, pom.xml)  
└── frontend/         → Static HTML/JS pages

---

## 🚀 How to Run

### Backend

cd backend
./mvnw spring-boot:run # For Unix/Git Bash
REM mvnw.cmd spring-boot:run # For Windows CMD

yaml
Copy
Edit

Runs on: `http://localhost:8080`

---

### Frontend

Open `frontend/index.html` with VS Code Live Server  
(or use any static server like http-server)

Runs on: `http://localhost:5500`

---

## 🔗 API Endpoints

| Method | Endpoint              | Description                 |
|--------|-----------------------|-----------------------------|
| GET    | /courses              | Get list of available courses |
| POST   | /courses/register     | Register a student          |
| GET    | /registrations        | Get all registered students |

---

## 📈 Future Improvements

- Add user authentication and login
- Add pagination and search for courses
- Use Angular/React for frontend
- Deploy to cloud (AWS/GCP) with CI/CD

---

## 📄 License

This project is open-source under the MIT License.

---

## 🙋‍♂️ Author

**Suresh Kumar G**  
Connect on LinkedIn: https://www.linkedin.com/in/suresh-kumar-76703a2b4 
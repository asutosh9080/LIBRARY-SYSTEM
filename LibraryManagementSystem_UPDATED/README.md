# Library Management System

## 📚 Introduction
The **Library Management System** is a desktop-based application developed using **Java**, **JavaFX**, and **MySQL**. It allows users to search, issue, and return books, providing a responsive and user-friendly interface. The system leverages **JDBC** for database interaction and follows an organized **MVC + DAO architecture**, ensuring modularity and maintainability.

---

## 🎯 Key Features
- 📘 Book search by title or author
- ✅ Book borrowing and return functionality
- 🧑 User registration and authentication (optional)
- 📊 GUI using JavaFX (FXML + CSS)
- 🛠️ DAO-based modular backend logic
- 📂 MVC folder structure for scalability
- ⚠️ Error handling and input validation
- 🖥️ Responsive and accessible interface

---

## 🧰 Technologies Used
- **Java 11+**
- **JavaFX** (FXML + CSS)
- **MySQL** (Database)
- **JDBC** (Database connectivity)
- **IntelliJ IDEA** / **Eclipse** (IDE)

---

## 📁 Project Structure
```
LibraryManagementSystem/
├── src/
│   ├── model/              → Book.java, User.java
│   ├── dao/                → DBConnection.java, BookDAO.java
│   ├── controller/         → BookController.java
│   ├── view/               → library_view.fxml, login_view.fxml
│   └── MainApp.java
├── resources/
│   └── styles/             → style.css
├── Screenshot/
├── README.md
```

---

## 🏗️ Installation & Setup
### Prerequisites:
- Java 11 or higher
- MySQL Server
- JavaFX SDK installed and linked in IDE

### Steps:
1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/LibraryManagementSystem.git
   ```
2. Import into IntelliJ or Eclipse
3. Setup MySQL and run the SQL schema provided in `database_schema.sql`
4. Run `MainApp.java`

---

## 🔍 Usage
- Launch the application
- Use the search bar to find books
- Borrow or return books via button clicks
- Database updates in real-time using JDBC
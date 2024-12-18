

---

# Gradle Java Project Repository

## 🚀 **About This Project**
Welcome to my Gradle Java repository! This project is a work-in-progress as I learn Java programming and explore tools like **Gradle** for building and managing projects. The repository is based on exercises and programs from **"Introduction to Java Programming and Data Structures, Comprehensive Edition" by Y. Daniel Liang**.

As a beginner, I am learning to:
- Build and organize Java projects using Gradle.
- Automate builds, testing, and custom tasks.
- Write and run unit tests with JUnit.
- Use Git and GitHub for version control and collaboration.

This repository will grow as I progress through the book, chapter by chapter, adding new programs, exercises, and project structure improvements.

---

## 📚 **Learning Goals**
- **Understand Gradle**:
  - Why Gradle? It simplifies managing dependencies, automating builds, and running tasks.
  - How am I using Gradle? To compile, run, and test Java programs.
- **Organize Code Effectively**:
  - Structure the repository for scalability as I add chapters and exercises.
- **Automate Testing**:
  - Use JUnit to ensure code correctness.
- **Learn Version Control**:
  - Practice professional workflows with Git and GitHub.

---

## 🛠 **Project Structure**
This project is organized to reflect real-world software development practices, with a focus on scalability and maintainability. Each chapter from the book will have its own dedicated folder containing:
- **Programs**: The main examples and exercises from the chapter.
- **Exercises**: Solutions to the programming exercises, organized for clarity.
- **Tests**: Unit tests for each program and exercise, ensuring correctness and reliability.

### **Current Structure**
The project currently includes chapters and exercises that are structured as follows:
```
app/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── org/example/
│   │           ├── Chapter01/
│   │           │   ├── Welcome.java
│   │           │   ├── WelcomeWithThreeMessages.java
│   │           │   ├── exercises/
│   │           │       ├── Exercise_01_01.java
│   │           └── Chapter02/
│   │               ├── ComputeArea.java
│   │               ├── exercises/
│   ├── test/
│       └── java/
│           └── org/example/
│               ├── Chapter01/
│               │   └── exercises/
│               │       ├── Exercise_01_01Test.java
│               └── Chapter02/
│                   ├── ComputeAreaTest.java
```

### **Professional Practices**
This structure mimics how real-world projects are organized, helping me:
- Learn to manage a scalable codebase as more chapters and exercises are added.
- Separate source code from test code for cleaner organization and easier navigation.
- Utilize tools like Gradle to automate builds, tests, and task execution, just like in professional environments.

### **Ongoing Updates**
As I progress through the book:
- **New Chapters**: Each chapter will be added as a new package under `org.example`.
- **Exercises Folder**: Each chapter will have an `exercises` folder to organize programming exercises separately.
- **Tests**: Unit tests will be written for all programs and exercises.
- **Custom Tasks**: Gradle will be used to create tasks for running individual programs and exercises.

This incremental approach will help me build a well-structured and comprehensive project that mirrors real-world standards.

---

## 🚦 **How to Use This Repository**
### **Prerequisites**
- Install **Java JDK** (version 21 or later).
- Install **Gradle** (optional; Gradle Wrapper is included).
- Clone this repository:
  ```bash
  git clone https://github.com/EazyW96/Gradle-java-repo.git
  cd Gradle-java-repo
  ```

### **Building the Project**
Run the following command from the root directory to compile the code:
```bash
gradlew build
```

### **Running Programs**
Custom Gradle tasks are set up for specific programs. For example:
```bash
gradlew :app:runExercise_01_01
```

### **Running Tests**
To verify program correctness:
```bash
gradlew :app:test
```

---

## 🌟 **What I’m Learning**
1. **Gradle**: Writing custom tasks, managing dependencies, and automating builds.
2. **Java Programming**: Core concepts like loops, methods, and OOP principles.
3. **Testing with JUnit**: Writing and automating unit tests.
4. **Version Control**: Professional workflows with Git and GitHub.

---

## 🎯 **Future Goals**
- Complete and structure all chapters and exercises from the book.
- Add advanced features like multi-module Gradle builds.
- Integrate continuous integration (CI) with GitHub Actions.
- Refactor code for readability and performance as I learn more.

---

## 🖇 **Follow My Progress**
This project is a learning journey, and I’ll continue updating the repository as I progress through the book. Feel free to clone, explore, and learn with me!

---

## 📜 **License**
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.






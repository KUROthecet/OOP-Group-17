# Seventeen’s Store

[![Java 21](https://img.shields.io/badge/Java-21-blue)](https://www.oracle.com/java/)  
[![JavaFX 21](https://img.shields.io/badge/JavaFX-21-green)](https://openjfx.io/)  
[![Maven](https://img.shields.io/badge/Maven-3.8.8-orange)](https://maven.apache.org/)  
[![License: MIT](https://img.shields.io/badge/License-MIT-lightgrey)](LICENSE)

---

## Table of Contents

1. [Project Overview](#project-overview)  
2. [Features](#features)  
3. [Technologies](#technologies)  
4. [Project Structure](#project-structure)  
5. [Setup & Run](#setup--run)  
6. [Usage](#usage)  
7. [Contributing](#contributing)  
8. [License](#license)

---

## Project Overview

Seventeen’s Store is a Java-based web application developed for an Object-Oriented Programming (OOP) course assignment.  
It functions as an online computer store with a modern JavaFX UI, integrated chatbot powered by the Gemini API, and a RESTful database backend for product management.

---

## Features

- **Product Catalog**: Browse a range of computer models with detailed specs.  
- **Search & Filter**: Advanced search by model, price range, CPU, RAM, and more.  
- **Chatbot Support**: Real-time customer assistance via Gemini API chatbot.  
- **Responsive UI**: Sleek and responsive interface built with JavaFX.  
- **Database Integration**: CRUD operations through a local REST API.

---

## Technologies

| Technology            | Version     | Purpose                           |
|-----------------------|-------------|-----------------------------------|
| Java                  | 21          | Core programming language         |
| JavaFX                | 21          | User interface framework          |
| Maven                 | 3.8.x       | Build & dependency management     |
| Jackson               | 2.15.2      | JSON serialization/deserialization|
| OkHttp                | 4.10.0      | HTTP client                       |
| Gemini API            | —           | Chatbot backend                   |
| IntelliJ IDEA CE      | —           | Integrated development environment|

---

## Project Structure

```text
UI-main [javafx-ui]
├── .idea
├── pom.xml
└── src
    └── main
        ├── java
        │   └── application
        │       ├── model
        │       │   ├── ChatMessage.java
        │       │   ├── Product.java
        │       │   └── Review.java
        │       ├── service
        │       │   ├── ChatbotService.java
        │       │   ├── GeminiService.java
        │       │   ├── ProductClient.java
        │       │   └── ProductService.java
        │       └── ui
        │           ├── common
        │           │   └── LabelFactory.java
        │           ├── components
        │           │   ├── ChatbotPanelFactory.java
        │           │   ├── ChatBubbleFactory.java
        │           │   ├── NavBarFactory.java
        │           │   ├── ProductCardFactory.java
        │           │   └── SearchFormFactory.java
        │           └── layout
        │               └── Main.java
        └── resources
            └── style.css


Setup & Run
Clone the repository

bash
Copy
Edit
git clone https://github.com/your-repo/seventeens-store.git
cd seventeens-store
Build & install dependencies

bash
Copy
Edit
mvn clean install
Configure Database

Ensure your local REST API is running at http://localhost:8081/api/building.

Verify connectivity before launching the app.

Set API Key

Open GeminiService.java.

Replace the placeholder API_KEY constant with your Gemini API key.

Run the Application

Via Maven

bash
Copy
Edit
mvn javafx:run
Via IntelliJ IDEA

Open the project, locate application.layout.Main, and click Run.

Usage
Navigate: Use the top NavBar to switch pages.

Search: Enter keywords (model, brand) in the search field.

Filter: Click Filter to apply advanced filters (price, specs).

Chat: Click the 💬 Chat button to open the chatbot.

Details: Hover over product cards for specs and user reviews.

Contributing
Contributions are welcome! Please follow these steps:

Fork this repository.

Create a new branch (feature/your-feature or fix/issue-number).

Commit your changes and push to your fork.

Open a Pull Request with a clear description of your changes.

License
This project is licensed under the MIT License. See the LICENSE file for details.

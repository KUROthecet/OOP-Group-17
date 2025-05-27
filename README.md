Seventeen's Store - Computer Sales Website
Project Overview
This project is a Java-based web application developed as an assignment for the Object-Oriented Programming (OOP) course. It is an online store specializing in computer sales, featuring a user-friendly interface, an integrated chatbot powered by the Gemini API for customer support, and database connectivity for product management. The project is built using the free version of IntelliJ IDEA.
Features

Product Browsing: Users can explore a catalog of computers with detailed specifications.
Search and Filter: Advanced search and filtering options to find products based on specific needs.
Chatbot Support: Integrated chatbot using the Gemini API to answer user queries.
Responsive Interface: Modern and intuitive UI built with JavaFX.
Database Integration: Fetches product data from a local database API.

Technologies Used

Java 21: Core programming language.
JavaFX 21: For building the graphical user interface.
Maven: Dependency management and build automation.
Jackson 2.15.2: JSON serialization and deserialization.
OkHttp 4.10.0: HTTP request handling.
Gemini API: Powers the chatbot functionality.
IntelliJ IDEA (Community Edition): IDE used for development.

Project Structure
The project follows a standard Maven structure with the following key directories and files:
UI-main [javafx-ui]
├── .idea
├── src
│   └── main
│       ├── java
│       │   └── application
│       │       ├── model
│       │       │   ├── ChatMessage.java
│       │       │   ├── Product.java
│       │       │   └── Review.java
│       │       ├── service
│       │       │   ├── ChatbotService.java
│       │       │   ├── GeminiService.java
│       │       │   ├── ProductClient.java
│       │       │   └── ProductService.java
│       │       └── ui
│       │           ├── common
│       │           │   └── LabelFactory.java
│       │           ├── components
│       │           │   ├── ChatbotPanelFactory.java
│       │           │   ├── ChatBubbleFactory.java
│       │           │   ├── NavBarFactory.java
│       │           │   ├── ProductCardFactory.java
│       │           │   └── SearchFormFactory.java
│       │           └── layout
│       │               └── Main.java
│       └── resources
│           └── style.css
└── pom.xml

Setup Instructions
To set up and run the project locally, follow these steps:

Clone the Repository:
git clone https://github.com/your-repo/seventeens-store.git
cd seventeens-store


Install Dependencies:Ensure Maven is installed, then run:
mvn install


Set Up the Database:

The application connects to a local database API at http://localhost:8081/api/building.
Ensure the database server is running and accessible.


Configure API Key:

The chatbot uses the Gemini API, which requires an API key.
The key is currently hardcoded in GeminiService.java as AIzaSyCOmuIjXZN--2VqFpbpiX1sKPKeL3U6fuk. Verify its validity or replace it with your own key.


Run the Application:

Using Maven:mvn javafx:run


Alternatively, open the project in IntelliJ IDEA and run the Main class.



Usage

Navigation: Use the navigation bar to return to the homepage.
Search: Enter keywords in the search field to find products by model.
Filter: Click the "Filter" button to access and apply advanced filters.
Chatbot: Click the "💬 Chat" button to interact with the chatbot for assistance.
Product Details: Hover over product cards to view detailed specifications and reviews.

Contributing
We welcome contributions! To contribute, please follow these steps:

Fork the repository.
Create a new branch for your feature or bug fix.
Commit your changes and push them to your fork.
Submit a pull request with a detailed description of your changes.

License
This project is licensed under the MIT License. See the LICENSE file for details.

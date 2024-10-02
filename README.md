Spring Boot Application
Prerequisites
Before running the application, ensure that you have the following installed:

Java 21 or later

Download Java
Maven (for building the project)

Download Maven
Git (for cloning the repository)

Download Git
Getting Started
1. Clone the Repository
First, clone the repository to your local machine using Git:

bash
Copy code
git clone https://github.com/shri29s/BitBreakersSpring.git
cd your-repository
2. Build the Project
Once inside the project directory, build the project using Maven:

bas
mvn clean install
This will compile the project and download all necessary dependencies.

3. Run the Application
You can run the Spring Boot application in one of the following ways:

a. Using Maven
bash
mvn spring-boot:run
b. Running the JAR file
If the build was successful, you can run the generated JAR file located in the target/ directory:

bash
java -jar target/your-application-name.jar
4. Access the Application
Once the application is running, you can access it by opening your browser and navigating to:

http://localhost:8080
Configuration
You can customize various aspects of the application by modifying the application.properties or application.yml file in the src/main/resources/ directory.

Running Tests
To run unit tests, use the following Maven command:

bash
mvn test

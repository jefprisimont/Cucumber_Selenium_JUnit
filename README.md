## 1. Project Title
Web UI Automation Framework.

## 2. Project Description
This project aims to create a UI automation framework for testing web applications using Selenium, Java, Cucumber, and Gradle. 
The framework supports functional testing with positive, negative, and boundary test scenarios.

## 3. Features
1. Positive, negative, and boundary testing.
2. Selenium WebDriver integration for UI testing.
3. Use of Cucumber for BDD (Behavior-Driven Development).
4. Dependency and build management using Gradle.
5. Automated testing done through JUnit.
6. Implementing the Page Object Model.

## 4. Technologies Used
1. Java
2. Selenium WebDriver
3. Cucumber
4. JUnit
5. Gradle

## 5. Installation
```
# Clone repository
git clone https://github.com/jefprisimont/Web_UI_Automation.git

# Navigate to project directory
cd project-name

# Build the project
./gradlew build

# Run tests
./gradlew webTest
```

## 6. Project Structure
```
my-project/
│
├── src/
│   ├─ test/
│      └── java/
│      │    └── com/
│      │        └── jefri/
│      │            ├── page/
│      │            │   ├── HomePage.java
│      │            │   └── LoginPage.java
│      │            ├── stepdef/
│      │            │   ├── CucumberHooks.java
│      │            │   ├── HomeStepDef.java
│      │            │   └── LoginStepDef.java
│      │            ├── BaseTest.java
│      │            └── CucumberTest.java
│      │
│      └── resources
│          └── login.feature
│
└── build.gradle
```
**File Description:** <br>
1. **src/test/java/com/jefri/page/HomePage.java**: Page Object for the main page, defining elements and actions relevant to this page.
2. **src/test/java/com/jefri/page/LoginPage.java**: Page Object for the login page, defining login elements and actions such as username input, password input, and login button.
3. **src/test/java/com/jefri/stepdef/CucumberHooks.java**: Contains @Before and @After hooks for settings before and after each Cucumber scenario is executed.
4. **src/test/java/com/jefri/stepdef/HomeStepDef.java**: Step definitions for interacting with the main page (HomePage).
5. **src/test/java/com/jefri/stepdef/LoginStepDef.java**: Step definitions for interacting with the login page (LoginPage).
6. **src/test/java/com/jefri/BaseTest.java**: Base class for setting general test settings such as driver initialization and teardown.
7. **src/test/java/com/jefri/CucumberTest.java**: Class for running Cucumber tests with the @RunWith(Cucumber.class).
8. **src/test/resources/login.feature**: Feature file containing Cucumber test scenario for login.
9. **build.gradle**: Gradle configuration file that includes required dependencies such as Cucumber, Selenium/WebDriver, and JUnit.

## 7. Usage
1. To run all tests:
```
./gradlew clean webTest
```
2. To run a test based on tags:
```
./gradlew clean webTest @positive
```

## 8. Test Scenarios
1. Positive Case: A scenario tested according to normal expectations.
2. Negative Case: A scenario tested to check the system's response to incorrect input or situations.
3. Boundary Case: A scenario that tests the limits of the input (e.g. minimum and maximum values).

## 9. Test Results
"Test results show that all test scenarios (positive, negative, and boundary) were successful (PASSED)."
![test_result]()


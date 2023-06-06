# P1 My Game List

## Introduction


The MyGameList management system is a full-stack application that allows users to add and manage there favorite games to there list. User's will be allowed leave reviews and ratings for these games as well as other games they have played. Users will also be able to create wishlists. Based on all user's game list, there will be a multiple Top100s based on ratings, wishlists, and reocurring game on users list to determine the most popular games. The application will be developed using Spring Boot for the backend and Angular for the frontend.


## User Stories

- **As a user**, I want to register/login to my account
- **As a user**, I want to view my profile and update creditentials to my account
- **As a user**, I want to manage my game list by adding games, deleting games.
- **As a user**, I want to search for games based on genre, name, price.
- **As a user**, I want to add games to my wishlist. 
- **As a user**, I want to review and rate the games on my list as well as other games I've played. 
- **As a user**, I want to modify my review and rating as well as delete my review. 
- **As a user**, I want to view my lists as well as other list. 
- **As a user**, I want to view be able to private my list so that only I can access the list. 
- **As a user**, I want to view popular games (Top100s)


## MVP (Minimum Viable Product)

- User registration and login
- Browsing and searching for games
- Adding games to your list. 
- Modify my list
- Add games to my wish list. 
- Modify games to my wish list. 
- Leave reviews and ratings for games. 
- Modify Reviews
- View my profile containing my lists and ratings. 
- View other user's list.
- View popular games (Top100s). 
- Implement an Admin Role that can delete accounts and add/modify current game choices. 
- 
## Stretch Goals

- Be to able to chat with other users (live chat/discussion board/direct messaging). 
- Create a prefence game feature based on games within user's list.


## Tech Stacks

- **Java**: The main programming language used for building the application.
- **PostgreSQL**: Used as the database to store user, product, and order data.
- **Maven**: Used for managing project dependencies.
- **JUnit**: A testing framework for Java applications, used to ensure our code works as expected.
- **Log4j**: A logging utility for debugging purposes.
- **JDBC (Java Database Connectivity)**: An API for connecting and executing queries on the database.
- **BCrypt**: A Java library for hashing and checking passwords for security.
- **JUnit, Mockito, and PowerMock**: Used for unit and integration testing.
- **Postman**: Used for unit and integration testing.
- **Angular**: Develop the frontend using Angular, including components, services, and routing
- **Public API**: Steam API
- **Spring Boot**: Build RESTful APIs using Spring Boot to handle backend operations
- **Git and GitHub**: Used for version control.

## Requirements

- **Clean Codebase**: All code should be clean and well-documented. The repository should not include any unnecessary files or folders such as the `target/`, `.DS_Store`, etc. All files and directories should be appropriately named and organized.

- **Database Design**: The database should be designed following the principles of the 3rd Normal Form (3NF) to ensure data integrity and efficiency. An Entity Relationship Diagram (ERD) should be included in the documentation.

- **Secure**: All sensitive user data such as passwords must be securely hashed before storing it in the database. The application should not display any sensitive information in error messages.

- **Error Handling**: The application should handle potential errors gracefully and provide clear and helpful error messages to the users.

- **Testing**: The application should have a high test coverage. Unit tests and integration tests should be implemented using JUnit, Mockito, and PowerMock.

- **Version Control**: The application should be developed using a version control system, preferably Git, with regular commits denoting progress.

- **Documentation**: The repository should include a README file with clear instructions on how to run the application. Code should be well-commented to allow for easy understanding and maintenance.

- **Scalable**: The design of the application should be scalable, allowing for easy addition of new features or modifications in the future.

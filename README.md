# hello
# Java MySQL Database Connection Project

This project demonstrates a simple Java application that connects to a MySQL database, retrieves data from a table, and displays it. The application uses JDBC (Java Database Connectivity) for database interactions.

## Prerequisites

Before running the project, ensure you have the following installed on your system:

1. Java Development Kit (JDK) - version 8 or later
2. MySQL Server
3. MySQL Connector/J (JDBC Driver)

## Setting Up the Project

1. **MySQL Database Setup:**

   - Start your MySQL server.
   - Create a database named `lion`.
   - Create a table named `lb` in the `lion` database with the following structure:

     ```sql
     CREATE TABLE lb (
         sno INT PRIMARY KEY,
         name VARCHAR(50)
     );
     ```

   - Insert some sample data into the `lb` table:

     ```sql
     INSERT INTO lb (sno, name) VALUES (1, 'Lion'), (2, 'Tiger'), (3, 'Leopard');
     ```

2. **Java Project Setup:**

   - Create a new Java project and include the MySQL Connector/J library in your project's classpath. You can download the connector from [here](https://dev.mysql.com/downloads/connector/j/).

## Project Structure



# ATM Management System - Java Swing Application

## Overview
This ATM Management System is a desktop application developed using Java Swing for the frontend and SQL for the backend. It provides a user-friendly interface to perform various ATM-related operations, including account balance inquiries, cash withdrawals, deposits, and account transfers.

## Features
1. **Account Balance Inquiry:**
   - Users can check their account balance securely.

2. **Cash Withdrawals:**
   - Convenient functionality for withdrawing cash from the ATM.

3. **Deposits:**
   - Users can deposit funds into their accounts through the ATM.

4. **Account Transfers:**
   - Facilitates the transfer of funds between accounts.

## Technologies Used
- **Frontend:**
  - Java Swing

- **Backend:**
  - SQL (Structured Query Language)

## Project Structure
The application is structured to separate frontend and backend components.

1. **Frontend (Java Swing):**
   - GUI classes and components for the ATM interface.
   - Event handling for user interactions.

2. **Backend (SQL):**
   - Database schema to store account information.
   - SQL queries for CRUD (Create, Read, Update, Delete) operations.

## Setup and Configuration
1. **Frontend (Java Swing):**
   - Import the project into an IDE that supports Java.
   - Run the main Java class to start the ATM application.

2. **Backend (SQL):**
   - Set up a SQL database (e.g., MySQL).
   - Execute the SQL scripts provided to create the necessary tables and initial data.

## Database Schema
The SQL database includes a table named `accounts` with the following structure:

```sql
CREATE TABLE accounts (
    account_number INT PRIMARY KEY,
    account_holder VARCHAR(255) NOT NULL,
    balance DECIMAL(10, 2) NOT NULL
);
```

## Usage
1. Launch the ATM application.
2. Enter the account number and follow on-screen instructions.
3. Perform various transactions such as balance inquiry, cash withdrawal, deposit, and account transfer.

## Conclusion
This ATM Management System combines the simplicity of Java Swing for the frontend with the reliability of SQL for backend data storage. It provides an intuitive interface for users to interact with their accounts and perform common ATM operations.

For further details and code implementation, refer to the source code in the repository. If you encounter any issues or have suggestions for improvement, feel free to contribute to the project.

## Contributors
- [Your Name]
- [Contributor 1]
- [Contributor 2]

## License
This project is licensed under the [MIT License](LICENSE.md).

Enjoy using the ATM Management System!

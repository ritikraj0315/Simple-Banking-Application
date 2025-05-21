# Simple Bank System

A lightweight Java console application that simulates basic banking operations with a clean, user-friendly interface.

![Java](https://img.shields.io/badge/Java-11%2B-orange)
![License](https://img.shields.io/badge/License-MIT-blue)

## 📝 Overview

Simple Bank System is a console-based Java application that demonstrates core banking functionality through a straightforward implementation. The project serves as both an educational tool for learning Java programming concepts and a functional simulation of basic banking operations.

## ✨ Features

- **Account Management**: Create and manage bank accounts with unique account numbers
- **Transactions**: Make deposits and withdrawals with real-time balance updates
- **Balance Inquiries**: Check account details and current balance
- **Account Listing**: View all accounts in the system
- **Input Validation**: Robust error handling for all user inputs
- **User-Friendly Interface**: Clear menu system and intuitive operation

## 🚀 Getting Started

### Prerequisites
- Java Development Kit (JDK) 11 or higher

### Installation and Running

1. Clone this repository:
   ```bash
   git clone https://github.com/yourusername/simple-bank-system.git
   cd simple-bank-system
   ```

2. Compile the Java file:
   ```bash
   javac SimpleBankSystem.java
   ```

3. Run the application:
   ```bash
   java SimpleBankSystem
   ```

## 📋 Usage

The application provides a menu-driven interface with the following options:

1. **Create New Account** - Set up a new bank account with customer details
2. **Deposit Money** - Add funds to an existing account
3. **Withdraw Money** - Remove funds from an account
4. **Check Balance** - View account details and current balance
5. **List All Accounts** - Display all accounts in the system
6. **Exit** - Close the application

### Example Flow:

```
===== SIMPLE BANK SYSTEM =====
1. Create New Account
2. Deposit Money
3. Withdraw Money
4. Check Balance
5. List All Accounts
6. Exit
============================
Enter your choice: 1

--- Create New Account ---
Enter account holder name: John Doe
Enter initial deposit amount: $1000

Account created successfully!
Your account number is: ACC1001

Account Information:
Account Number: ACC1001
Account Holder: John Doe
Current Balance: $1000.0
```

## 🧩 Code Structure

The entire application is contained in a single Java file (`SimpleBankSystem.java`) with two main components:

1. **Main Class (SimpleBankSystem)**: Handles the user interface and system operations
2. **Inner Class (Account)**: Encapsulates account data and related operations

The system uses a HashMap for in-memory storage of account information and includes comprehensive input validation.

## 🔍 Implementation Details

- **Account Storage**: In-memory using HashMap (account number as key)
- **Unique IDs**: Auto-generated sequential account numbers
- **Error Handling**: Comprehensive input validation and error messages
- **User Interface**: Console-based menu system with clear prompts

## 🛠️ Future Enhancements

Potential improvements for future versions:

- Account types (Savings, Checking)
- Transaction history
- Interest calculation
- Fund transfers between accounts
- Persistent data storage (file or database)
- Authentication system
- Graphical user interface

## 📚 Educational Value

This project demonstrates several programming concepts:

- Object-oriented design
- Data encapsulation
- Input validation and error handling
- Collection framework (HashMap)
- User interface development
- Financial transaction logic

## 📄 License

This project is licensed under the MIT License - see the LICENSE file for details.

## 👤 Author

Ritik Raj - [ritik.raj@itsritik.com](mailto:ritik.raj@itsritik.com)

---

*This project was developed as part of a college programming course assignment.*

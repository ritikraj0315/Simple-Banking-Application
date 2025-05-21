import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SimpleBankSystem {
    
    private static class Account {
        private String accountNumber;
        private String holderName;
        private double balance;
        
        public Account(String accountNumber, String holderName, double initialBalance) {
            this.accountNumber = accountNumber;
            this.holderName = holderName;
            this.balance = initialBalance;
        }
        
        public String getAccountNumber() {
            return accountNumber;
        }
        
        public String getHolderName() {
            return holderName;
        }
        
        public double getBalance() {
            return balance;
        }
        
        public void deposit(double amount) {
            if (amount <= 0) {
                System.out.println("Error: Deposit amount must be positive.");
                return;
            }
            balance += amount;
            System.out.println("Deposited: INR " + amount);
            System.out.println("New Balance: INR " + balance);
        }
        
        public void withdraw(double amount) {
            if (amount <= 0) {
                System.out.println("Error: Withdrawal amount must be positive.");
                return;
            }
            if (amount > balance) {
                System.out.println("Error: Insufficient funds.");
                return;
            }
            balance -= amount;
            System.out.println("Withdrawn: INR " + amount);
            System.out.println("New Balance: INR " + balance);
        }
        
        public void displayInfo() {
            System.out.println("\nAccount Information:");
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Holder: " + holderName);
            System.out.println("Current Balance: INR " + balance);
        }
    }
    
    private static Map<String, Account> accounts = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);
    private static int accountCounter = 1000;
    
    public static void main(String[] args) {
        boolean running = true;
        
        System.out.println("Welcome to Simple Bank System!");
        
        while (running) {
            displayMenu();
            int choice = getIntInput("Enter your choice: ");
            
            switch (choice) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    checkBalance();
                    break;
                case 5:
                    listAllAccounts();
                    break;
                case 6:
                    running = false;
                    System.out.println("Thank you for using Simple Bank System!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        
        scanner.close();
    }
    
    private static void displayMenu() {
        System.out.println("\n===== SIMPLE BANK SYSTEM =====");
        System.out.println("1. Create New Account");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Check Balance");
        System.out.println("5. List All Accounts");
        System.out.println("6. Exit");
        System.out.println("============================");
    }
    
    private static void createAccount() {
        System.out.println("\n--- Create New Account ---");
        String name = getStringInput("Enter account holder name: ");
        double initialDeposit = getDoubleInput("Enter initial deposit amount: INR ");
        
        if (initialDeposit < 0) {
            System.out.println("Error: Initial deposit cannot be negative.");
            return;
        }
        
        String accountNumber = generateAccountNumber();
        Account newAccount = new Account(accountNumber, name, initialDeposit);
        accounts.put(accountNumber, newAccount);
        
        System.out.println("\nAccount created successfully!");
        System.out.println("Your account number is: " + accountNumber);
        newAccount.displayInfo();
    }
    
    private static String generateAccountNumber() {
        return "ACC" + (++accountCounter);
    }

    private static void deposit() {
        System.out.println("\n--- Deposit Money ---");
        Account account = findAccount();
        
        if (account == null) {
            return;
        }
        
        double amount = getDoubleInput("Enter deposit amount: INR ");
        account.deposit(amount);
    }
    
    private static void withdraw() {
        System.out.println("\n--- Withdraw Money ---");
        Account account = findAccount();
        
        if (account == null) {
            return;
        }
        
        double amount = getDoubleInput("Enter withdrawal amount: INR ");
        account.withdraw(amount);
    }
    
    private static void checkBalance() {
        System.out.println("\n--- Check Balance ---");
        Account account = findAccount();
        
        if (account == null) {
            return;
        }
        
        account.displayInfo();
    }
    
    private static void listAllAccounts() {
        System.out.println("\n--- All Accounts ---");
        
        if (accounts.isEmpty()) {
            System.out.println("No accounts found.");
            return;
        }
        
        for (Account account : accounts.values()) {
            account.displayInfo();
            System.out.println("--------------------");
        }
        System.out.println("Total accounts: " + accounts.size());
    }
    
    private static Account findAccount() {
        String accountNumber = getStringInput("Enter account number: ");
        Account account = accounts.get(accountNumber);
        
        if (account == null) {
            System.out.println("Error: Account not found.");
            return null;
        }
        
        return account;
    }
    
    private static int getIntInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
    }
    
    private static double getDoubleInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
    }
    
    private static String getStringInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }
}
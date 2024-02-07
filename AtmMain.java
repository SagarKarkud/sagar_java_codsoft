import java.util.Scanner;

class AtmMachine {
    private double balance;

    public AtmMachine(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. Current balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Current balance: " + balance);
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
        }
    }
}

class ATM {
    private AtmMachine account;

    public ATM(AtmMachine account) {
        this.account = account;
    }

    public void displayMenu() {
        System.out.println("\nATM Menu:");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }

    public void performTransaction(int choice, Scanner scanner) {
        switch (choice) {
            case 1:
                System.out.println("Current Balance: " + account.getBalance());
                break;
            case 2:
                System.out.print("Enter deposit amount: ");
                double depositAmount = scanner.nextDouble();
                account.deposit(depositAmount);
                break;
            case 3:
                System.out.print("Enter withdrawal amount: ");
                double withdrawalAmount = scanner.nextDouble();
                account.withdraw(withdrawalAmount);
                break;
            case 4:
                System.out.println("Thank you for using the ATM. Goodbye!");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
}

public class AtmMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();

        AtmMachine bankAccount = new AtmMachine(initialBalance);
        ATM atm = new ATM(bankAccount);

        while (true) {
            atm.displayMenu();
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            atm.performTransaction(choice, scanner);
        }
    }
}


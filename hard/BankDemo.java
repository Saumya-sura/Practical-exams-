import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) throws IllegalArgumentException {
        if (amount < 0) {
            throw new IllegalArgumentException("Deposit amount cannot be negative.");
        }
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance for withdrawal.");
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }

    public double getBalance() {
        return balance;
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount(0);
        while (true) {
            System.out.println("\n1. Deposit\n2. Withdraw\n3. Check Balance\n4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter deposit amount: ");
                        double dep = sc.nextDouble();
                        account.deposit(dep);
                        break;
                    case 2:
                        System.out.print("Enter withdrawal amount: ");
                        double wd = sc.nextDouble();
                        account.withdraw(wd);
                        break;
                    case 3:
                        System.out.println("Current Balance: " + account.getBalance());
                        break;
                    case 4:
                        System.out.println("Thank you for using the bank!");
                        return;
                    default:
                        System.out.println("Invalid option.");
                }
            } catch (InsufficientBalanceException | IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

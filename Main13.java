package codes;

abstract class BankAccount11 {
    double balance;

    public BankAccount11(double balance) {
        this.balance = balance;
    }

    abstract void withdraw(double amount);

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

class CheckingAccount extends BankAccount11 {
    public CheckingAccount(double balance) {
        super(balance);
    }

    @Override
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}

class SavingsAccount11 extends BankAccount11 {
    public SavingsAccount11(double balance) {
        super(balance);
    }

    @Override
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}

public class Main13 {
    public static void main(String[] args) {
        BankAccount11 checking = new CheckingAccount(1000);
        checking.deposit(500);
        checking.withdraw(300);
        checking.displayBalance();

        BankAccount11 savings = new SavingsAccount11(2000);
        savings.deposit(1000);
        savings.withdraw(2500);
        savings.displayBalance();
    }
}

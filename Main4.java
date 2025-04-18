package codes;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Insufficient funds for withdrawal");
        }
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= 100) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal denied. Balance must remain above $100");
        }
    }
}

public class Main4 {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(500);
        myAccount.deposit(200);
        myAccount.withdraw(100);
        System.out.println("Balance: $" + myAccount.getBalance());

        SavingsAccount mySavingsAccount = new SavingsAccount(500);
        mySavingsAccount.deposit(200);
        mySavingsAccount.withdraw(550);  // This should succeed
        mySavingsAccount.withdraw(600);  // This should be denied because balance would fall below $100
        System.out.println("Balance: $" + mySavingsAccount.getBalance());
    }
}

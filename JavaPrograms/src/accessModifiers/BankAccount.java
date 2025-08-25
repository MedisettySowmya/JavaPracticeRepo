package accessModifiers;

public class BankAccount {
	    private double balance;  // Only accessible inside BankAccount

	    public BankAccount(double initialBalance) {
	        balance = initialBalance;
	    }

	    public void deposit(double amount) {
	        if (amount > 0) balance += amount;
	    }

	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) balance -= amount;
	    }

	    public double getBalance() {
	        return balance;
	    }
	}


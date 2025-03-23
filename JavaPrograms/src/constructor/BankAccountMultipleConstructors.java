package constructor;

public class BankAccountMultipleConstructors {

    String accountHolder;
    String accountType;
    double balance;

    // Default Constructor
    public BankAccountMultipleConstructors() {
        accountHolder = "Unknown";
        accountType = "Savings";
        balance = 0.0;
        // this("Unknown", "Savings", 0.0);

    }

    // Parameterized Constructor 1
    public BankAccountMultipleConstructors(String holder, String type) {
        accountHolder = holder;
        accountType = type;
        balance = 0.0;
        // this(holder, type, 0.0);
    }

    // Parameterized Constructor 2
    public BankAccountMultipleConstructors(String holder, String type, double initialBalance) {
        accountHolder = holder;
        accountType = type;
        balance = initialBalance;
    }

    public BankAccountMultipleConstructors(BankAccountMultipleConstructors another)
    {
    	this.accountHolder=another.accountHolder;
    	this.accountType=another.accountType;
    	this.balance=another.balance;
    }
    public void showAccountDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: $" + balance);
    }

    public static void main(String[] args) {
    	BankAccountMultipleConstructors account1 = new BankAccountMultipleConstructors();
    	BankAccountMultipleConstructors account2 = new BankAccountMultipleConstructors("John Doe", "Checking");
    	BankAccountMultipleConstructors account3 = new BankAccountMultipleConstructors("Jane Smith", "Savings", 5000.00);
    	BankAccountMultipleConstructors account4 = new BankAccountMultipleConstructors(account3);
    	
        System.out.println("\nDefault Constructor:");
        account1.showAccountDetails();

        System.out.println("\nParameterized Constructor (2 args):");
        account2.showAccountDetails();

        System.out.println("\nParameterized Constructor (3 args):");
        account3.showAccountDetails();
        
        System.out.println("\nCopy Constructor");
        account4.showAccountDetails();
    }
}


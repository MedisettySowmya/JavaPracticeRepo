package constructor;

public class BankAccount {

    String accountHolder;
    String accountType;
    double balance;

    // Parameterized Constructor
    public BankAccount(String holder, String type, double initialBalance) {
        accountHolder = holder;
        accountType = type;
        balance = initialBalance;
    }

    public void showAccountDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: $" + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("John Doe", "Savings", 5000.00);
        account.showAccountDetails();
    }
}

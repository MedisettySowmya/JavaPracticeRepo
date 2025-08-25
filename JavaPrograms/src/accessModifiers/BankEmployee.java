package accessModifiers;


public class BankEmployee {
    protected void approveLoan(String customerName) {
        System.out.println("Loan approved for: " + customerName);
    }
}


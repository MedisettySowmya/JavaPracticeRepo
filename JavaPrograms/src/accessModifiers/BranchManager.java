package accessModifiers;


//In another file, possibly in another package
public class BranchManager extends BankEmployee {
 public void processLoan(String customerName) {
     approveLoan(customerName);  //  Accessible due to inheritance
 }
}


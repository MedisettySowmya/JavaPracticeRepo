package accessModifiers;

import accessModifierPackage2.CustomerDetails;

public class CustomerPortal extends CustomerDetails{
	
	

	public static void main(String[] args) {
		BankAccount account = new BankAccount(10000);
		//account.balance=10000; --The field BankAccount.balance is not visible
		account.deposit(5000);
		account.withdraw(3000);
		System.out.println("Your account balance is: " + account.getBalance() );
		
		BankService service = new BankService();
		service.openAccount("Sowmya");
		
		BranchManager manager = new BranchManager();
		manager.approveLoan("Sowmya");
		
		TransactionLogger logger = new TransactionLogger ();
		logger.log("Transaction completed.");
		
		CustomerDetails customer = new CustomerDetails();
		CustomerPortal customerportal = new CustomerPortal();
        //customer.getCustomerAddress("221B Baker Street, London");  -- cannot be accessable default modifier cannnot access other package 
        customer.showCustomerInfo("Nina", 29);      //  public
        customerportal.getCustomerAccountType("Gold"); // ❌ protected – not subclass
        //customer.getCustomerAddress("Mumbai");   // ❌ default – different package
        //customer.getCustomerPAN("ZZZ0000X");     // ❌ private – inaccessible


		

	}

}

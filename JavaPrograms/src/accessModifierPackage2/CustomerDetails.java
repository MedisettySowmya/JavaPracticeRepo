package accessModifierPackage2;

public class CustomerDetails {

    private void getCustomerPAN(String panNumber) {
        System.out.println("Customer PAN: " + panNumber);
    }

    void getCustomerAddress(String address) {  // default
        System.out.println("Customer Address: " + address);
    }

    protected void getCustomerAccountType(String type) {
        System.out.println("Account Type: " + type);
    }

    public void showCustomerInfo(String name, int age) {
        System.out.println("Customer Name: " + name);
        System.out.println("Customer Age: " + age);
        getCustomerPAN("ABCDE1234F");  // ✅ private access within class
    }
}

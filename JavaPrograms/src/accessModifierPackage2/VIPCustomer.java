package accessModifierPackage2;

public class VIPCustomer {
    public static void main(String[] args) {

        CustomerDetails customerDeatials = new CustomerDetails();

        customerDeatials.showCustomerInfo("Rohit", 35);       //  public – accessible anywhere
        customerDeatials.getCustomerAddress("Delhi");         //  default – accessible in same package
        customerDeatials.getCustomerAccountType("Premium");   //  protected – accessible in same package
        // vipCustomer.getCustomerPAN("XYZ12345Z");      ❌ private – not accessible outside class
    }
}

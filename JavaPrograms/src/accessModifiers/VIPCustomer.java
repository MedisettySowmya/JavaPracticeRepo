package accessModifiers;


import accessModifierPackage2.CustomerDetails;

public class VIPCustomer extends CustomerDetails {

    public void displayInfo() {
        showCustomerInfo("Rohit", 35);             //  public
        getCustomerAccountType("Premium Plus");    // protected – subclass access
        // getCustomerAddress("Delhi");            ❌ default – not accessible across packages
        // getCustomerPAN("XYZ12345Z");            ❌ private – never accessible
    }
}


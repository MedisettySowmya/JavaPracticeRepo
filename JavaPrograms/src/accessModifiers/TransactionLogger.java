package accessModifiers;


//Accessible only within the same package (e.g., package: bank)
class TransactionLogger {
 void log(String message) {
     System.out.println("[LOG] " + message);
 }
}

package constructor;

public class DefaultConstructorExample {

    String message;

    // Default Constructor
    public DefaultConstructorExample() {
        message = "Hello, this is a default constructor!";
    }

    public void displayMessage() {
        System.out.println(message);
    }

    public static void main(String[] args) {
        DefaultConstructorExample obj = new DefaultConstructorExample();
        obj.displayMessage();
    }
}

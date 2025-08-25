package generics;

public class MainClass {
    public static void main(String[] args) {

        // String example
        DataHolder<String> configHolder = new DataHolder<>("RegressionSuite");
        configHolder.printDataType();

        // Integer example
        DataHolder<Integer> retryHolder = new DataHolder<>(3);
        retryHolder.printDataType();

        // Double example
        DataHolder<Double> timeoutHolder = new DataHolder<>(15.5);
        timeoutHolder.printDataType();

        // Custom object example
        User user = new User("Sowmya", "QA Engineer");
        DataHolder<User> userHolder = new DataHolder<>(user);
        userHolder.printDataType();
    }
}

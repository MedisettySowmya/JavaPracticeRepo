package generics;
public class User {
    private String name;
    private String role;

    public User(String name, String role) {
        this.name = name;
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{name='" + name + "', role='" + role + "'}";
    }
}

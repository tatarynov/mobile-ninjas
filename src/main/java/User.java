public class User {

    private String name = "Vitalii";
    public static String role = "QA";

    public User() {

    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String changeRole() {
        role = "SDET";
        return role;
    }
}

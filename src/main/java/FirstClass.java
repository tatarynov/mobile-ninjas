public class FirstClass {

    // sout = generates System.out.println();

    public static void main(String[] args) {
        User user = new User("Vitalii");
        User secondUser = new User("Vasia");

        String string = "Changed text";
        String secondString = "Mobile-ninjas rule!";

        user.setName(string);
        secondUser.setName(secondString);

        System.out.println(user.getName());
        System.out.println(secondUser.getName());
        System.out.println(User.role);

        User.changeRole();
    }
}

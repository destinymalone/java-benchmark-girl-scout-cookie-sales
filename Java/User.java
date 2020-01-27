import java.util.*;

class User extends Store {
    public User(String string) {
        super(string);
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args, char[] cookies) {
        Scanner input = new Scanner(System.in); // Create a Scanner object
        System.out.println("Yes/No");

        String output = input.nextLine(); // Read user input

        if (output == "Yes") {
            System.out.println(cookies);
        } else {
            System.out.println("Have a great day! ");
        }

        input.close();

    }
}
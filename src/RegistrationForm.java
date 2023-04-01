import java.util.Scanner;

public class RegistrationForm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the registration form!");
        System.out.print("Enter your first name: ");
        String firstName = input.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = input.nextLine();

        System.out.print("Enter your email address: ");
        String email = input.nextLine();

        System.out.print("Enter a password: ");
        String password = input.nextLine();

        System.out.print("Confirm your password: ");
        String confirmPassword = input.nextLine();

        if (password.equals(confirmPassword)) {
            System.out.println("Registration successful!");
            System.out.println("Name: " + firstName + " " + lastName);
            System.out.println("Email: " + email);
        } else {
            System.out.println("Passwords do not match. Registration failed.");
        }
    }
}

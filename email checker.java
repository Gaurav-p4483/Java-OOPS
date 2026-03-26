import java.util.Scanner;

class EmailChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept email from user
        System.out.print("Enter your email: ");
        String email = sc.nextLine();

        // Remove extra spaces
        email = email.trim();

        // Check if it contains "@gmail.com"
        if (email.contains("@gmail.com")) {
            System.out.println("Valid Gmail Address");
        } else {
            System.out.println("Invalid Email");
        }

        sc.close();
    }
}
import java.util.Scanner;

class Resort {
    int RNo;
    String Name;
    float Charges;
    int Days;

    // Compute amount
    float Compute() {
        float amount = Days * Charges;

        if (amount > 11000) {
            amount = (float) (1.02 * amount); // 2% extra
        }

        return amount;
    }

    // Get input from user
    void Getinfo() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Room Number: ");
        RNo = sc.nextInt();
        sc.nextLine(); // clear buffer

        System.out.print("Enter Customer Name: ");
        Name = sc.nextLine();

        System.out.print("Enter Charges per day: ");
        Charges = sc.nextFloat();

        System.out.print("Enter Number of Days: ");
        Days = sc.nextInt();
    }

    // Display information
    void DispInfo() {
        float amount = Compute();

        System.out.println("\n--- Resort Details ---");
        System.out.println("Room Number: " + RNo);
        System.out.println("Customer Name: " + Name);
        System.out.println("Charges per Day: " + Charges);
        System.out.println("Number of Days: " + Days);
        System.out.println("Total Amount: " + amount);
    }
}

// Main class
public class ResortDemo {
    public static void main(String[] args) {
        Resort r = new Resort();

        r.Getinfo();
        r.DispInfo();
    }
}
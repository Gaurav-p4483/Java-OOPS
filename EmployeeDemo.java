import java.util.Scanner;

class Employee {
    int empno;
    String ename;
    float basic, hra, da;
    float netpay;

    // Function to calculate net pay
    float Calculate() {
        netpay = basic + hra + da;
        return netpay;
    }

    // Function to take input
    void havedata() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Number: ");
        empno = sc.nextInt();
        sc.nextLine(); // clear buffer

        System.out.print("Enter Employee Name: ");
        ename = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        basic = sc.nextFloat();

        System.out.print("Enter HRA: ");
        hra = sc.nextFloat();

        System.out.print("Enter DA: ");
        da = sc.nextFloat();

        // Call calculate method
        Calculate();
    }

    // Function to display data
    void dispdata() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("Employee No: " + empno);
        System.out.println("Employee Name: " + ename);
        System.out.println("Basic Salary: " + basic);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Net Pay: " + netpay);
    }
}

// Main class
public class EmployeeDemo {
    public static void main(String[] args) {
        Employee e = new Employee();

        e.havedata();
        e.dispdata();
    }
}
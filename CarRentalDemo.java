import java.util.Scanner;

class CARRENTAL {
    int CarId;
    String CarType;
    float Rent;

    // Method to get car details
    void GetCar(int id, String type) {
        CarId = id;
        CarType = type;
    }

    // Method to calculate rent
    float GetRent() {
        if (CarType.equalsIgnoreCase("Small Car")) {
            Rent = 1000;
        } else if (CarType.equalsIgnoreCase("Van")) {
            Rent = 800;
        } else if (CarType.equalsIgnoreCase("SUV")) {
            Rent = 2500;
        } else {
            Rent = 0;
        }
        return Rent;
    }

    // Method to display details
    void ShowCar() {
        System.out.println("Car ID: " + CarId);
        System.out.println("Car Type: " + CarType);
        System.out.println("Rent: " + Rent);
    }
}

public class CarRentalDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CARRENTAL car = new CARRENTAL();

        System.out.print("Enter Car ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // clear buffer

        System.out.print("Enter Car Type (Small Car / Van / SUV): ");
        String type = sc.nextLine();

        car.GetCar(id, type);
        car.GetRent();
        car.ShowCar();

        sc.close();
    }
}
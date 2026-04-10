class Student {
    int id;
    String name;

    // Constructor
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Override toString() method
    @Override
    public String toString() {
        return "Student ID: " + id + ", Name: " + name;
    }
}

public class Main2 {
    public static void main(String[] args) {
        // Create object of Student class
        Student s1 = new Student(101, "Gaurav");

        // Display object details using toString()
        System.out.println(s1); // Automatically calls toString()
    }
}
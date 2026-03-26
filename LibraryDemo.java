import java.util.ArrayList;
import java.util.Scanner;

// Book class
class Book {
    String title;
    String author;
    String ISBN;

    // Constructor
    Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    // Display book details
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
        System.out.println();
    }
}

// Library class
class Library {
    ArrayList<Book> books = new ArrayList<>();

    // Add book
    void addBook(String title, String author, String isbn) {
        books.add(new Book(title, author, isbn));
        System.out.println("Book added successfully!\n");
    }

    // Remove book by ISBN
    void removeBook(String isbn) {
        boolean found = false;

        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).ISBN.equals(isbn)) {
                books.remove(i);
                System.out.println("Book removed successfully!\n");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Book not found!\n");
        }
    }

    // Display all books
    void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.\n");
            return;
        }

        System.out.println("\nLibrary Books:\n");
        for (Book b : books) {
            b.display();
        }
    }
}

// Main class
public class LibraryDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Library lib = new Library();
        int choice;

        do {
            System.out.println("===== Library Menu =====");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Display Books");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // IMPORTANT

            switch (choice) {

                case 1:
                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();

                    System.out.print("Enter ISBN: ");
                    String isbn = sc.nextLine();

                    lib.addBook(title, author, isbn);
                    break;

                case 2:
                    System.out.print("Enter ISBN to remove: ");
                    String removeISBN = sc.nextLine();

                    lib.removeBook(removeISBN);
                    break;

                case 3:
                    lib.displayBooks();
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!\n");
            }

        } while (choice != 4);

        sc.close();
    }
}
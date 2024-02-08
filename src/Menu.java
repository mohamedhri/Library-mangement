import java.util.List;
import java.util.Scanner;

public class Menu {
    public void displayOptions() {
        System.out.println("__________________________");
        System.out.println("***BOOK MANAGEMENT MENU***");
        System.out.println("--------------------------");
        System.out.println("    1. Add a book");
        System.out.println("    2. Remove a book");
        System.out.println("    3. Search for books");
        System.out.println("    4. Show list of books");
        System.out.println("    5. Borrow a book");
        System.out.println("    6. Add a student");
        System.out.println("    7. Show list of students");
        // Add more options as needed
        System.out.println("    0. Exit");
    }

    public int collectUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        return scanner.nextInt();
    }

    public void showListOfBooks(List<Book> books) {
        System.out.println("List of Books:");
        for (Book book : books) {
            System.out.println("Title: " + book.title);
            System.out.println("Author: " + book.author);
            System.out.println("ISBN: " + book.isbn);
            System.out.println("Publication Date: " + book.publicationDate);
            System.out.println("Borrower: " + (book.currentBorrower != null ? book.currentBorrower.name : "Not borrowed"));
            System.out.println("------------------------");
        }
    }

    public void showListOfStudents(List<Student> students) {
        System.out.println("List of Students:");
        for (Student student : students) {
            System.out.println("Name: " + student.name);
            System.out.println("Address: " + student.address);
            System.out.println("ID: " + student.idNumber);
            System.out.println("------------------------");
        }
    }
}

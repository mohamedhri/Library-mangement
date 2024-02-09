import java.util.List;
import java.util.Scanner;

public class Menu {
    public void displayOptions() {
        System.out.println("__________________________");
        System.out.println(" ***BOOK MANAGEMENT MENU***");
        System.out.println("--------------------------");
        System.out.println("   1. Add a book");
        System.out.println("   2. Show list of books");
        System.out.println("   3. Search for books");
        System.out.println("   4. Remove a book");
        System.out.println("   5. Borrow a book");
        System.out.println("   6. Modify Book Details");
        System.out.println("    0. Exit");
    }

    public int collectUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        return choice;
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



    public void modifyDetails(Book book) { Scanner scanner = new Scanner(System.in);
        System.out.print("Enter new title: ");
        String newTitle = scanner.next();
        System.out.print("Enter new author: ");
        String newAuthor = scanner.next();
        System.out.print("Enter new ISBN: ");
        String newIsbn = scanner.next();
        System.out.print("Enter new publication date YYYY/MM/DD: ");
        String newPublicationDate = scanner.next();

        book.modifyDetails(newTitle, newAuthor, newIsbn, newPublicationDate);
        System.out.println("Book details modified successfully!");
    }

}

import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main (String [] args){
        Library library = new Library();
        Menu menu = new Menu();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            menu.displayOptions();
            int choice = menu.collectUserInput();

            switch (choice) {
                case 1 :

                    System.out.println("Enter the  book title : ");
                    String title = scanner.nextLine();
                    System.out.println("Enter the author name : ");
                    String author = scanner.nextLine();
                    System.out.println("Enter the isbn : ");
                    String isbn = scanner.nextLine();
                    System.out.println("Enter the publication date YYYY/MM/DD : ");
                    String publicationDate = scanner.nextLine();
                    Book newBook = new Book(title , author , isbn , publicationDate);
                    library.addBook(newBook);
                    System.out.println("Book added successfully . ");
                    break;

                case 2 :
                    menu.showListOfBooks(library.books);
                    break;


                case 3 :
                    System.out.println("Enter the ISBN to search for: ");
                    String searchISBN = scanner.next();
                    List<Book> searchResults = library.searchBooksByISBN(searchISBN);

                    if (searchResults.isEmpty()) {
                        System.out.println("No book found!");
                    } else {
                        menu.showListOfBooks(searchResults);
                    }
                    break;
                case 4 :
                    System.out.println("Enter the ISBN of the book you wanna remove :");
                    String isbnToRemove = scanner.next();
                    for (Book book : library.books){
                        if(book.isbn.equals(isbnToRemove)){
                            library.removeBook(book);
                            System.out.println("You removed the book successfully");
                        }
                    }
                    break;
                case 5 :
                    System.out.print("Enter ISBN of the book to borrow: ");
                    String isbnToBorrow = scanner.next();

                    Book bookToBorrow = null;
                    for (Book book : library.books) {
                        if (book.isbn.equals(isbnToBorrow)) {
                            bookToBorrow = book;
                            break;
                        }
                    }

                    if (bookToBorrow != null) {
                        System.out.print("Enter your name: ");
                        scanner.nextLine();
                        String studentName = scanner.nextLine();
                        System.out.print("Enter your address: ");
                        String studentAddress = scanner.nextLine();
                        System.out.print("Enter your ID: ");
                        String studentId = scanner.next();

                        Student borrower = null;
                        for (Student student : library.students) {
                            if (student.idNumber.equals(studentId)) {
                                borrower = student;
                                break;
                            }
                        }

                        if (borrower == null) {
                            borrower = new Student(studentName, studentAddress, studentId);
                            library.students.add(borrower);
                        }

                        borrower.borrowBook(bookToBorrow);

                        bookToBorrow.currentBorrower = borrower;

                        System.out.println("Book borrowed successfully!");
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;
                case 6:
                    System.out.print("Enter ISBN of the book to modify: ");
                    String isbnToModify = scanner.next();

                    for (Book book : library.books) {
                        if (book.isbn.equals(isbnToModify)) {
                            menu.modifyDetails(book);
                        }
                    }
                    break;

                case 0 :
                    System.exit(0);
                    break;
                default :
                    System.out.println("Invalid choice !!!!!");

            }
        }
    }
}
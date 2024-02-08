import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main (String [] args){
        Library library = new Library();
        Menu menu = new Menu();
        Scanner scanner = new scanner(system.in);

        while (true) {
            menu.displayOptions();
            int choice = menu.collectUserInput;

            switch (choice) {
                case 1 :
                    System.out.println("Enter the  book title : ");
                    String title = scanner.nextln();
                    System.out.println("Enter the author name : ");
                    String author = scanner.nextln();
                    System.out.println("Enter the isbn : ");
                    String isbn = scanner.next();
                    System.out.println("Enter the publication date : ");
                    String publicationDate = scanner.next();
                    Book newBook = new Book(title , author , isbn , publicationDate);
                    library.addBook(newBook);
                    System.out.println("Book added successfully . ");
                    break;
                case 2 :
                    System.out.println("Enter the ISBN of the book you wanna remove :");
                    String isbnToRemove = scanner.next();
                    for (Book book : library.books){
                        if(book.isbn.equals(isbnToRemove)){
                            library.removeBook(book);
                            System.out.println("You removed the book successfully");
                        }
                    }
                    break;
                case 3 :
                    System.out.println("Enter the Search Query :");
                    String searchQuery = scanner.next();
                    List<Book> searchResults = library.searchBooks(searchQuery);

                    if (searchResults.isEmpty()){
                        System.out.println("No boos found !");
                    }
                    else {
                        menu.showListOfBooks(searchResults);
                    }
                    break;
                case 4 :
                    menu.showListOfBooks(library.books);
                    break;
                case 5 :
                    System.out.print("Enter ISBN of the book to borrow: ");
                    String isbnToBorrow = scanner.next();
                    for (Book book : library.books) {
                        if (book.isbn.equals(isbnToBorrow)) {
                            System.out.print("Enter student ID: ");
                            String studentId = scanner.next();
                            Student borrower = findStudentById(library.students, studentId);

                            if (borrower != null) {
                                borrower.borrowBook(book);
                            } else {
                                System.out.println("Student not found.");
                            }
                            break;
                        }
                    }
                    Break;
                case 6 :
                    System.out.print("Enter student name: ");
                    String studentName = scanner.nextLine();
                    System.out.print("Enter student address: ");
                    String studentAddress = scanner.nextLine();
                    System.out.print("Enter student ID: ");
                    String studentId = scanner.next();

                    Student newStudent = new Student(studentName, studentAddress, studentId);
                    library.students.add(newStudent);

                    System.out.println("Student added successfully!");
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
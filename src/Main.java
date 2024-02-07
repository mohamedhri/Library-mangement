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
                        menu.showListOfBooks(searchResults)
                    }
                    break;
                    
            }
        }
    }
}
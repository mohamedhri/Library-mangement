
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.List;
public class Student {
    public String name;
    public String address ;
    public String idNumber ;
    public List<Book> borrowedBooks;

    public Student (String name, String address, String idNumber){
        this.name = name;
        this.address = address;
        this.idNumber = idNumber;
        this.borrowedBooks =  new ArrayList<>();
    }
    public void borrowBook(Book book) {
        if (book.currentBorrower == null) {
            borrowedBooks.add(book);
            book.currentBorrower = this;
            System.out.println(name + " borrowed the book: " + book.getTitle());
        } else {
            System.out.println("The book is already borrowed by another student.");
        }
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
        book.currentBorrower = null;
        System.out.println(name + " returned the book: " + book.getTitle());
    }
}
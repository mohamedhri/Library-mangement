import java.util.ArrayList;
import java.util.List;

public class Library {
    public List<Book> books;
    public List<Student> students;

    public Library() {
        this.books = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public List<Book> searchBooksByISBN(String isbn) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                result.add(book);
            }
        }
        return result;
    }

}

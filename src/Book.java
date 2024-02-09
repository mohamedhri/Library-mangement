
public class Book {
    public String title;
    public String author;
    public String isbn;
    public String publicationDate;
    public Student currentBorrower;

    public Book(String title, String author, String isbn, String publicationDate) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publicationDate = publicationDate;
        this.currentBorrower = null;
    }

    public void modifyDetails(String title, String author, String isbn, String publicationDate) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publicationDate = publicationDate;
    }

    public String getTitle() {
        return title;
    }}




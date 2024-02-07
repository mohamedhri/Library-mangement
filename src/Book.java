public class Book {
    public string title;
    public string author;
    public string isbn;
    public string publicationDate;
    public student currentBorrower;

    public Book(String title, String author,String isbn, String publicationDate){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publicationDate = publicationDate;

    }
    public void modifyDetails(String title, String author, String isbn, String publicationDate){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publicationDate = publicationDate;
    }
    public String getTitle() {
        return title;
    }

    }

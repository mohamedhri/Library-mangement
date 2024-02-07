import com.sun.javaws.jnl.LibraryDesc;

import java.util.ArrayList;

public class Student {
    public String name;
    public String address ;
    public String idNumber ;
    Public List <Book> borrowedBooks;

    public Student (String name, String address, String idNumber){
        this.name = name;
        this.adress = adress;
        this.idNumber = idNumber;
        this.borrowedBooks =  new ArrayList<>();
    }
}
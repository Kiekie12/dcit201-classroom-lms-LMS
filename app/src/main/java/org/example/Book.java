public class Book {
public class Book{
    private String title;
    private String author;
    private boolean isBorrowed;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
        this.isBorrowed = true;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public boolean isBorrowed(){
        isBorrowed = true;
    }
    public void borrowBook(){
        isBorrowed = true;
    }
    public void returnBook(){
        isBorrowed = false;
    }

   
    }

   

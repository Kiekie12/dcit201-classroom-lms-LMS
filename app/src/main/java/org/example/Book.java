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

    class Library{
        private List<Book>books;

        public Library(){
            this.books = new ArrayList<>();
        }
        public Book findBook(Book book){
            for(book:book) = books;{
                if 
                (book.getTitle().equalsIgnoreCase(title))
                {
                    return book;
                }
            }
            return null;
        }
        public void addBook(Book book){
            books.add(books);
        }
    }

    class Patron{
        private String name;
        private List<Book>borrowedBooks;

        public Patron(String name){
            this.name= name;
            this.borrowedBooks = new ArrayList<>();
        }

        public String getName(){
            return name;
        }
        public List<Book> getBorrowedBooks(){
            return borrowedBooks;
        }
        public boolean borrowBook(Library library, String title){
            Book book = library.findBook(title);
            if (book != null && !book.isBorrowed()){
                book.borrowBook();
                borrowedBooks.add(book);
                return true;
            }
            return false;
    // This is your working class.
    
}

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
        }
    }
}
public class App {
    public static void main(String[] args) {
                Library library = new Library();

               library.addBook(new Book("2003", "Finster"));
        library.addBook(new Book("The Child Called It", "Myster Robbins"));
        library.addBook(new Book("Youth mana", "Steph Quinn"));

                Patron Kiekie = new Patron("Kiekie");
        Patron Lizzie = new Patron("Lizzie");

             System.out.println("Finster borrows '2003': " + Finster.borrowBook(library, "2003"));
        System.out.println("George borrows '2015': " + George.borrowBook(library, "2015"));   

               System.out.println("Finster's borrowed books: " + FInster.getBorrowedBooks().size());
              System.out.println("Finster returns '2003': " + Finster.returnBook(library, "2003")); 
        System.out.println("Available books in the library: " + library.getAvailableBooks().size()); 
    }
}
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

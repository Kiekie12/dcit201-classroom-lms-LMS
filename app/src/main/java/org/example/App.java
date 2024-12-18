/*
 * This should be your main class where all your objects will be created
 */
package org.example;

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

/*
 * This should be your main class where all your objects will be created
 */
package org.example;

public class App {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("1984", "George Orwell", 1949);
        Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);

        library.addBook(book1);
        library.addBook(book2);

        Patron patron1 = new Patron("Alice");
        Patron patron2 = new Patron("Bob");

        library.addPatron(patron1);
        library.addPatron(patron2);

        System.out.println("Library Books:");
        library.listBooks();

        patron1.borrowBook(book1);
        patron2.borrowBook(book1);

        patron1.returnBook(book1);
        patron2.borrowBook(book1);

        System.out.println("\nLibrary Books After Operations:");
        library.listBooks();
    }
}


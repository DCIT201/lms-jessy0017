import java.util.ArrayList;

public class Patron {
    private String name;
    private ArrayList<Book> borrowedBooks;

    public Patron(String name) {
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBook(Book book) {
        if (!book.isCheckedOut()) {
            book.setCheckedOut(true);
            borrowedBooks.add(book);
            System.out.println(name + " borrowed: " + book.getTitle());
        } else {
            System.out.println("Sorry, " + book.getTitle() + " is already checked out.");
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            book.setCheckedOut(false);
            borrowedBooks.remove(book);
            System.out.println(name + " returned: " + book.getTitle());
        } else {
            System.out.println(name + " doesn't have this book.");
        }
    }

    @Override
    public String toString() {
        return "Patron: " + name + " | Borrowed Books: " + borrowedBooks.size();
    }
}

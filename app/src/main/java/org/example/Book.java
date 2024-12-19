public class Book {
    private String title;
    private String author;
    private int yearPublished; // Add yearPublished attribute
    private boolean isCheckedOut;

    // Updated constructor to match the test
    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.isCheckedOut = false; // default to false
    }

    // Getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    @Override
    public String toString() {
        return "Book: " + title + " by " + author + " (" + yearPublished + ")" + (isCheckedOut ? " (Checked Out)" : " (Available)");
    }
}

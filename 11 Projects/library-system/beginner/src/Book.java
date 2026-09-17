
public  class Book {

    private final int id;
    private final String title;
    private final String author;
    private boolean borrowed;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.borrowed = false;
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public boolean isBorrowed() { return borrowed; }

    public  void markAsBorrowed() {
        if (this.borrowed) {
            throw new IllegalStateException("Book is already borrowed: " + title);
        }
        this.borrowed = true;
    }

    public  void markAsReturned() {
        if (!this.borrowed) {
            throw new IllegalStateException("Book is not currently borrowed: " + title);
        }
        this.borrowed = false;
    }

    @Override 
    public String toString() {
        String status = borrowed ? "BORROWED" : "AVAILABLE";
        return String.format("[%3d] %-25s by %-20s | %s", id, title, author, status);
    }
}
import java.util.ArrayList;
import java.util.List;

public class Member {

    private static final int MAX_BORROW_LIMIT = 3;
    private final int id;
    private final String name;
    private final List<Book> borrowedBooks;

    public Member(int id, String name) {
        this.id = id;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getBorrowCount() { return borrowedBooks.size(); }
    public int getBorrowLimit() { return MAX_BORROW_LIMIT; }

    public boolean hasReachedLimit() {
        return borrowedBooks.size() >= MAX_BORROW_LIMIT;
    }

    public boolean hasBorrowed(Book book) {
        return borrowedBooks.contains(book);
    }

    public boolean borrowBook(Book book) {
        if (book == null) {
            throw new IllegalArgumentException("Cannot borrow a null book.");
        }

        if (hasReachedLimit()) {
            return  false;
        }

        if (borrowedBooks.contains(book)) {
            return false;
        }

        borrowedBooks.add(book);
        return  true;

     }

    public  boolean returnBook(Book book) {

        if (book == null) {
            throw new IllegalArgumentException("Cannot return a null book.");
        }

        if (!borrowedBooks.contains(book)) {
            return false;
        }

        borrowedBooks.remove(book);
        return true;
    }

    public List<Book> getBorrowedBooks() {
        return new ArrayList<>(borrowedBooks);
    }

    @Override 
    public String toString() {
        return String.format("[%3d] %-20s | Borrowed: %d/%d", id, name, borrowedBooks.size(), MAX_BORROW_LIMIT);
    }
}
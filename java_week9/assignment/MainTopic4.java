import java.util.ArrayList;
import java.util.List;

class Book implements Cloneable {
    String title;

    Book(String title) {
        this.title = title;
    }

    @Override
    protected Book clone() throws CloneNotSupportedException {
        return (Book) super.clone();
    }

    @Override
    public String toString() {
        return title;
    }
}

class Library implements Cloneable {
    List<Book> books;

    Library() {
        books = new ArrayList<>();
    }

    void addBook(Book book) {
        books.add(book);
    }

    // Shallow clone
    @Override
    protected Library clone() throws CloneNotSupportedException {
        Library cloned = (Library) super.clone();
        cloned.books = this.books; // shallow copy
        return cloned;
    }

    // Deep clone
    protected Library deepClone() throws CloneNotSupportedException {
        Library cloned = (Library) super.clone();
        cloned.books = new ArrayList<>();
        for (Book book : this.books) {
            cloned.books.add(book.clone());
        }
        return cloned;
    }

    @Override
    public String toString() {
        return books.toString();
    }
}

public class MainTopic4 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Library lib = new Library();
        lib.addBook(new Book("Java Basics"));
        lib.addBook(new Book("Data Structures"));

        Library shallow = lib.clone();
        Library deep = lib.deepClone();

        // Modify cloned objects
        shallow.books.get(0).title = "Modified Java"; // affects original
        deep.books.get(1).title = "Modified DS";      // doesn't affect original

        System.out.println("Original Library: " + lib);
        System.out.println("Shallow Clone: " + shallow);
        System.out.println("Deep Clone: " + deep);
    }
}

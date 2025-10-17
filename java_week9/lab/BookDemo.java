// File: BookDemo.java
class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Override equals() to compare content
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // same reference
        if (!(obj instanceof Book)) return false; 
        Book other = (Book) obj;
        return title.equals(other.title) && author.equals(other.author);
    }

    @Override
    public String toString() {
        return "Book[Title: " + title + ", Author: " + author + "]";
    }
}

public class BookDemo {
    public static void main(String[] args) {
        Book b1 = new Book("1984", "George Orwell");
        Book b2 = new Book("1984", "George Orwell");
        Book b3 = b1;

        System.out.println("b1 == b2: " + (b1 == b2)); // reference comparison
        System.out.println("b1.equals(b2): " + b1.equals(b2)); // content comparison
        System.out.println("b1 == b3: " + (b1 == b3)); // same reference
    }
}

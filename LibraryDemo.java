import java.io.*;
import java.util.*;

// Encapsulated Book class
class Book {
    private String title;
    private String author;
    private int id;

    // Constructor
    public Book(String title, String author, int id) {
        this.title = title;
        this.author = author;
        this.id = id;
    }

    // Getters (Encapsulation)
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getId() {
        return id;
    }

    // Display book details
    public void display() {
        System.out.println("ID: " + id + ", Title: " + title + ", Author: " + author);
    }
}

// Library class
class Library {
    private List<Book> books;

    // Constructor
    public Library() {
        books = new ArrayList<>();
    }

    // Add book
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    // Search book by title
    public Book searchBook(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                return b;
            }
        }
        return null;
    }

    // Display all books
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in library.");
        } else {
            for (Book b : books) {
                b.display();
            }
        }
    }

    // Save books to file (File I/O)
    public void saveToFile(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Book b : books) {
                writer.write(b.getId() + "," + b.getTitle() + "," + b.getAuthor());
                writer.newLine();
            }
            System.out.println("Books saved to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Load books from file (File I/O)
    public void loadFromFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            books.clear(); // Clear existing list
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                int id = Integer.parseInt(parts[0]);
                String title = parts[1];
                String author = parts[2];
                books.add(new Book(title, author, id));
            }
            System.out.println("Books loaded from file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

// Driver class
public class LibraryDemo {
    public static void main(String[] args) {
        Library library = new Library();

        // Add books
        library.addBook(new Book("The Alchemist", "Paulo Coelho", 1));
        library.addBook(new Book("1984", "George Orwell", 2));
        library.addBook(new Book("Clean Code", "Robert C. Martin", 3));

        // Display books
        library.displayBooks();

        // Search book
        Book found = library.searchBook("1984");
        if (found != null) {
            System.out.println("Book found:");
            found.display();
        } else {
            System.out.println("Book not found.");
        }

        // Save to file
        library.saveToFile("library.txt");

        // Load from file
        Library newLibrary = new Library();
        newLibrary.loadFromFile("library.txt");
        newLibrary.displayBooks();
    }
}

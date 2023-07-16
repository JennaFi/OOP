package HW_1;

import java.util.ArrayList;

public class Task_3 {
    public static void main(String[] args) {
        Book book1 = new Book("Щегол", "Донна Тарт", true);
        Book book2 = new Book("Тайная история", "Донна Тарт", true);
        Book book3 = new Book("Война и Мир", "Лев Толстой", true);
//        ArrayList<Book> catalog = new ArrayList<>();
        Library library = new Library();
        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();

        library.addBook(book2);
        library.addBook(book1);
        library.addBook(book3);
        library.displayAvailableBooks();
        library.searchByAuthor("Донна Тарт");





    }
}

class Book {
    private String title;
    private String author;

    private boolean available;
    public Book(String title, String author, boolean available) {
        this.title = title;
        this.author = author;
        this.available = available;

    }

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

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    void displayInfo() {
        System.out.println("Title: " + title + ", by " + author + ", is available: " + available);
    }
}

class Library {
    static int count;
    ArrayList<Book> catalog = new ArrayList<>();


    public void addBook(Book book) {
        catalog.add(book);
        count++;
    }

    public void removeBook(Book book) {
        catalog.remove(book);
        count--;
    }

    public void displayAvailableBooks() {
        System.out.println("List of available books: " );
        for (Book i: catalog) {
            if (i.isAvailable() == true) {

                System.out.println(" " + i.getTitle() + " " + i.getAuthor());
            }
        }


    }

    public int searchByAuthor(String author) {
        int res = 0;
        String name;

        for (int i = 0; i < catalog.size(); i++) {
            Book book = catalog.get(i);
            name = book.getAuthor();
            if (name.contains(author)) {
                System.out.println(book.getTitle() + " " + book.getAuthor());
                res++;
            }

        }
        return res;

    }
}
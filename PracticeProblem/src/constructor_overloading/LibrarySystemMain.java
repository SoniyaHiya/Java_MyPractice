package constructor_overloading;

class LibrarySystem {

    String title;
    String author;

    LibrarySystem(String title) {
        this.title = title;
        this.author = "Unknown";
    }

    LibrarySystem(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void showInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println();
    }
}

public class LibrarySystemMain {

    public static void main(String[] args) {

        LibrarySystem b1 = new LibrarySystem("Clean Code");
        LibrarySystem b2 = new LibrarySystem("Effective Java", "Soniya Mubasshir");

        b1.showInfo();
        b2.showInfo();
    }
}
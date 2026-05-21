package java_inheritance;

class Person {
    int id;
    String name;

    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void displayPerson() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

class Books {
    int bookId;
    String bookName;
    String bookAuthor;
    String yearOfPub;
    float price;
    String status;

    Books(int bookId, String bookName, String bookAuthor,
          String yearOfPub, float price, String status) {

        this.bookId = bookId;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.yearOfPub = yearOfPub;
        this.price = price;
        this.status = status;
    }

    void addNewBooks() {
        System.out.println(bookName + " book added successfully.");
    }

    void deleteBooks() {
        System.out.println(bookName + " book deleted.");
    }

    void displayBookDetails() {
        System.out.println("\n Book Details ");
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + bookAuthor);
        System.out.println("Year Of Publication: " + yearOfPub);
        System.out.println("Price: " + price);
        System.out.println("Status: " + status);
    }

    void inquiryBook() {
        System.out.println(bookName + " book inquiry completed.");
    }
}

class Librarian extends Person {

    Librarian(int id, String name) {
        super(id, name);
    }

    void searchBook(String name) {
        System.out.println(name + " book found in library.");
    }

    boolean verifyMember(int id) {

        if (id > 0) {
            return true;
        } else {
            return false;
        }
    }

    void orderBooks() {
        System.out.println("Books ordered successfully.");
    }

    void sellBooks() {
        System.out.println("Books sold successfully.");
    }
}

class Publisher {
    int id;
    String name;
    String address;
    int phoneNo;

    Publisher(int id, String name, String address, int phoneNo) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
    }

    void addPub() {
        System.out.println("Publisher added successfully.");
    }

    void modifyPub() {
        System.out.println("Publisher modified successfully.");
    }

    void deletePub() {
        System.out.println("Publisher deleted successfully.");
    }

    void orderStatus() {
        System.out.println("Order status checked.");
    }
}

class User extends Person {

    String userAddress;
    int phoneNo;

    User(int id, String name, String userAddress, int phoneNo) {
        super(id, name);
        this.userAddress = userAddress;
        this.phoneNo = phoneNo;
    }

    void returnBooks() {
        System.out.println(name + " returned books.");
    }

    int payFine(String dt) {
        System.out.println(name + " paid fine on " + dt);
        return 100;
    }

    void addNewUser() {
        System.out.println("New user added.");
    }

    void deleteUser() {
        System.out.println("User deleted.");
    }

    void updateDetails() {
        System.out.println("User details updated.");
    }

    void bookPurchase() {
        System.out.println(name + " purchased a book.");
    }

    void displayUser() {
        System.out.println("\n User Details ");
        displayPerson();
        System.out.println("Address: " + userAddress);
        System.out.println("Phone No: " + phoneNo);
    }
}

public class LibrarySystem {

    public static void main(String[] args) {

        Books b1 = new Books(
                101,
                "Java Programming",
                "Herbert Schildt",
                "2024",
                550.50f,
                "Available"
        );

        Librarian l1 = new Librarian(
                1,
                "Soniya"
        );

        Publisher p1 = new Publisher(
                10,
                "Tech Publisher",
                "Dhaka",
                123456
        );

        User u1 = new User(
                201,
                "Hiya",
                "Sylhet",
                987654
        );

        b1.addNewBooks();
        b1.displayBookDetails();
        b1.inquiryBook();
        b1.deleteBooks();

        System.out.println();

        l1.displayPerson();
        l1.searchBook("Java Programming");

        if (l1.verifyMember(201)) {
            System.out.println("Member Verified.");
        } else {
            System.out.println("Member Not Verified.");
        }

        l1.orderBooks();
        l1.sellBooks();

        System.out.println();

        p1.addPub();
        p1.modifyPub();
        p1.deletePub();
        p1.orderStatus();

        System.out.println();

        u1.displayUser();
        u1.addNewUser();
        u1.updateDetails();
        u1.bookPurchase();
        u1.returnBooks();

        int fine = u1.payFine("12-05-2026");
        System.out.println("Fine Amount: " + fine);

        u1.deleteUser();
    }
}
package librarysystem;

class Library {

    public static int totalBooksIssued = 0;

    private String userName;

    public Library(String userName) {
        this.userName = userName;
    }

    public void issueBook(int count) {
        totalBooksIssued += count;
        System.out.println(userName + " issued " + count + " book(s).");
    }

    public static void showTotal() {
        System.out.println("Total books issued: " + totalBooksIssued);
    }
}

public class Main {
    public static void main(String[] args) {

        Library user1 = new Library("Soniya");
        Library user2 = new Library("Hiya");

        user1.issueBook(2);
        user2.issueBook(3);

        Library.showTotal();
    }
}
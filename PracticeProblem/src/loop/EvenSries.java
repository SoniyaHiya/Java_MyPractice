package loop;

public class EvenSries {

    public static void main(String[] args) {

        System.out.println(" for loop:");
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println("\nwhile loop:");
        int i = 2;
        while (i <= 20) {
            System.out.print(i + " ");
            i += 2;
        }

        System.out.println("\n do-while loop:");
        int j = 2;
        do {
            System.out.print(j + " ");
            j += 2;
        } while (j <= 20);
    }
}
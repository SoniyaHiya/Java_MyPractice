package loop;

public class OddSeries {

    public static void main(String[] args) {

        System.out.println(" for loop:");
        for (int i = 1; i <= 19; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n while loop:");
        int i = 1;
        while (i <= 19) {
            System.out.print(i + " ");
            i += 2;
        }

        System.out.println("\n\n do-while loop:");
        int j = 1;
        do {
            System.out.print(j + " ");
            j += 2;
        } while (j <= 19);
    }
}
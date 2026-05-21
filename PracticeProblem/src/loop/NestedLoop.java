package loop;

public class NestedLoop {

    public void printPattern() {

        for (int i = 1; i <= 5; i++) {        // outer loop (rows)

            for (int j = 1; j <= i; j++) {    // inner loop (columns)
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        NestedLoop obj = new NestedLoop();
        obj.printPattern();
    }
}
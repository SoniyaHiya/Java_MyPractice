package basicmath;

import java.util.Scanner;

public class Ball {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of the ball: ");
        double radius = sc.nextDouble();

        double volume = (4.0 / 3.0) * Math.PI * radius * radius * radius;

        System.out.println("Volume of the ball: " + volume);

        sc.close();
    }
}
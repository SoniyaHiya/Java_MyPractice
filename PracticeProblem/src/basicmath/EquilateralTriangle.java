package basicmath;

import java.util.Scanner;

public class EquilateralTriangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side of equilateral triangle: ");
        double arm = sc.nextDouble();

        double area = (Math.sqrt(3) / 4) * arm * arm;

        System.out.println("Area of equilateral triangle: " + area);

        sc.close();
    }
}
package exercise2;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("r: ");
        double a = input.nextDouble();
        double C= 2*Math.PI*a;
        double A= Math.PI*a*a;

        System.out.println("Circumference: " + C + " Area: " + A);
    }

}

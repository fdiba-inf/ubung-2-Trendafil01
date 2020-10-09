package exercise2;

import java.util.Scanner;

public class EvenOrOddNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double a = input.nextDouble();
        if (a%2==0){
          System.out.println("Number is even ");
        } else {
          System.out.println("Number is odd");
        }

    }

}
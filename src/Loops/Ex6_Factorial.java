package Loops;

import java.util.Scanner;

/*
Write a program that calculates the factorial of a user-supplied integer.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/
public class Ex6_Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insert the number you wish to calculate the factorial: ");
        int factorial = scan.nextInt();

        int result = 1;

        for(int i = factorial; i >= 1; i--) {

            result = result * i;

        }
        System.out.println("Result" + result);
    }
}

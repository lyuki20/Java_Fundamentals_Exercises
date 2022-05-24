package Loops;

import java.util.Scanner;

/*
Write a program that asks for N integers,
calculate and display the number of even numbers
and the number of odd numbers.
*/
public class Ex4_EvenAndOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int howManyInt;
        int n;
        int count = 0;
        int oddCounter = 0;
        int evenCounter = 0;

        System.out.println("insert how many many N you wish to input: ");
        howManyInt = scan.nextInt();

        do {
            System.out.println("Insert a number: ");
            n = scan.nextInt();

            if (n % 2 == 0){
                evenCounter++;
            } else {
                oddCounter++;
            }

            count++;
        } while (count < howManyInt);

        System.out.println("Odd numbers inserted: " +oddCounter);
        System.out.println("Even numbers inserted: " +evenCounter);
    }

}

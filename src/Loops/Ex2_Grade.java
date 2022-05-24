package Loops;

import java.util.Scanner;

/*
Write a program that asks for a grade, between zero and ten.
Show a message if the value is invalid
and keep asking
until the user enters a valid value.
*/
public class Ex2_Grade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int grade;
        System.out.println("Insert a grade: ");
        grade = scan.nextInt();

        while(grade < 0 | grade > 10) {
            System.out.println("Nota Inválida! Digite novamente: ");
            grade = scan.nextInt();
        }
        System.out.println("Program finished.");
    }
}

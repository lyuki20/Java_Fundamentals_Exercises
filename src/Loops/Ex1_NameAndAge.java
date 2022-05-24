package Loops;

import java.util.Scanner;

/*
Write a program that reads sets of two values,
the first representing the student's name and the second representing their age.
(Stop the program by entering the value 0 in the name field)
*/
public class Ex1_NameAndAge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("Insert a name: ");
            String name = scan.next();
            if (name.equals("0")) {
                break;
            }

            System.out.println("Insert an age: ");
            int age = scan.nextInt();
        }
        System.out.println("Program finalized.");
    }

}

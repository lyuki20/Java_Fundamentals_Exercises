package Loops;

import java.util.Scanner;

/*
Develop a times tables generator,
capable of generating the multiplication table of any integer between 1 to 10.
The user must inform which number he wants to see the multiplication table.
The output should look like the example below:
5 times table:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/
public class Ex5_MultiplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int multi = 1;
        int count = 0;
        System.out.println("Insert which multiplication table you wish to consult: ");
        int tableNumber = scan.nextInt();

        do {
            System.out.println(+ tableNumber + " X " + multi + " = " + (tableNumber * multi));
            multi++;
            count++;
        } while (count < 10);
    }
}
/* For solution:

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Table: ");
        int tabuada = scan.nextInt();

        System.out.println("Table  " + table);
        for(int i = 1; i <= 10; i = i + 1) {
            System.out.println(table + " X " + i + " = " + (table*i));
        }
    }

}

 */
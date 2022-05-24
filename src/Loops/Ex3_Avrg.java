package Loops;

import java.util.Scanner;

/*
Write a program that reads 5 numbers
and report as many
and the average of those numbers.
*/
public class Ex3_Avrg {
    public static void main(String[] args) {
        calcAvrg();

    }

    public static void calcAvrg() {
        Scanner scan = new Scanner(System.in);
        int n;
        int maior = 0;
        int soma = 0;

        int count = 0;
        int count2 = 1;
        do {
            System.out.println(count2 + "th Number: ");
            n = scan.nextInt();

            soma = soma + n;

            if (n > maior) maior = n;

            count = count +1;
            count2 = count + 1;
        } while(count < 5);

        System.out.println("Maior: " + maior);
        System.out.println("Média: " + (soma/5));

    }
    }




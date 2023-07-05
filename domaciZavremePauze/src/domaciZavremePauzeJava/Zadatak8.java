package domaciZavremePauzeJava;

import java.util.Scanner;

public class Zadatak8 {
    public static void main(String[] args) {
//        Napisati program koji ce izračunati aritmetičku sredinu parnih brojeva unetih sa tastature od k do n.

        Scanner input = new Scanner(System.in);
        System.out.println("Uneti broj k: ");
        int k = input.nextInt();
        System.out.println("Uneti broj n: ");
        int n = input.nextInt();


        int sum = 0;
        int delioc = 0;


        for (int i = k; i <= n; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
                delioc++;
            }
        }
        int aritmetickaSredina = sum / delioc;
        System.out.println("Aritmeticka sredina parnih brojeva od k do n je: " + aritmetickaSredina);
    }
}

package domaciZavremePauzeJava;

import java.util.Scanner;

public class Zadatak17 {
    public static void main(String[] args) {
//        Napisati program koji ce učitati elemente i naći najveći element niza.

        Scanner input = new Scanner(System.in);
        System.out.println("Unesie duzinu niza:");
        int duzinaNiza = input.nextInt();

        int max = 0;

        int[] niz = new int[duzinaNiza];

        for (int i = 0; i < duzinaNiza; i++) {
            System.out.println("Unesi " + i + " element niza :");
            niz[i] = input.nextInt();

            if (niz[i] > max) {

                max = niz[i];
            }
        }
       System.out.println("Najveci element niza je: " + max);




    }
}

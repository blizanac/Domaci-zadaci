package domaciZavremePauzeJava;

import java.util.Scanner;

public class Zadatak14 {

    public static void main(String[] args) {
//        Napisati program za ispis prirodnih brojeva od 1 do 17 koji
//        nisu djeljivi sa proizvoljno unetim brojem.

        Scanner input = new Scanner(System.in);
        System.out.println("Unesite broj za poredjenje: ");
        int broj = input.nextInt();


        if (broj != 0) {
            for (int i = 1; i <= 17; i++) {
                if (i % broj != 0) {
                    System.out.println(i);
                }
            }

        } else {
            System.out.printf("Nevalida n unos. Broj mora biti vrci od nule.");
        }

    }
}

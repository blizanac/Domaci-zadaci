package domaciZavremePauzeJava;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
//        Napisati program koji od dva učitana broja (a, b) sa tastature nalazi veći.

        Scanner input = new Scanner(System.in);
        System.out.println("Unesite prvi broj: ");
        int prviBroj = input.nextInt();
        System.out.println("Unesite drugi broj: ");
        int drugibroj = input.nextInt();

        //Prvi nacin:

        if (prviBroj != drugibroj) {
            System.out.println("Najveci broj od dva ucitana broja je :" + Math.max(prviBroj, drugibroj));
        } else {
            System.out.println("Uneli ste brojeve koji su jednaki. Pokusajte ponovo.");
        }

        //Drugi nacin:

        if (prviBroj != drugibroj) {
            if (prviBroj > drugibroj) {
                System.out.println("Najveci broj od dva ucitana broja je: " + prviBroj);
            } else {
                System.out.println("Najveci broj od dva ucitana broja je: " + drugibroj);
            }
        } else {
            System.out.println("Uneli ste brojeve koji su jednaki. Pokusajte ponovo.");
        }
    }
}

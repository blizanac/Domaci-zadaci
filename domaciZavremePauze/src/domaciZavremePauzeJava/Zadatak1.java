package domaciZavremePauzeJava;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        //Napisati program za odredjivanje apsolutne vrednosti broja koji unesete sa tastature.

        Scanner input = new Scanner(System.in);
        System.out.println("Unesite broj: ");
        double broj = input.nextDouble();

        //Prvi nacin:

        //System.out.printf("Apsolutn  vrednost unetog broja je: %.2f",Math.abs(broj));

        //Drugi nacin:

        if (broj < 0) {
            System.out.printf("Apsolutna vrednost unetog broja je: %.2f", (broj * -1));
        } else {
            System.out.printf("Apsoultna vrednost unetog broja je: %.2f", broj);
        }
    }
}

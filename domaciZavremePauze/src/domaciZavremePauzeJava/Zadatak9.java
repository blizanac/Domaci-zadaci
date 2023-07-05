package domaciZavremePauzeJava;

import java.util.Scanner;

public class Zadatak9 {
    public static void main(String[] args) {

        //Napisati program koji ce učitati sa tastature visine za n osoba. Ispisati prosečnu i najveću visinu.


        Scanner inpout = new Scanner(System.in);
        System.out.println("Uneti broj osoba za visinu: ");
        int brojOsoba = inpout.nextInt();
        int max = 0;
        int suma = 0;

        if (brojOsoba > 0) {
            for (int i = 0; i < brojOsoba; i++) {
                System.out.println("Unesi visinu: ");
                int visina = inpout.nextInt();
                suma = suma + visina;


                if (visina > 0) {

                    if (max < visina) {
                        max = visina;
                    }

                    System.out.println("Maksimalna visina je: " + max);
                    System.out.println("Prosecna visina je: " + (suma / brojOsoba));
                } else {
                    System.out.println("Nevalidan unos, visina mora biti veca od 0 i mora biti pozitivna.");
                }
            }
        } else {
            System.out.println("Broj osoba mora biti pozitivan i veci od nule.");
        }
    }
}


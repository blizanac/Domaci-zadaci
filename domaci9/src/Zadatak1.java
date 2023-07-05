package domaci9;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
//        Napraviti paket domaci9 i klasu Zadatak1 i u njoj napraviti main metodu (public static void main...)
//        preko skenera uneti svoje ime i prezime (odvojeno) i godinu rodjenja,
//        ispisati ime i prezime i koliko godina imate.

        Scanner input = new Scanner(System.in);

        System.out.println("unesite vase ime: ");
        String ime = input.next();

        System.out.println("unesite vase prezime: ");
        String prezime = input.next();

        System.out.println("Uneti Vasu godinu rodjenja");
        int godinaRodjenja = input.nextInt();
        int godine = 2023 - godinaRodjenja;

        System.out.println(ime + " " + prezime + " " + godine);

        input.close();
    }
}

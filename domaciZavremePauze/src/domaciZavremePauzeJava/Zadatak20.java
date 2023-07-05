package domaciZavremePauzeJava;

import java.util.Scanner;

public class Zadatak20 {
    public static void main(String[] args) {

//        Kreirati metodu koja računa prizvod dva broja, vraća rezultat u main, duplira i ispisuje.

        Scanner input = new Scanner(System.in);
        System.out.println("Unesite prvi broj: ");
        int prviBroj = input.nextInt();
        System.out.println("Unesite drugi broj: ");
        int drugiBroj = input.nextInt();

        int d = 2 * proizvod(prviBroj, drugiBroj);
        System.out.println("Duplirani proizvod dava broja je: " + d);
    }

    public static int proizvod(int a, int b){

        int c=a*b;
        return c;
    }


}


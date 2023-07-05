package domaciZavremePauzeJava;

import java.util.Scanner;

public class Zadatak19 {
    public static void main(String[] args) {
//        Napisati metod za nalaženje minimuma od dva učitana broja (a, b) sa tastature.
//        Izvršiti dodeljivanje vrednosti metoda varijabli c.

        Scanner intput = new Scanner(System.in);
        System.out.println("Unesite broj a: ");
        int a = intput.nextInt();
        System.out.println("Unesite broj b: ");
        int b = intput.nextInt();

        int c = minimum(a, b);

        if (a != b) {
            System.out.println("Minimum dva uneta broja je: " + c);
        } else {
            System.out.println("Uneli ste jednake brojeve.");
        }


    }
    public static int minimum(int a, int b) {
        int d = 0;
        if (a > b) {
            d = b;
        } else if (b > a) {
            d = a;
        }

        return d;
    }


}


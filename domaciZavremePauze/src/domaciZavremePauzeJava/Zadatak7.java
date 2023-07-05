package domaciZavremePauzeJava;

import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {

//        Napisati program koji ce da nađe proizvod prirodnih
//        brojeva unetih sa tastature od a do b djeljivih sa 5 i koliko ih ima.

        Scanner input = new Scanner(System.in);
        System.out.println("Unesite broj a: ");
        int a = input.nextInt();
        System.out.println("Unesite broj b: ");
        int b = input.nextInt();

        int proizvod = 1;
        int brojac = 0;
        if (a > 0 && b > 0) {
            for (int i = a; i <= b; i++) {
                if (i % 5 == 0) {

                    brojac++;
                    proizvod = proizvod * i;

                }
            }
            System.out.println("Proizvod prirodnih brojeva od a do b deljivih sa 5 je: " + proizvod);
            System.out.println("Ukupno ima " + brojac + " brojeva deljivih sa 5.");

        } else {
            System.out.println("Ne mozete mnoziti sa 0.");
        }

    }

}

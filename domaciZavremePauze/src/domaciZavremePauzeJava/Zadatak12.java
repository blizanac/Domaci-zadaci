package domaciZavremePauzeJava;

import java.util.Scanner;

public class Zadatak12 {
//    Napisati program koji ce ispisati parne prirodne brojeve od 1 do 25 unete sa tastature.
//    Kada korisnik unese 25 zavrsava se program. (while petlja).


    public static void main(String[] args) {
        int i = 1;

        while (i < 25) {

            Scanner inport = new Scanner(System.in);
            System.out.println("Unesite broj:");
            int broj = inport.nextInt();

            if (broj % 2 == 0) {
                System.out.println(broj);
            }
            if (broj == 25) {
                System.out.println("Kraj programa.");
                break;
            }
        }
        i++;

    }
}

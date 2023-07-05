package domaci13;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
//        Napraviti metodu koja vraca boolean tip i prihvata kao parametre 2 integer-a.
//        Metoda vraća true samo ako su ta dva integer-a jedan za drugim, na primer 16 17 ili 24 25.
//        U main metodi ispisati sa println nekoliko primera kako bi ste testirali (4-5 poziva je dovoljno).

        Scanner inport = new  Scanner(System.in);
        System.out.println("Unesite broj a: ");
        int a = inport.nextInt();
        System.out.println("Unesite broj b: ");
        int b = inport.nextInt();


       boolean provera=trueOrFalse(a,b);

       if (provera){
            System.out.println( a+" "+b );
       }else {
            System.out.println("Uneti brojevi nisu jedan za drugim.");
        }

    }
    public static boolean trueOrFalse (int a, int b){

      if(a == b-1){

          return true;
      }else {
          return false;
      }
    }
}



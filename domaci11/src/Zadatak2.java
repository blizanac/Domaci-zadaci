package domaci11;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {

//        Pomocu while petlje, korisnik neprestano unosi brojeve i oni se sabiraju.
//        Kada korisnik upise 0, program ispisuje sumu prethodno unetih brojeva i program se zavrsava.


        System.out.println("Unesite broj: ");
        Scanner input=new Scanner(System.in);
        int broj=input.nextInt();
        int sum=broj;

        while(broj>0) {

        System.out.println("Unesite broj: ");
        broj = input.nextInt();
        sum = sum + broj;

        if (broj == 0) {
            System.out.println("Suma je: " + sum);
        }
    }

    }
}


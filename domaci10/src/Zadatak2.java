package domaci10;

import java.util.Scanner;

public class Zadatak2 {
//    Napraviti promenljive "username" i "password" i definisati neke vrednosti po zelji.
//    Korisnik unosi preko skenera dve vrednosti koje bi trebale da predstavljaju
//    username i password i program treba da ih uporedi. Ako su username i password tačni,
//    ispisati "Uspešno ste se ulogovali",
//    a ako je jedno od ta dva pogrešno ispisati istu poruku "Pogrešan username ili password".


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Unesite Vas username");
        String username = input.nextLine();

        System.out.println("Unesite Vas password");
        String password = input.nextLine();


        String zadati_username = "Dule1994";
        String zadati_password = "1234";


        if (username.equals(zadati_username) && password.equals(zadati_password)) {
            System.out.println("Uspesno ste se ulogovali");
        } else {
            System.out.println("Neispravan username ili password. ");
        }

        input.close();

    }
}

package domaci14;

import java.util.Scanner;
import java.util.stream.Stream;

public class Zadatak2 {
    public static void main(String[] args) {

//        Napraviti metodu koja radi konverziju valuta. Valute koje se koriste su EUR, USD, GBP.
//        Napisati konverzije preko switch-a, tako sto proveravate koju je valutu korisnik uneo kao parametar,
//        a vracate (return) u toj nekoj novoj valuti izracunatu vrednost.
//        U main-u preko skenera korisnik unosi broj dinara koji zeli da konvertuje u neku valutu,
//        i samu valutu kao string. Ispisati nekoliko primera poziva u main-u.
//        Valute su vrednosti double i njih mozete uzeti sa sajta NBS. (3-4 poziva dovoljno).

        Scanner a=new Scanner(System.in);
        System.out.println("Unesite iznos za konvertovanje u RDS-u: ");
        double rsd=a.nextDouble();
        a.nextLine();
        System.out.println("Odaberite valutu za konvertovanje: USD/EUR/GBP");
        String valuta=a.nextLine();

        System.out.println("konvertovana valita " + konvertovanje(rsd,valuta.toUpperCase()));
    }

    public static double konvertovanje ( double iznos, String valuta){



        switch (valuta){

            case "USD":
                return   iznos/106.70;
            case "EUR":
                return   iznos/117.29;
            case "GBP":
                return   iznos/133.87;
            default: return -1;
        }

    }
}

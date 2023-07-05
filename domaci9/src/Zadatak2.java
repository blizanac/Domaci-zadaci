package domaci9;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
//        Napraviti klasu Zadatak2 u okviru paketa domaci9 i uraditi konverziju celzijusa u farenhajte.
//        Korisnik unosi preko skenera temperaturu za celzijus u celobrojnoj vrednosti i program
//        ispisuje oba u formatu "31C = 87.8F", zaokruziti farenhajte na jednu decimalu.

//        tempC *1.8+32
        System.out.println("Dobro dosli u kalkulator temperature. Kalkulator konvertuje temperaturu iz temperature u Celzijusima u temperaturu u Farenhajtima.");

        Scanner input = new Scanner(System.in);

        System.out.println("Unesite temperaturu u C");
        double tempUC = input.nextDouble();

        double tempUF = tempUC * 1.8 + 32;
        //moze biti napisano i tempUF=(tempuC*1.8)+32


        System.out.printf("temperatura u Farenhajtima je %.2f%n ", tempUF);


    }


}

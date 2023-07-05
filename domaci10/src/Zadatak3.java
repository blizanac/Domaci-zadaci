package domaci10;

import java.util.Scanner;

public class Zadatak3 {

    public static void main(String[] args) {
//        Napisati program gde korisnik unese dan pa mesec rodjenja i program vrati koji je to horoskopski znak.

        Scanner input = new Scanner(System.in);
        System.out.println("Unesite dan rodjenja: ");
        int danRodjenja = input.nextInt();


        Scanner novi = new Scanner(System.in);
        System.out.println("Unesite mesec rodjenja: ");
        String mesecRodjenja = novi.nextLine();


        if (danRodjenja >= 22 && mesecRodjenja.equalsIgnoreCase("Decembar") || danRodjenja <= 20 && mesecRodjenja.equalsIgnoreCase("Januar")) {
            System.out.println("JARAC");
        } else if (danRodjenja >= 21 && mesecRodjenja.equalsIgnoreCase("Januar") || danRodjenja <= 19 && mesecRodjenja.equalsIgnoreCase("Februar")) {
            System.out.println("VODOLIJA");
        } else if (danRodjenja >= 20 && mesecRodjenja.equalsIgnoreCase("Februar") || danRodjenja <= 20 && mesecRodjenja.equalsIgnoreCase("Mart")) {
            System.out.println("RIBA");
        } else if (danRodjenja >= 21 && mesecRodjenja.equalsIgnoreCase("Mart") || danRodjenja <= 20 && mesecRodjenja.equalsIgnoreCase("April")) {
            System.out.println("OVAN");
        } else if (danRodjenja >= 21 && mesecRodjenja.equalsIgnoreCase("April") || danRodjenja <= 21 && mesecRodjenja.equalsIgnoreCase("Maj")) {
            System.out.println("BIK");
        } else if (danRodjenja >= 21 && mesecRodjenja.equalsIgnoreCase("Maj") || danRodjenja <= 21 && mesecRodjenja.equalsIgnoreCase("Jun")) {
            System.out.println("BLIZANCI");
        } else if (danRodjenja >= 22 && mesecRodjenja.equalsIgnoreCase("Jun") || danRodjenja <= 22 && mesecRodjenja.equalsIgnoreCase("Jul")) {
            System.out.println("RAK");
        } else if (danRodjenja >= 23 && mesecRodjenja.equalsIgnoreCase("Jul") || danRodjenja <= 23 && mesecRodjenja.equalsIgnoreCase("Avgust")) {
            System.out.println("LAV");
        } else if (danRodjenja >= 24 && mesecRodjenja.equalsIgnoreCase("Avgust") || danRodjenja <= 23 && mesecRodjenja.equalsIgnoreCase("Septembar")) {
            System.out.println("DEVICA");
        } else if (danRodjenja >= 24 && mesecRodjenja.equalsIgnoreCase("Septembar") || danRodjenja <= 23 && mesecRodjenja.equalsIgnoreCase("Oktobar")) {
            System.out.println("VAGA");
        } else if (danRodjenja >= 24 && mesecRodjenja.equalsIgnoreCase("Oktobar") || danRodjenja <= 22 && mesecRodjenja.equalsIgnoreCase("Novembar")) {
            System.out.println("SKORPIJA");
        } else if (danRodjenja >= 23 && mesecRodjenja.equalsIgnoreCase("Novembar") || danRodjenja <= 21 && mesecRodjenja.equalsIgnoreCase("Decembar")) {
            System.out.println("STRELAC");
        } else {
            System.out.println("Uneli ste pogresno");
        }

        input.close();


    }
}










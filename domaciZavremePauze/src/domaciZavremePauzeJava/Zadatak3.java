package domaciZavremePauzeJava;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
//        Napisati program za ispis uspeha za uneti broj sa tastature, prema sledećoj tabeli:

        Scanner input=new Scanner(System.in);
        System.out.println("Za stampu uspeha unesite ocenu: ");
        int ocena=input.nextInt();


        switch (ocena){
            case 1:
                System.out.println("Nedovoljan.");
                break;
            case 2:
                System.out.println("Dovoljan.");
                break;
            case 3:
                System.out.println("Dobar.");
                break;
            case 4:
                System.out.println("Vrlodobar.");
                break;
            case 5:
                System.out.println("Odlican.");
                break;
            default:
                System.out.println("Nevalidan unos.");

        }
    }
}

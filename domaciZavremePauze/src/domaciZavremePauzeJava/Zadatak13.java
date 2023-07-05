package domaciZavremePauzeJava;

import java.util.Scanner;

public class Zadatak13 {
    public static void main(String[] args) {
//        Napisati program za ispis kvadrata prirodnih brojeva do n unetih sa tastature (while petlja).

        Scanner input=new Scanner(System.in);
        System.out.println("Unesite broj ponavljanja petlje: ");
        int n= input.nextInt();
        int i=0;


        while (i<n){

            System.out.println("Unesitge broj: ");
            int broj= input.nextInt();
            int kvadrat=broj*broj;
            System.out.println("Kvadrat unetog broja je: "+kvadrat);
            i++;
        }

        System.out.println("Kraj programa.");





        }

    }


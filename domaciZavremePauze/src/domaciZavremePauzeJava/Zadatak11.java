package domaciZavremePauzeJava;

import java.util.Scanner;

public class Zadatak11 {
    public static void main(String[] args) {
//        Napisati program koji ce nakon unosa sa
//        tastature ispisati pravougaoni trougao kao na slici sa proizvoljnim brojem redova:


        Scanner input = new Scanner (System.in);
        System.out.println("Unesite broj redova pravouglog trougla.");
        int n=input.nextInt();
        int k=1;


        for(int i=0; i<n;i++){
            for (int j=0;j<k;j++){
                System.out.print("x ");
            }
            k++;
            System.out.print("\n");
        }
    }
}

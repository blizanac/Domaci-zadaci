package domaci10;

import java.util.Scanner;

public class Zadatak1 {
//    Preko skenera uneti godinu, program treba da izracuna da li je godina prestupna.
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.println("Za racunjanje prestupne godine unesite zeljenu godinu");

        int godina=input.nextInt();

        if (godina%4==0 && godina%100!=0 || godina%400==0){
            System.out.println("Godina koju ste uneli je prestupna");
        }else{
            System.out.println("Godina koju ste uneli nije prestupna");}


        input.close();
    }
}

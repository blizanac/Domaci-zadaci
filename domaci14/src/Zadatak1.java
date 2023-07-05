package domaci14;

import java.util.Arrays;
import java.util.Scanner;

public class Zadatak1 {

    public static void main(String[] args) {

//        Napraviti metodu koja ispisuje niz i kao parametre prihvata niz.
//        Unutar metode pronaći najveću vrednost u nizu, a zatim tu vrednost postaviti
//        kao vrednost svakog elementa u nizu.
//        Koristiti scanner za popunjavanje početnog niza. (3-4 puta pozvati metodu).

        Scanner input = new Scanner(System.in);
        System.out.println("Unesite broj elementa niza: ");
        int n = input.nextInt();

        int[] nizC = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Unesite element niza: ");
            nizC[i] = input.nextInt();
        }
        mojNiz(nizC);
    }

    public static void mojNiz(int[] nizA) {
        int max = nizA[0];

        for (int i = 0; i < nizA.length; i++) {

            if (max < nizA[i]) {
                max = nizA[i];
            }
        }

        for (int i = 0; i < nizA.length; i++) {
            nizA[i] = max;
        }
        System.out.println(Arrays.toString(nizA));

    }
}


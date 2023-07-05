package domaciZavremePauzeJava;

public class Zadatak15 {
    public static void main(String[] args) {
        //Napisati program koji ce učitati elemente niza i ispisati elemente niza sa neparnim indeksom.

        int [] niz={1,2,3,4,5,6,7,8,9,10};

        for (int i=0;i< niz.length;i++){

            if (i%2!=0){
                System.out.print(niz[i]+" ");
            }
        }
    }
}

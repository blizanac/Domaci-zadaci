package domaciZavremePauzeJava;

public class Zadatak16 {
    public static void main(String[] args) {
//        Napisati program koji ce učitati elemente niza i ispisati elemente niza u obrnutom redosledu.

        int [] niz={1,2,3,4,5,6,7,8,9,10};

        for ( int i=niz.length-1;i>=0;i--){
            System.out.print(niz[i]+" ");
        }
    }
}

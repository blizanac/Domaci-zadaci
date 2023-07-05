package domaciZavremePauzeJava;

public class Zadatak5 {
    public static void main(String[] args) {
//        Napisati program koji ce prebrojati prirodne brojeve u intervalu od 1 do 50 koji su djeljivi sa 3.


        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Zbir parnih brojeva od 0 do 100 je: "+sum);
    }
}

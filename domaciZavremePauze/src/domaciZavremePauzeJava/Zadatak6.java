package domaciZavremePauzeJava;

public class Zadatak6 {
    public static void main(String[] args) {
//        Napisati program koji ce prebrojati prirodne brojeve u intervalu od 1 do 50 koji su djeljivi sa 3

        int a=1;
        int b=50;
        int brojac=0;
        for (int i=a;i<=b;i++){

            if(i%3==0){
                brojac++;
            }
        }
        System.out.println("U intervalu od 1 do 50 ima "+brojac+" brojeva koji su deljivi sa 3.");
    }
}

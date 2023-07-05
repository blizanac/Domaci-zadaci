package domaci11;

public class Zadatak1 {

//    Napisati for petlju koja ide od 0 do 1000 i prikazuje sve brojeve deljive sa 3.

    public static void main(String[] args) {
        int i = 0;
        while (i <= 1000) {
            if (i % 3 == 0) {
                System.out.println("Brojevi koji su deljivi sa 3 u opsegu od 0 do 1000 su: " +i);
            }
            i++;
        }
    }
}

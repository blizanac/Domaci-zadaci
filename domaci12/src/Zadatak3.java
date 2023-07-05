package domaci12;

public class Zadatak3 {
    public static void main(String[] args) {
//        Kreirati dva niza i prikazati koji niz ima vise elemenata
//        (Ne morate petlju koristiti vec mozete if statement).

        int [] prviNiz = {1,2,3,4,5,6};
        int [] drugiNiz = {1,2,3,4,5,6,7,8};

        if (prviNiz.length>drugiNiz.length){

            System.out.println("Prvi niz je veci od drugog niza. ");

        }else {

            System.out.println("drugi niz je veci od prvog niza. ");
        }
    }
}

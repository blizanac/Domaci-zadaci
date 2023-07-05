package domaci15;

public class Zadatak2 {
    public static void main(String[] args) {

        domaci15.Film film1 = new domaci15.Film();

        film1.ime = "Star Wars Episode IV - A NEW HOPE";
        film1.reziser = "George Lucas";
        film1.godinaObjave = 1978;


        domaci15.Film film2=new domaci15.Film("The Shawshank Redemption","Frank Darabont",1994);


        if(film1.godinaStarosti(film1.godinaObjave)< film2.godinaStarosti(film2.godinaObjave)){
            System.out.println("Film "+film1.ime+" ciji je reziser "+film1.reziser+" je novijeg datuma od filma "+film2.ime+" ciji je reziser "+film2.reziser+".");
        }else{
            System.out.println("Film "+film2.ime+" ciji je reziser "+film2.reziser+" je novijeg datuma od filma "+film1.ime+" ciji je reziser "+film1.reziser+".");
        }

    }
}

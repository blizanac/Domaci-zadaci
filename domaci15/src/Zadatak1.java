package domaci15;
//        Napisati klasu radnik koja ima atribute ime, prezime i godinu zaposlenja.
//        Napraviti metodu koja proverava da li je zaposlen u firmi duze od 10 godina (parametar metode).
//        U main metodi napraviti 3 radnika i za svakog ispisati da li radnik radi više od 10 godina u firmi,

public class Zadatak1 {

    public static void main(String[] args) {

        domaci15.Radnik radnik1=new domaci15.Radnik();
        radnik1.ime="Petar";
        radnik1.prezime="Petrovic";
        radnik1.godinaZaposljenja=2019;

        domaci15.Radnik radnik2=new domaci15.Radnik("Marko","Markovic",2001);
        domaci15.Radnik radnik3=new domaci15.Radnik("Mile","Milenkovic",1994);

        if(radnik1.provera(radnik1.godinaZaposljenja)==true){
            System.out.println("Radnik "+radnik1.ime+" je zaposlen vise od 10 godina u firmi.");
        }else {
            System.out.println("Radnik "+radnik1.ime+" je zaposlen manje od 10 godina u firmi.");
        }

        if(radnik2.provera(radnik2.godinaZaposljenja)==true){
            System.out.println("Radnik "+radnik1.ime+" je zaposlen vise od 10 godina u firmi.");
        }else {
            System.out.println("Radnik "+radnik1.ime+" je zaposlen manje od 10 godina u firmi.");
        }

        if(radnik3.provera(radnik3.godinaZaposljenja)==true){
            System.out.println("Radnik "+radnik1.ime+" je zaposlen vise od 10 godina u firmi.");
        }else {
            System.out.println("Radnik "+radnik1.ime+" je zaposlen manje od 10 godina u firmi.");
        }

    }
}


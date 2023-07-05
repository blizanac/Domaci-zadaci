package domaci17;

import java.util.ArrayList;
import java.util.List;

public class Zadatak1 {
    public static void main(String[] args) {
//        Napraviti apstraktnu klasu koja će da predstavlja životinju.
//        životinja treba da ima ime, nadimak i abstraktnu metodu koja predstavlja zvuk koji životinja pravi.
//        Napraviti klase pas i mačka koje nasleđuju životinju.
//        Pas ima dodatni atribut boolean goodBoy i metodu koja ispisuje “I am a good boy” ili “I am a bad boy”
//        u zavisnosti od toga da li je promenljiva goodBoy true ili false. Mačka ima atribut za težinu i metodu koja i
//        spisuje “I’m a chonk” ili “I’m not a chonk” u zavisnosti da li je težina preko 5kg. U obe klase implementirati
//        toString, gde u oba slučaja se ispisuje ime i nadimak. U klasi mačka dodati na toString da ispisuje još da li je
//        chonk ili nije, a u klasi pas da li je good boy ili ne (u oba slučaja pozivanjem konkretne metode). U konkretnim
//        klasama implementirati metodu za zvuk koji životinja pravi, za mačku da vraća string “meow” a za psa “woof”. I
//        poziv te metode dodati u toString. U main metodi napraviti nekoliko mačaka i pasa. Staviti ih u listu i
//        kroz petlju proći sve elemente, za pse ispisati “dog: “ i dodati od psa toString a ako je mačka
//        napisati “cat: “ i isto toString. Za ovo koristite instanceof.


        Pas pas1 = new Pas("Pas1", "pasic1", true);
        Pas pas2 = new Pas("Pas2", "pasic2", false);
//        System.out.println(pas1);
//        System.out.println(pas2);


        Macka macka1 = new Macka("Macka1", "mackica1", 4);
        Macka macka2 = new Macka("Macka2", "mackica2", 10);
//        System.out.println(macka1);
//        System.out.println(macka2);

        ArrayList<Zivotinja> list1 = new ArrayList();
        list1.add(pas1);
        list1.add(pas2);
        list1.add(macka1);
        list1.add(macka2);

        for (Zivotinja zivotinja : list1) {

            if (zivotinja instanceof Pas) {
                System.out.println("dog: " + zivotinja.toString());
            } else if (zivotinja instanceof Macka) {
                System.out.println("cat: " + zivotinja.toString());
            }
        }
    }
}




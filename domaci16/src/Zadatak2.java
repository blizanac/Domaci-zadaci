package domaci16;


import static domaci16.Valuta.*;

public class Zadatak2 {
    public static void main(String[] args) {
//   Napraviti klasu Konverter koja kao atribute ima rsd i valutu. Valuta je enum, dok je rsd celi broj. Valuta treba da bude jedna od:
//   EUR, USD, AUD, CAD, RUB i GBP. Kroz konstruktor se unose vrednosti za dinare (rsd) i valutu, i postoje seteri, ali ne postoje geteri.
//   Napraviti metodu koja služi za konvertovanje valute u onu koja je prosleđena kroz konstruktor ili seter.
//   Znači rsd pretvara u tu neku valutu. U metodi koristiti iif else ili switch za poređenje. Pogledati kako se porede enum-i u javi najpravilnije.
//   U main-u testirati tako što će te napraviti jedan objekat tipa Konverter i isprobati za sve valute.

        domaci16.Konverter konvertovanje1 = new domaci16.Konverter();
//        Konverter konvertovanje2=new Konverter(1000,AUD);
//        Konverter konvertovanje3=new Konverter(1000,CAD);
//        Konverter konvertovanje4=new Konverter(1000,USD);
//        Konverter konvertovanje5=new Konverter(1000,RUB);
//        Konverter konvertovanje6=new Konverter(1000,GBP);
        konvertovanje1.setRsd(1087.70);
        konvertovanje1.valuta(USD);

        System.out.printf("%.2f\n", konvertovanje1.konvertovanje());
//        System.out.printf("%.2f\n",konvertovanje2.konvertovanje());
//        System.out.printf("%.2f\n",konvertovanje3.konvertovanje());
//        System.out.printf("%.2f\n",konvertovanje4.konvertovanje());
//        System.out.printf("%.2f\n",konvertovanje5.konvertovanje());
//        System.out.printf("%.2f\n",konvertovanje6.konvertovanje());
    }
}
